package com.MonteZ.modtego.item;

import com.MonteZ.modtego.ModTego;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Moditems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ModTego.MOD_ID);

    public static final RegistryObject<Item> TURD = ITEMS.register("turd",
    () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DZUS_TAB)));

    public static void  register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
