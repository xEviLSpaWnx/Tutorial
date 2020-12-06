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

    public static final RegistryObject<ModSpawnEgg> HOG_SPAWN_EGG = ITEMS.register("hog_spawn_egg",
            () -> new ModSpawnEgg(ModEntityTypes.HOG, 0xF1BF7B, 0x705128, new Item.Properties().group(Tutorial.TAB)));

    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", () -> new Item(new Item.Properties().group(Tutorial.TAB)));
    public static final RegistryObject<Item> SAPHIRE = ITEMS.register("saphire", () -> new Item(new Item.Properties().group(Tutorial.TAB)));
    public static final RegistryObject<Item> AMETHYST = ITEMS.register("amethyst", () -> new Item(new Item.Properties().group(Tutorial.TAB)));


    public static final RegistryObject<PoisonApple> POISON_APPLE = ITEMS.register("poison_apple", PoisonApple::new);
    public static final RegistryObject<SpecialCoal> SPECIAL_COAL = ITEMS.register("special_coal", SpecialCoal::new);
    public static final RegistryObject<SpecialMiniCoal> SPECIAL_MINI_COAL = ITEMS.register("special_mini_coal", SpecialMiniCoal::new);
    public static final RegistryObject<Item> OVEN_ITEM = ITEMS.register("oven", () -> new BlockItem(ModBlocks.OVEN.get(), new Item.Properties().group(Tutorial.TAB)));
    public static final RegistryObject<Item> QUARRY_ITEM = ITEMS.register("quarry", () -> new BlockItem(ModBlocks.QUARRY.get(), new Item.Properties().group(Tutorial.TAB)));

    public static final RegistryObject<Item> RUBY_BLOCK_ITEM = ITEMS.register("ruby_block", () -> new BlockItem(ModBlocks.RUBY_BLOCK.get(), new Item.Properties().group(Tutorial.TAB)));
    public static final RegistryObject<Item> SAPHIRE_BLOCK_ITEM = ITEMS.register("saphire_block", () -> new BlockItem(ModBlocks.SAPHIRE_BLOCK.get(), new Item.Properties().group(Tutorial.TAB)));
    public static final RegistryObject<Item> AMETHYST_BLOCK_ITEM = ITEMS.register("amethyst_block", () -> new BlockItem(ModBlocks.AMETHYST_BLOCK.get(), new Item.Properties().group(Tutorial.TAB)));


    // ORE BLOCKS //
    public static final RegistryObject<Item> RUBY_ORE_ITEM = ITEMS.register("ruby_ore", () -> new BlockItem(ModBlocks.RUBY_ORE.get(), new Item.Properties().group(Tutorial.TAB)));
    public static final RegistryObject<Item> SAPHIRE_ORE_ITEM = ITEMS.register("saphire_ore", () -> new BlockItem(ModBlocks.SAPHIRE_ORE.get(), new Item.Properties().group(Tutorial.TAB)));
    public static final RegistryObject<Item> AMETHYST_ORE_ITEM = ITEMS.register("amethyst_ore", () -> new BlockItem(ModBlocks.AMETHYST_ORE.get(), new Item.Properties().group(Tutorial.TAB)));


    // RUBY TOOLS //
    public static final RegistryObject<SwordItem> RUBY_SWORD = ITEMS.register("ruby_sword", () -> new SwordItem(ModItemTier.RUBY, 3, -2.4f, new Item.Properties().group(Tutorial.TAB)));
    public static final RegistryObject<PickaxeItem> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe", () -> new PickaxeItem(ModItemTier.RUBY, 0, -2.8f, new Item.Properties().group(Tutorial.TAB)));
    public static final RegistryObject<AxeItem> RUBY_AXE = ITEMS.register("ruby_axe", () -> new AxeItem(ModItemTier.RUBY, 5, -3.1f, new Item.Properties().group(Tutorial.TAB)));
    public static final RegistryObject<ShovelItem> RUBY_SHOVEL = ITEMS.register("ruby_shovel", () -> new ShovelItem(ModItemTier.RUBY, 0.5f, -3.0f, new Item.Properties().group(Tutorial.TAB)));
    public static final RegistryObject<HoeItem> RUBY_HOE = ITEMS.register("ruby_hoe", () -> new HoeItem(ModItemTier.RUBY, -3, -1.0f, new Item.Properties().group(Tutorial.TAB)));

    public static final RegistryObject<SwordItem> SAPHIRE_SWORD = ITEMS.register("saphire_sword", () -> new SwordItem(ModItemTier.SAPHIRE, 3, -2.4f, new Item.Properties().group(Tutorial.TAB)));
    public static final RegistryObject<PickaxeItem> SAPHIRE_PICKAXE = ITEMS.register("saphire_pickaxe", () -> new PickaxeItem(ModItemTier.SAPHIRE, 0, -2.8f, new Item.Properties().group(Tutorial.TAB)));
    public static final RegistryObject<AxeItem> SAPHIRE_AXE = ITEMS.register("saphire_axe", () -> new AxeItem(ModItemTier.SAPHIRE, 5, -3.1f, new Item.Properties().group(Tutorial.TAB)));
    public static final RegistryObject<ShovelItem> SAPHIRE_SHOVEL = ITEMS.register("saphire_shovel", () -> new ShovelItem(ModItemTier.SAPHIRE, 0.5f, -3.0f, new Item.Properties().group(Tutorial.TAB)));
    public static final RegistryObject<HoeItem> SAPHIRE_HOE = ITEMS.register("saphire_hoe", () -> new HoeItem(ModItemTier.SAPHIRE, -3, -1.0f, new Item.Properties().group(Tutorial.TAB)));

    public static final RegistryObject<SwordItem> AMETHYST_SWORD = ITEMS.register("amethyst_sword", () -> new SwordItem(ModItemTier.AMETHYST, 3, -2.4f, new Item.Properties().group(Tutorial.TAB)));
    public static final RegistryObject<PickaxeItem> AMETHYST_PICKAXE = ITEMS.register("amethyst_pickaxe", () -> new PickaxeItem(ModItemTier.AMETHYST, 0, -2.8f, new Item.Properties().group(Tutorial.TAB)));
    public static final RegistryObject<AxeItem> AMETHYST_AXE = ITEMS.register("amethyst_axe", () -> new AxeItem(ModItemTier.AMETHYST, 5, -3.1f, new Item.Properties().group(Tutorial.TAB)));
    public static final RegistryObject<ShovelItem> AMETHYST_SHOVEL = ITEMS.register("amethyst_shovel", () -> new ShovelItem(ModItemTier.AMETHYST, 0.5f, -3.0f, new Item.Properties().group(Tutorial.TAB)));
    public static final RegistryObject<HoeItem> AMETHYST_HOE = ITEMS.register("amethyst_hoe", () -> new HoeItem(ModItemTier.AMETHYST, -3, -1.0f, new Item.Properties().group(Tutorial.TAB)));


    // RUBY ARMOR //
    public static final RegistryObject<ArmorItem> RUBY_HELMET = ITEMS.register("ruby_helmet", () -> new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.HEAD, new Item.Properties().group(Tutorial.TAB)));
    public static final RegistryObject<ArmorItem> RUBY_CHESTPLATE = ITEMS.register("ruby_chestplate", () -> new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.CHEST, new Item.Properties().group(Tutorial.TAB)));
    public static final RegistryObject<ArmorItem> RUBY_LEGGINGS = ITEMS.register("ruby_leggings", () -> new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.LEGS, new Item.Properties().group(Tutorial.TAB)));
    public static final RegistryObject<ArmorItem> RUBY_BOOTS = ITEMS.register("ruby_boots", () -> new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.FEET, new Item.Properties().group(Tutorial.TAB)));

    public static final RegistryObject<ArmorItem> SAPHIRE_HELMET = ITEMS.register("saphire_helmet", () -> new ArmorItem(ModArmorMaterial.SAPHIRE, EquipmentSlotType.HEAD, new Item.Properties().group(Tutorial.TAB)));
    public static final RegistryObject<ArmorItem> SAPHIRE_CHESTPLATE = ITEMS.register("saphire_chestplate", () -> new ArmorItem(ModArmorMaterial.SAPHIRE, EquipmentSlotType.CHEST, new Item.Properties().group(Tutorial.TAB)));
    public static final RegistryObject<ArmorItem> SAPHIRE_LEGGINGS = ITEMS.register("saphire_leggings", () -> new ArmorItem(ModArmorMaterial.SAPHIRE, EquipmentSlotType.LEGS, new Item.Properties().group(Tutorial.TAB)));
    public static final RegistryObject<ArmorItem> SAPHIRE_BOOTS = ITEMS.register("saphire_boots", () -> new ArmorItem(ModArmorMaterial.SAPHIRE, EquipmentSlotType.FEET, new Item.Properties().group(Tutorial.TAB)));

    public static final RegistryObject<ArmorItem> AMETHYST_HELMET = ITEMS.register("amethyst_helmet", () -> new ArmorItem(ModArmorMaterial.AMETHYST, EquipmentSlotType.HEAD, new Item.Properties().group(Tutorial.TAB)));
    public static final RegistryObject<ArmorItem> AMETHYST_CHESTPLATE = ITEMS.register("amethyst_chestplate", () -> new ArmorItem(ModArmorMaterial.AMETHYST, EquipmentSlotType.CHEST, new Item.Properties().group(Tutorial.TAB)));
    public static final RegistryObject<ArmorItem> AMETHYST_LEGGINGS = ITEMS.register("amethyst_leggings", () -> new ArmorItem(ModArmorMaterial.AMETHYST, EquipmentSlotType.LEGS, new Item.Properties().group(Tutorial.TAB)));
    public static final RegistryObject<ArmorItem> AMETHYST_BOOTS = ITEMS.register("amethyst_boots", () -> new ArmorItem(ModArmorMaterial.AMETHYST, EquipmentSlotType.FEET, new Item.Properties().group(Tutorial.TAB)));

}
