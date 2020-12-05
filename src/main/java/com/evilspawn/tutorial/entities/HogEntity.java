package com.evilspawn.tutorial.entities;

import com.evilspawn.tutorial.init.ModEntityTypes;
import net.minecraft.block.BlockState;
import net.minecraft.entity.AgeableEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class HogEntity extends AnimalEntity {

    public static final Ingredient TEMPTATION_ITEM = Ingredient.fromItems(Items.CARROT, Items.BEETROOT, Items.POTATO);

    private EatGrassGoal eatGrassGoal;
    private int hogTimer;

    public HogEntity(EntityType<? extends AnimalEntity> type, World worldIn) {
        super(type, worldIn);
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
        eatGrassGoal = new EatGrassGoal(this);
        this.goalSelector.addGoal(0, new SwimGoal(this));
        this.goalSelector.addGoal(1, new PanicGoal(this, 1.25d));
        this.goalSelector.addGoal(2, new BreedGoal(this, 1.0d));
        this.goalSelector.addGoal(3, new TemptGoal(this, 1.1d, TEMPTATION_ITEM, false));
        this.goalSelector.addGoal(4, new FollowParentGoal(this, 1.1d));
        this.goalSelector.addGoal(5, this.eatGrassGoal);
        this.goalSelector.addGoal(6, new WaterAvoidingRandomWalkingGoal(this, 1.0d));
        this.goalSelector.addGoal(7, new LookAtGoal(this, PlayerEntity.class, 6.0f));
        this.goalSelector.addGoal(8, new LookRandomlyGoal(this));
    }

    /*// HEAD ROTATION FOR SHEEP WHEN HE EATS GRASS //
    @OnlyIn(Dist.CLIENT)
    public float getHeadRotationPointY(float point) {
        if (this.hogTimer <= 0) {
            return 0.0f;
        } else if (this.hogTimer >= 4 && this.hogTimer <= 36) {
            return 1.0f;
        } else {
            return this.hogTimer < 4 ? ((float) this.hogTimer - point) / 4.0f
                    : -((float) (this.hogTimer - 40) -point) / 4.0f;
        }
    }

    @OnlyIn(Dist.CLIENT)
    public float getHeadRotationPointX(float point) {
        if (this.hogTimer > 4 && this.hogTimer <= 36) {
            float f = ((float) (this.hogTimer - 4) - point) / 32.0f;
            return ((float) Math.PI / 5f) + 0.2199114f * MathHelper.sin(f * 28.7f);
        } else {
            return this.hogTimer > 0 ? ((float) Math.PI / 5f) : this.rotationPitch * ((float) Math.PI / 180f);
        }
    }*/

    @Override
    protected int getExperiencePoints(PlayerEntity player) {
        return 1 + this.world.rand.nextInt(4);
    }

    @Override
    protected SoundEvent getAmbientSound() {
        return SoundEvents.ENTITY_PIG_AMBIENT;
    }

    @Override
    protected SoundEvent getDeathSound() {
        return SoundEvents.ENTITY_PIG_DEATH;
    }

    @Override
    protected SoundEvent getHurtSound(DamageSource damageSourceIn) {
        return SoundEvents.ENTITY_PIG_HURT;
    }

    public static AttributeModifierMap.MutableAttribute setCustomAttributes() {
        return MobEntity.func_233666_p_()
                .createMutableAttribute(Attributes.MAX_HEALTH, 12.0d)
                .createMutableAttribute(Attributes.MOVEMENT_SPEED, 0.25d);
    }

    @Override
    protected void playStepSound(BlockPos pos, BlockState blockIn) {
        this.playSound(SoundEvents.ENTITY_PIG_STEP, 0.15f, 1.0f);
    }

    @Override
    public AgeableEntity func_241840_a(ServerWorld serverWorld, AgeableEntity ageableEntity) {
        return ModEntityTypes.HOG.get().create(this.world);
    }

    @Override
    protected void updateAITasks() {
        this.hogTimer = this.eatGrassGoal.getEatingGrassTimer();
        super.updateAITasks();
    }

    @Override
    public void livingTick() {
        if (this.world.isRemote) {
            this.hogTimer = Math.max(0, hogTimer -1);
        }
        super.livingTick();
    }

    @OnlyIn(Dist.CLIENT)
    public void updateStatusUpdate(byte id) {
        if (id == 10) {
            this.hogTimer = 40;
        } else {
            super.handleStatusUpdate(id);
        }
    }


}