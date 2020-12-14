package com.evilspawn.tutorial.init;

import com.evilspawn.tutorial.Tutorial;
import com.evilspawn.tutorial.enums.ModArmorMaterial;
import com.evilspawn.tutorial.items.ModSpawnEgg;
import com.evilspawn.tutorial.items.PoisonApple;
import com.evilspawn.tutorial.enums.ModItemTier;
import com.evilspawn.tutorial.items.SpecialCoal;
import com.evilspawn.tutorial.items.SpecialMiniCoal;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Tutorial.MOD_ID);

    public static final RegistryObject<ModSpawnEgg> HOG_SPAWN_EGG_ITEM = ITEMS.register("hog_spawn_egg", () -> new ModSpawnEgg(ModEntityTypes.HOG, 0xF1BF7B, 0x705128, new Item.Properties().group(Tutorial.TAB)));

    public static final RegistryObject<Item> RUBY_ITEM = ITEMS.register("ruby", () -> new Item(new Item.Properties().group(Tutorial.TAB)));
    public static final RegistryObject<Item> SAPPHIRE_ITEM = ITEMS.register("sapphire", () -> new Item(new Item.Properties().group(Tutorial.TAB)));
    public static final RegistryObject<Item> AMETHYST_ITEM = ITEMS.register("amethyst", () -> new Item(new Item.Properties().group(Tutorial.TAB)));


    public static final RegistryObject<PoisonApple> POISON_APPLE_ITEM = ITEMS.register("poison_apple", PoisonApple::new);
    public static final RegistryObject<SpecialCoal> SPECIAL_COAL_ITEM = ITEMS.register("special_coal", SpecialCoal::new);
    public static final RegistryObject<SpecialMiniCoal> SPECIAL_MINI_COAL = ITEMS.register("special_mini_coal", SpecialMiniCoal::new);
    public static final RegistryObject<Item> OVEN_ITEM = ITEMS.register("oven", () -> new BlockItem(ModBlocks.OVEN.get(), new Item.Properties().group(Tutorial.TAB)));
    public static final RegistryObject<Item> QUARRY_ITEM = ITEMS.register("quarry", () -> new BlockItem(ModBlocks.QUARRY.get(), new Item.Properties().group(Tutorial.TAB)));
    public static final RegistryObject<Item> TEST_BLOCK_ITEM = ITEMS.register("test_block", () -> new BlockItem(ModBlocks.TEST_BLOCK.get(), new Item.Properties().group(Tutorial.TAB)));
    public static final RegistryObject<Item> TEST_BLOCK_FENCE_ITEM = ITEMS.register("test_block_fence", () -> new BlockItem(ModBlocks.TEST_BLOCK_FENCE.get(), new Item.Properties().group(Tutorial.TAB)));
    public static final RegistryObject<Item> TEST_BLOCK_PRESSURE_PLATE_ITEM = ITEMS.register("test_block_pressure_plate", () -> new BlockItem(ModBlocks.TEST_BLOCK_PRESSURE_PLATE.get(), new Item.Properties().group(Tutorial.TAB)));
    public static final RegistryObject<Item> TEST_BLOCK_BUTTON_ITEM = ITEMS.register("test_block_button", () -> new BlockItem(ModBlocks.TEST_BLOCK_BUTTON.get(), new Item.Properties().group(Tutorial.TAB)));

    public static final RegistryObject<Item> TEST_BLOCK_SLAB_ITEM = ITEMS.register("test_block_slab", () -> new BlockItem(ModBlocks.TEST_BLOCK_SLAB.get(), new Item.Properties().group(Tutorial.TAB)));

    public static final RegistryObject<Item> TEST_BLOCK_STAIRS_ITEM = ITEMS.register("test_block_stairs", () -> new BlockItem(ModBlocks.TEST_BLOCK_STAIRS.get(), new Item.Properties().group(Tutorial.TAB)));
    public static final RegistryObject<Item> TEST_BLOCK_DOOR_ITEM = ITEMS.register("test_block_door", () -> new BlockItem(ModBlocks.TEST_BLOCK_DOOR.get(), new Item.Properties().group(Tutorial.TAB)));

    public static final RegistryObject<Item> RUBY_BLOCK_ITEM = ITEMS.register("ruby_block", () -> new BlockItem(ModBlocks.RUBY_BLOCK.get(), new Item.Properties().group(Tutorial.TAB)));
    public static final RegistryObject<Item> SAPPHIRE_BLOCK_ITEM = ITEMS.register("sapphire_block", () -> new BlockItem(ModBlocks.SAPPHIRE_BLOCK.get(), new Item.Properties().group(Tutorial.TAB)));
    public static final RegistryObject<Item> AMETHYST_BLOCK_ITEM = ITEMS.register("amethyst_block", () -> new BlockItem(ModBlocks.AMETHYST_BLOCK.get(), new Item.Properties().group(Tutorial.TAB)));

    // ORE BLOCKS //
    public static final RegistryObject<Item> RUBY_ORE_ITEM = ITEMS.register("ruby_ore", () -> new BlockItem(ModBlocks.RUBY_ORE.get(), new Item.Properties().group(Tutorial.TAB)));
    public static final RegistryObject<Item> SAPPHIRE_ORE_ITEM = ITEMS.register("sapphire_ore", () -> new BlockItem(ModBlocks.SAPPHIRE_ORE.get(), new Item.Properties().group(Tutorial.TAB)));
    public static final RegistryObject<Item> AMETHYST_ORE_ITEM = ITEMS.register("amethyst_ore", () -> new BlockItem(ModBlocks.AMETHYST_ORE.get(), new Item.Properties().group(Tutorial.TAB)));

    /// TOOL SETS ///
    // RUBY TOOLS //
    public static final RegistryObject<SwordItem> RUBY_SWORD_ITEM = ITEMS.register("ruby_sword", () -> new SwordItem(ModItemTier.RUBY, 3, -2.4f, new Item.Properties().group(Tutorial.TAB)));
    public static final RegistryObject<PickaxeItem> RUBY_PICKAXE_ITEM = ITEMS.register("ruby_pickaxe", () -> new PickaxeItem(ModItemTier.RUBY, 0, -2.8f, new Item.Properties().group(Tutorial.TAB)));
    public static final RegistryObject<AxeItem> RUBY_AXE_ITEM = ITEMS.register("ruby_axe", () -> new AxeItem(ModItemTier.RUBY, 5, -3.1f, new Item.Properties().group(Tutorial.TAB)));
    public static final RegistryObject<ShovelItem> RUBY_SHOVEL_ITEM = ITEMS.register("ruby_shovel", () -> new ShovelItem(ModItemTier.RUBY, 0.5f, -3.0f, new Item.Properties().group(Tutorial.TAB)));
    public static final RegistryObject<HoeItem> RUBY_HOE_ITEM = ITEMS.register("ruby_hoe", () -> new HoeItem(ModItemTier.RUBY, -3, -1.0f, new Item.Properties().group(Tutorial.TAB)));
    // SAPHIRE TOOLS //
    public static final RegistryObject<SwordItem> SAPPHIRE_SWORD_ITEM = ITEMS.register("sapphire_sword", () -> new SwordItem(ModItemTier.SAPPHIRE, 3, -2.4f, new Item.Properties().group(Tutorial.TAB)));
    public static final RegistryObject<PickaxeItem> SAPPHIRE_PICKAXE_ITEM = ITEMS.register("sapphire_pickaxe", () -> new PickaxeItem(ModItemTier.SAPPHIRE, 0, -2.8f, new Item.Properties().group(Tutorial.TAB)));
    public static final RegistryObject<AxeItem> SAPPHIRE_AXE_ITEM = ITEMS.register("sapphire_axe", () -> new AxeItem(ModItemTier.SAPPHIRE, 5, -3.1f, new Item.Properties().group(Tutorial.TAB)));
    public static final RegistryObject<ShovelItem> SAPPHIRE_SHOVEL_ITEM = ITEMS.register("sapphire_shovel", () -> new ShovelItem(ModItemTier.SAPPHIRE, 0.5f, -3.0f, new Item.Properties().group(Tutorial.TAB)));
    public static final RegistryObject<HoeItem> SAPPHIRE_HOE = ITEMS.register("sapphire_hoe", () -> new HoeItem(ModItemTier.SAPPHIRE, -3, -1.0f, new Item.Properties().group(Tutorial.TAB)));
    // AMETHYST TOOLS //
    public static final RegistryObject<SwordItem> AMETHYST_SWORD_ITEM = ITEMS.register("amethyst_sword", () -> new SwordItem(ModItemTier.AMETHYST, 3, -2.4f, new Item.Properties().group(Tutorial.TAB)));
    public static final RegistryObject<PickaxeItem> AMETHYST_PICKAXE_ITEM = ITEMS.register("amethyst_pickaxe", () -> new PickaxeItem(ModItemTier.AMETHYST, 0, -2.8f, new Item.Properties().group(Tutorial.TAB)));
    public static final RegistryObject<AxeItem> AMETHYST_AXE_ITEM = ITEMS.register("amethyst_axe", () -> new AxeItem(ModItemTier.AMETHYST, 5, -3.1f, new Item.Properties().group(Tutorial.TAB)));
    public static final RegistryObject<ShovelItem> AMETHYST_SHOVEL_ITEM = ITEMS.register("amethyst_shovel", () -> new ShovelItem(ModItemTier.AMETHYST, 0.5f, -3.0f, new Item.Properties().group(Tutorial.TAB)));
    public static final RegistryObject<HoeItem> AMETHYST_HOE_ITEM = ITEMS.register("amethyst_hoe", () -> new HoeItem(ModItemTier.AMETHYST, -3, -1.0f, new Item.Properties().group(Tutorial.TAB)));

    /// ARMOR SETS ///
    // RUBY ARMOR //
    public static final RegistryObject<ArmorItem> RUBY_HELMET_ITEM = ITEMS.register("ruby_helmet", () -> new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.HEAD, new Item.Properties().group(Tutorial.TAB)));
    public static final RegistryObject<ArmorItem> RUBY_CHESTPLATE_ITEM = ITEMS.register("ruby_chestplate", () -> new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.CHEST, new Item.Properties().group(Tutorial.TAB)));
    public static final RegistryObject<ArmorItem> RUBY_LEGGINGS_ITEM = ITEMS.register("ruby_leggings", () -> new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.LEGS, new Item.Properties().group(Tutorial.TAB)));
    public static final RegistryObject<ArmorItem> RUBY_BOOTS_ITEM = ITEMS.register("ruby_boots", () -> new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.FEET, new Item.Properties().group(Tutorial.TAB)));
    // SAPHIRE ARMOR //
    public static final RegistryObject<ArmorItem> SAPPHIRE_HELMET_ITEM = ITEMS.register("sapphire_helmet", () -> new ArmorItem(ModArmorMaterial.SAPPHIRE, EquipmentSlotType.HEAD, new Item.Properties().group(Tutorial.TAB)));
    public static final RegistryObject<ArmorItem> SAPPHIRE_CHESTPLATE_ITEM = ITEMS.register("sapphire_chestplate", () -> new ArmorItem(ModArmorMaterial.SAPPHIRE, EquipmentSlotType.CHEST, new Item.Properties().group(Tutorial.TAB)));
    public static final RegistryObject<ArmorItem> SAPPHIRE_LEGGINGS_ITEM = ITEMS.register("sapphire_leggings", () -> new ArmorItem(ModArmorMaterial.SAPPHIRE, EquipmentSlotType.LEGS, new Item.Properties().group(Tutorial.TAB)));
    public static final RegistryObject<ArmorItem> SAPPHIRE_BOOTS_ITEM = ITEMS.register("sapphire_boots", () -> new ArmorItem(ModArmorMaterial.SAPPHIRE, EquipmentSlotType.FEET, new Item.Properties().group(Tutorial.TAB)));
    // AMETHYST ARMOR //
    public static final RegistryObject<ArmorItem> AMETHYST_HELMET_ITEM = ITEMS.register("amethyst_helmet", () -> new ArmorItem(ModArmorMaterial.AMETHYST, EquipmentSlotType.HEAD, new Item.Properties().group(Tutorial.TAB)));
    public static final RegistryObject<ArmorItem> AMETHYST_CHESTPLATE_ITEM = ITEMS.register("amethyst_chestplate", () -> new ArmorItem(ModArmorMaterial.AMETHYST, EquipmentSlotType.CHEST, new Item.Properties().group(Tutorial.TAB)));
    public static final RegistryObject<ArmorItem> AMETHYST_LEGGINGS_ITEM = ITEMS.register("amethyst_leggings", () -> new ArmorItem(ModArmorMaterial.AMETHYST, EquipmentSlotType.LEGS, new Item.Properties().group(Tutorial.TAB)));
    public static final RegistryObject<ArmorItem> AMETHYST_BOOTS_ITEM = ITEMS.register("amethyst_boots", () -> new ArmorItem(ModArmorMaterial.AMETHYST, EquipmentSlotType.FEET, new Item.Properties().group(Tutorial.TAB)));


   // public static final RegistryObject<Item> SKY_LOG_ITEM = ITEMS.register("sky_log", () -> new BlockItem(ModBlocks.SKY_LOG.get(), new Item.Properties().group(Tutorial.TAB)));
    public static final RegistryObject<Item> SKY_PLANKS_ITEM = ITEMS.register("sky_planks", () -> new BlockItem(ModBlocks.SKY_PLANKS.get(), new Item.Properties().group(Tutorial.TAB)));
    public static final RegistryObject<Item> SKY_LEAVES_ITEM = ITEMS.register("sky_leaves", () -> new BlockItem(ModBlocks.SKY_LEAVES.get(), new Item.Properties().group(Tutorial.TAB)));
    public static final RegistryObject<Item> SKY_SAPLING_ITEM = ITEMS.register("sky_sapling", () -> new BlockItem(ModBlocks.SKY_SAPLING.get(), new Item.Properties().group(Tutorial.TAB)));

}
