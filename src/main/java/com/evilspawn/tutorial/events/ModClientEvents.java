package com.evilspawn.tutorial.events;

import com.evilspawn.tutorial.Tutorial;
import com.evilspawn.tutorial.init.ModBlocks;
import com.evilspawn.tutorial.init.ModItems;
import net.minecraft.block.SoundType;
import net.minecraft.client.gui.screen.inventory.CraftingScreen;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.passive.SheepEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Items;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.GuiOpenEvent;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.event.entity.player.AttackEntityEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Tutorial.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)

public class ModClientEvents {
/*
    @SubscribeEvent
    public static void onJumpWithStick(LivingEvent.LivingJumpEvent event) {
        LivingEntity player = event.getEntityLiving();
        if(player.getHeldItemMainhand().getItem() == Items.STICK) {
            Tutorial.LOGGER.info("Player tried to jump with a stick");
            World world = player.getEntityWorld();
            world.setBlockState(player.getPosition().add(0, -1, 0), ModBlocks.RUBY_BLOCK.get().getDefaultState());
            player.playSound(SoundEvents.BLOCK_STONE_PLACE,1.0f, 1.0f);
        }
    }

    @SubscribeEvent
    // Poisons a sheep and gives them gloawing effect when you hit them

    public static void onHitSheep(AttackEntityEvent event) {
        if (event.getEntityLiving().getHeldItemMainhand().getItem() == ModItems.POISON_APPLE.get()) {

            if (event.getTarget().isAlive()) {
                LivingEntity target = (LivingEntity) event.getTarget();

                if (target instanceof SheepEntity) {
                    PlayerEntity player = event.getPlayer();
                    target.addPotionEffect(new EffectInstance(Effects.POISON, 10*20));
                    target.setGlowing(true);

                    if (!event.getPlayer().getEntityWorld().isRemote) {
                        String msg = TextFormatting.RED + "He dont feel so well...";
                        player.sendMessage(new StringTextComponent(msg), player.getUniqueID());
                    }
                }
            }
        }
    }

    @SubscribeEvent
    public static void onCraftingTableOpen(GuiOpenEvent event) {
        if (event.isCancelable()) {
            if (event.getGui() instanceof CraftingScreen) {
                event.setCanceled(true);
                Tutorial.LOGGER.info("Player tried to open crafting table");
            }
        }
    }
 */
}