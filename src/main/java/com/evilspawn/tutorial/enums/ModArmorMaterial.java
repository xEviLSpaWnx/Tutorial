package com.evilspawn.tutorial.enums;

import com.evilspawn.tutorial.Tutorial;
import com.evilspawn.tutorial.init.ModItems;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.function.Supplier;

public enum ModArmorMaterial implements IArmorMaterial {

    RUBY(Tutorial.MOD_ID + ":ruby", 25, new int[] {2, 5, 6, 2}, 18, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0f, 0.0f, () -> {
        return Ingredient.fromItems(ModItems.RUBY_ITEM.get()); }),

    SAPPHIRE(Tutorial.MOD_ID + ":sapphire", 25, new int[] {2, 5, 6, 2}, 18, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0f, 0.0f, () -> {
        return Ingredient.fromItems(ModItems.SAPPHIRE_ITEM.get()); }),

    AMETHYST(Tutorial.MOD_ID + ":amethyst", 25, new int[] {2, 5, 6, 2}, 18, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0f, 0.0f, () -> {
        return Ingredient.fromItems(ModItems.AMETHYST_ITEM.get()); });

    private static final int[] MAX_DAMAGE_ARRAY = new int[] {11, 16, 15, 13};
    private final String name;
    private final int maxDamageFactor;
    private final int[] damageReductionAmountArray;
    private final int enchantability;
    private final SoundEvent soundEvent;
    private final float toughness;
    private final float knockBackResistance;
    private final Supplier<Ingredient> repairMaterial;

    ModArmorMaterial(String name, int maxDamageFactor, int[] damageReductionAmountArray, int enchantability, SoundEvent soundEvent, float toughness,  float knockBackResistance, Supplier<Ingredient> repairMaterial) {
        this.name = name;
        this.maxDamageFactor = maxDamageFactor;
        this.damageReductionAmountArray = damageReductionAmountArray;
        this.enchantability = enchantability;
        this.soundEvent = soundEvent;
        this.toughness = toughness;
        this.knockBackResistance = knockBackResistance;
        this.repairMaterial = repairMaterial;
    }

    @Override
    public int getDurability(EquipmentSlotType slotIn ) {
        return MAX_DAMAGE_ARRAY[slotIn.getIndex()] * this.maxDamageFactor;
    }

    @Override
    public int getDamageReductionAmount(EquipmentSlotType slotIn) {
        return this.damageReductionAmountArray[slotIn.getIndex()];
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public SoundEvent getSoundEvent() {
        return this.soundEvent;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return this.repairMaterial.get();
    }
    @OnlyIn(Dist.CLIENT)
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockBackResistance;
    }
}
