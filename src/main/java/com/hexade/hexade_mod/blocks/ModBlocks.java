package com.hexade.hexade_mod.blocks;

import com.hexade.hexade_mod.init.Registration;
import com.hexade.hexade_mod.utils.ModItemGroups;
import javafx.beans.DefaultProperty;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;

import java.rmi.registry.Registry;
import java.util.function.Supplier;

public class ModBlocks
{
    public static final RegistryObject<Block> BERYL_ORE = register("beryl_ore",() ->
            new Block(AbstractBlock.Properties.of(Material.METAL)
                    .strength(6F,6F)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(4)
                    .requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> BERYL_BLOCK = register("beryl_block",() ->
            new Block(AbstractBlock.Properties.of(Material.METAL)
                    .strength(6F,6F)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(4)
                    .requiresCorrectToolForDrops()));


    public static void register() {}


    private static <T extends Block>RegistryObject<T> registerNoItem(String name, Supplier<T> block)
    {
        return Registration.BLOCKS.register(name, block);
    }

    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> block)
    {
        RegistryObject<T> ret = registerNoItem(name, block);
        Registration.ITEMS.register(name, () -> new BlockItem(ret.get(), new Item.Properties().tab(ModItemGroups.MOD_MATERIALS_TAB)));
        return ret;
    }
}
