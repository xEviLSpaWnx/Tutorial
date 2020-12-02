package com.evilspawn.tutorial.items;

import com.evilspawn.tutorial.Tutorial;
import net.minecraft.item.Item;

public class ItemBase extends Item {
    public ItemBase() {
        super(new Properties().group(Tutorial.TAB));
    }
}
