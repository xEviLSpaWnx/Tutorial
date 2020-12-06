package com.evilspawn.tutorial.items;

import com.evilspawn.tutorial.Tutorial;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

public class SpecialCoal extends Item {
    public SpecialCoal() {
        super(new Item.Properties().group(Tutorial.TAB)
                .maxStackSize(16));
    }

    @Override
    public int getBurnTime(ItemStack itemStack) {
        return 300;
    }

    @Override
    public boolean hasEffect(ItemStack stack) {
        return true;
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
        playerIn.addPotionEffect(new EffectInstance(Effects.FIRE_RESISTANCE, 200, 2));
        return super.onItemRightClick(worldIn, playerIn, handIn);
    }
}
