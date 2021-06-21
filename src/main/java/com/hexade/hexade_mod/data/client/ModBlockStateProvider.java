package com.hexade.hexade_mod.data.client;

import com.hexade.hexade_mod.Hexademod;
import com.hexade.hexade_mod.blocks.ModBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockStateProvider extends BlockStateProvider
{

    public ModBlockStateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, Hexademod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlock(ModBlocks.BERYL_BLOCK.get());
        simpleBlock(ModBlocks.BERYL_ORE.get());
    }
}
