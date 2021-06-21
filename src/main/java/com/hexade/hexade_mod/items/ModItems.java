package com.hexade.hexade_mod.items;

import com.hexade.hexade_mod.init.Registration;
import com.hexade.hexade_mod.utils.ModItemGroups;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;

public class ModItems
{
    public static final RegistryObject<Item> BERYL = Registration.ITEMS.register("beryl", () ->
            new Item(new Item.Properties().tab(ModItemGroups.MOD_MATERIALS_TAB)));

    public static void register() { }
}
