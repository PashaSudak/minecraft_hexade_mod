package com.hexade.hexade_mod.data.client;

import com.hexade.hexade_mod.Hexademod;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider
{

    public ModItemModelProvider(DataGenerator generator,  ExistingFileHelper existingFileHelper) {
        super(generator, Hexademod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        withExistingParent("beryl_ore", modLoc("block/beryl_ore"));
        withExistingParent("beryl_block", modLoc("block/beryl_block"));

        ModelFile itemGenerated = getExistingFile(mcLoc("item/generated"));

        getBuilder("beryl").parent(itemGenerated).texture("layer0,", "item/beryl");
    }

    private ItemModelBuilder builder(ModelFile itemGenerated, String name)
    {
        return getBuilder(name).parent(itemGenerated).texture("layer0", "item/" + name);
    }
}
