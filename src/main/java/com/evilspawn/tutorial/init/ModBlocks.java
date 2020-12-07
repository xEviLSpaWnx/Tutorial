package com.evilspawn.tutorial.init;

import com.evilspawn.tutorial.Tutorial;
import com.evilspawn.tutorial.blocks.*;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Tutorial.MOD_ID);

    public static final RegistryObject<Block> RUBY_BLOCK = BLOCKS.register("ruby_block", RubyBlock::new);
    public static final RegistryObject<Block> SAPHIRE_BLOCK = BLOCKS.register("saphire_block", SaphireBlock::new);
    public static final RegistryObject<Block> AMETHYST_BLOCK = BLOCKS.register("amethyst_block", AmethystBlock::new);

    public static final RegistryObject<Block> RUBY_ORE = BLOCKS.register("ruby_ore", RubyOre::new);
    public static final RegistryObject<Block> SAPHIRE_ORE = BLOCKS.register("saphire_ore", SaphireOre::new);
    public static final RegistryObject<Block> AMETHYST_ORE = BLOCKS.register("amethyst_ore", AmethystOre::new);

    public static final RegistryObject<BlockQuarry> QUARRY = BLOCKS.register("quarry", BlockQuarry::new);

    public static final RegistryObject<Block> OVEN = BLOCKS.register("oven", Oven::new);

    public static final RegistryObject<Block> TEST_BLOCK = BLOCKS.register("test_block", TestBlock::new);
    public static final RegistryObject<Block> TEST_BLOCK_FENCE = BLOCKS.register("test_block_fence",
            () -> new FenceBlock(Block.Properties.create(Material.WOOD, MaterialColor.GOLD)));
    public static final RegistryObject<Block> TEST_BLOCK_PRESSURE_PLATE = BLOCKS.register("test_block_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, Block.Properties.create(Material.WOOD, MaterialColor.GOLD)));
    public static final RegistryObject<Block> TEST_BLOCK_BUTTON = BLOCKS.register("test_block_button",
            () -> new TestButton(Block.Properties.create(Material.WOOD, MaterialColor.GOLD)));
    public static final RegistryObject<Block> TEST_BLOCK_STAIRS = BLOCKS.register("test_block_stairs",
            () -> new StairsBlock(() -> TEST_BLOCK.get().getDefaultState(), Block.Properties.create(Material.WOOD, MaterialColor.GOLD)));
}
