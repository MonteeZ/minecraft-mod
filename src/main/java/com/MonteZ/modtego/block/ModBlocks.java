package com.MonteZ.modtego.block;

import com.MonteZ.modtego.ModTego;
import com.MonteZ.modtego.item.ModCreativeModeTab;
import com.MonteZ.modtego.item.Moditems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ModTego.MOD_ID);

    public static final RegistryObject<Block> TURD_BLOCK = registerBlock("turd_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND).strength(1f).friction(0.80f)), ModCreativeModeTab.DZUS_TAB);

    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
        return Moditems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static  void  register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
