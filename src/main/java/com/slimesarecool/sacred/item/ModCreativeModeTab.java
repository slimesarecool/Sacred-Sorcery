package com.slimesarecool.sacred.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab SACRED_TAB = new CreativeModeTab("sacred_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.STATIC_SACRED_DUST.get());
        }
    };
}
