package com.evilspawn.tutorial.blocks;

import com.evilspawn.tutorial.init.ModTileEntityTypes;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.common.ToolType;

public class BlockQuarry extends Block {

    public BlockQuarry() {
        super(Block.Properties.create(Material.IRON)
                .hardnessAndResistance(4.0f, 6.0f)
                .harvestTool(ToolType.PICKAXE)
                .harvestLevel(1)
                .setRequiresTool());
    }

    @Override
    public boolean hasTileEntity(BlockState state) {
        return true;
    }

    @Override
    public TileEntity createTileEntity(BlockState state, IBlockReader world) {
        return ModTileEntityTypes.QUARRY.get().create();
    }
}