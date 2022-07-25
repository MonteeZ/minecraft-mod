package com.MonteZ.modtego.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab DZUS_TAB = new CreativeModeTab("dzus_panel") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Moditems.TURD.get());
        }
    };
}