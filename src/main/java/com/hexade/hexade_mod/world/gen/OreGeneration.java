package com.hexade.hexade_mod.world.gen;

import com.hexade.hexade_mod.blocks.ModBlocks;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;


public class OreGeneration
{
    public static final ConfiguredFeature<?, ?> beryl_ore = Feature.ORE.configured(
            new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.BERYL_ORE.get().defaultBlockState(), 3)) //vein size
            .range(16).squared() //maximum y level where ore can spawn
            .count(1); //how many veins maximum per chunck

    public static void generateOre(final BiomeLoadingEvent event) {
        BiomeGenerationSettingsBuilder generation = event.getGeneration();
        generation.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, beryl_ore);
    }
}

