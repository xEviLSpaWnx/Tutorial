package com.evilspawn.tutorial.tileentity;

import com.evilspawn.tutorial.init.ModTileEntityTypes;
import com.evilspawn.tutorial.utils.NBTHelper;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.NBTUtil;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.common.extensions.IForgeFluidState;
import net.minecraftforge.common.util.Constants;

public class QuarryTileEntity extends TileEntity implements ITickableTileEntity {

    public int x, y, z, tick;
    boolean initialised = false;

    public QuarryTileEntity(TileEntityType<?> tileEntityTypeIn) {
        super(tileEntityTypeIn);
    }

    public QuarryTileEntity() {
        this(ModTileEntityTypes.QUARRY.get());
    }

    @Override
    public void tick() {
        if (!initialised) init();
        tick++;
        if (tick == 40) {
            tick = 0;
            if (y > 2) execute();
        }
    }

    private void init() {
        initialised = true;
        x = this.pos.getX() - 1;
        y = this.pos.getY() - 1;
        z = this.pos.getZ() - 1;
        tick = 0;
    }

    private void execute() {
        int index = 0;
        Block[] blocksRemoved = new Block[9];
        for (int x = 0; x < 3; x++) {
            for (int z = 0; z < 3; z++) {
                BlockPos posToBreak = new BlockPos(this.x + x, this.y, this.z + z);
                blocksRemoved[index] = this.world.getBlockState(posToBreak).getBlock();
                destroyBlock(posToBreak, true, null);
                index++;
            }
        }
        this.y--;
    }

    private boolean destroyBlock(BlockPos pos, boolean dropBlock, Entity entity) {
        BlockState blockState = world.getBlockState(pos);
        if (blockState.isAir(world, pos)) return false;
        else {
            IForgeFluidState ifluidState = world.getFluidState(pos);
            world.playEvent(2001, pos, Block.getStateId(blockState));
            if (dropBlock) {
                TileEntity tileEntity = blockState.hasTileEntity() ? world.getTileEntity(pos) : null;
                Block.spawnDrops(blockState, world, this.pos.add(0, 1.5, 0), tileEntity, entity, ItemStack.EMPTY);
            }
            return world.setBlockState(pos, ifluidState.getFluidState().getBlockState(), 3);
        }
    }

    @Override
    public CompoundNBT write(CompoundNBT compound) {
        compound.put("initvalues", NBTHelper.toNBT(this));
        return super.write(compound);
    }


    @Override
    public void read(BlockState state, CompoundNBT compound) {
        super.read(state, compound);
        CompoundNBT initValues = compound.getCompound("initvalues");
        if (initValues != null) {
            this.y = initValues.getInt("x");
            this.y = initValues.getInt("y");
            this.z = initValues.getInt("z");
            this.tick = 0;
            initialised = true;
            return;
        }
        init();
    }
}
