package com.evilspawn.tutorial.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.DoorBlock;

public class TestBlockDoor extends DoorBlock {

    public TestBlockDoor() {
        super(Block.Properties.from(Blocks.OAK_DOOR));
    }
}
