package com.hexade.hexade_mod.data;

import com.hexade.hexade_mod.Hexademod;
import com.hexade.hexade_mod.data.client.ModItemModelProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = Hexademod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public final class DataGenerators
{
    private DataGenerators() {}

    public static void gatherData(GatherDataEvent event)
    {
        DataGenerator gen = event.getGenerator();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        gen.addProvider(new ModItemModelProvider(gen, existingFileHelper)) ;
    }
}
