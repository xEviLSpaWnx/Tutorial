package com.evilspawn.tutorial.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class TestBlock extends Block {

    public TestBlock() {
        super(Block.Properties.create(Material.WOOD)
                .hardnessAndResistance(4.0f, 6.0f)
                .harvestTool(ToolType.AXE)
                .harvestLevel(1)
                .setRequiresTool()
        );
    }
}
