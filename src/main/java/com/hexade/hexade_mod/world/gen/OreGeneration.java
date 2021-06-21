package com.hexade.hexade_mod.world.gen;

import com.hexade.hexade_mod.Hexademod;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraftforge.fml.common.Mod;

import java.util.ArrayList;

@Mod.EventBusSubscriber
public class OreGeneration
{
    private static final ArrayList<ConfiguredFeature<?, ?>> overworldOres = new ArrayList<ConfiguredFeature<?, ?>>();
    private static final ArrayList<ConfiguredFeature<?, ?>> netherOres = new ArrayList<ConfiguredFeature<?, ?>>();
    private static final ArrayList<ConfiguredFeature<?, ?>> endOres = new ArrayList<ConfiguredFeature<?, ?>>();

    public static void registerOre()
    {

    }

    private static <FC extends IFeatureConfig> ConfiguredFeature<FC, ?> register(String name, ConfiguredFeature<FC, ?> configuredFeature)
    {
        return Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, Hexademod.MOD_ID + ":" + name, configuredFeature);
    }

}
