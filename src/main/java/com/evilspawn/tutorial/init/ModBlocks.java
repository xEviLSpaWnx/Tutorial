package com.evilspawn.tutorial.init;

import com.evilspawn.tutorial.Tutorial;
import com.evilspawn.tutorial.blocks.*;
import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Tutorial.MOD_ID);

    public static void init() {
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    public static final RegistryObject<Block> RUBY_BLOCK = BLOCKS.register("ruby_block", RubyBlock::new);
    public static final RegistryObject<Block> SAPHIRE_BLOCK = BLOCKS.register("saphire_block", SaphireBlock::new);
    public static final RegistryObject<Block> AMETHYST_BLOCK = BLOCKS.register("amethyst_block", AmethystBlock::new);

    public static final RegistryObject<Block> RUBY_ORE = BLOCKS.register("ruby_ore", RubyOre::new);
    public static final RegistryObject<Block> SAPHIRE_ORE = BLOCKS.register("saphire_ore", SaphireOre::new);
    public static final RegistryObject<Block> AMETHYST_ORE = BLOCKS.register("amethyst_ore", AmethystOre::new);

    public static final RegistryObject<Block> OVEN = BLOCKS.register("oven", Oven::new);
}
