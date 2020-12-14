package com.evilspawn.tutorial.init;

import com.evilspawn.tutorial.Tutorial;
import com.evilspawn.tutorial.blocks.*;
import net.minecraft.block.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Tutorial.MOD_ID);

    public static final RegistryObject<Block> RUBY_BLOCK = BLOCKS.register("ruby_block", RubyBlock::new);
    public static final RegistryObject<Block> SAPPHIRE_BLOCK = BLOCKS.register("sapphire_block", SapphireBlock::new);
    public static final RegistryObject<Block> AMETHYST_BLOCK = BLOCKS.register("amethyst_block", AmethystBlock::new);
    public static final RegistryObject<Block> RUBY_ORE = BLOCKS.register("ruby_ore", RubyOre::new);
    public static final RegistryObject<Block> SAPPHIRE_ORE = BLOCKS.register("sapphire_ore", SapphireOre::new);
    public static final RegistryObject<Block> AMETHYST_ORE = BLOCKS.register("amethyst_ore", AmethystOre::new);
    public static final RegistryObject<BlockQuarry> QUARRY = BLOCKS.register("quarry", BlockQuarry::new);
    public static final RegistryObject<Block> OVEN = BLOCKS.register("oven", Oven::new);


    public static final RegistryObject<Block> TEST_BLOCK = BLOCKS.register("test_block", TestBlock::new);
    public static final RegistryObject<Block> TEST_BLOCK_FENCE = BLOCKS.register("test_block_fence", () -> new FenceBlock(Block.Properties.from(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> TEST_BLOCK_PRESSURE_PLATE = BLOCKS.register("test_block_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, Block.Properties.from(Blocks.OAK_PRESSURE_PLATE)));
    public static final RegistryObject<Block> TEST_BLOCK_BUTTON = BLOCKS.register("test_block_button", () -> new TestButton(Block.Properties.from(Blocks.OAK_BUTTON)));
    public static final RegistryObject<Block> TEST_BLOCK_STAIRS = BLOCKS.register("test_block_stairs", () -> new StairsBlock(() -> TEST_BLOCK.get().getDefaultState(), Block.Properties.from(Blocks.OAK_STAIRS)));
    public static final RegistryObject<Block> TEST_BLOCK_SLAB = BLOCKS.register("test_block_slab", () -> new SlabBlock(Block.Properties.from(Blocks.OAK_SLAB)));
    public static final RegistryObject<Block> TEST_BLOCK_DOOR = BLOCKS.register("test_block_door", () -> new TestBlockDoor());


   // public static final RegistryObject<Block> SKY_LOG = BLOCKS.register("sky_log", () -> new SkyLogBlock());
    public static final RegistryObject<Block> SKY_PLANKS = BLOCKS.register("sky_planks", () -> new Block(Block.Properties.from(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> SKY_LEAVES = BLOCKS.register("sky_leaves", () -> new LeavesBlock(Block.Properties.from(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Block> SKY_SAPLING = BLOCKS.register("sky_sapling", () -> new SkySaplingBlock(null, Block.Properties.from(Blocks.OAK_SAPLING)));
}
