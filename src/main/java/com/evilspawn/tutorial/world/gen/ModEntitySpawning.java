package com.evilspawn.tutorial.world.gen;

import com.evilspawn.tutorial.Tutorial;
import com.evilspawn.tutorial.init.ModEntityTypes;
import net.minecraft.entity.EntityClassification;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.MobSpawnInfo;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Tutorial.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ModEntitySpawning {

    @SubscribeEvent
    public static void onBiomeLoading(BiomeLoadingEvent e) {
        if (e.getCategory() != Biome.Category.THEEND && e.getCategory() != Biome.Category.OCEAN) {
            e.getSpawns().withSpawner(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(ModEntityTypes.HOG.get(), 20, 2, 4));
        }
    }
}