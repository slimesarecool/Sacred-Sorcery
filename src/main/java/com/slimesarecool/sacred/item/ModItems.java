package com.slimesarecool.sacred.item;

import com.slimesarecool.sacred.SacredSorcery;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SacredSorcery.MODID);

    public static final RegistryObject<Item> SACRED_ESSENCE = ITEMS.register("sacred_essence", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SACRED_TAB)));
    public static final RegistryObject<Item> SACRED_DUST = ITEMS.register("sacred_dust", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SACRED_TAB)));
    public static final RegistryObject<Item> SACRED_SERUM = ITEMS.register("sacred_serum", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SACRED_TAB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
