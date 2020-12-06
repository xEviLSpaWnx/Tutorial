package com.evilspawn.tutorial.items;

import com.evilspawn.tutorial.Tutorial;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

import java.util.function.Supplier;

public class PoisonApple extends Item {

    public PoisonApple() {
        super(new Item.Properties().group(Tutorial.TAB)
                .food(new Food.Builder()
                        .hunger(4)
                        .saturation(1.2f)
                        .setAlwaysEdible()
                        .effect(new EffectInstance(Effects.NAUSEA, 200, 0), 1)
                        .effect(new EffectInstance(Effects.POISON, 200, 1), 1)
                        .effect(new EffectInstance(Effects.HUNGER, 100, 0), 0.3f)
                        .build())
        );
    }
}
