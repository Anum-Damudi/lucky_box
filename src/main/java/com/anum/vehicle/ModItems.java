package com.anum.vehicle;

import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;

import java.util.function.Function;

public class ModItems {

    public static final Item LUCKY_COIN =
            register(
                    ModItemIds.LUCKY_COIN,
                    Item::new,
                    new Item.Properties()
            );

    private static Item register(
            ResourceKey<Item> key,
            Function<Item.Properties, Item> factory,
            Item.Properties properties
    ) {
        Item item = factory.apply(properties.setId(key));

        Registry.register(
                BuiltInRegistries.ITEM,
                key,
                item
        );

        return item;
    }
    public static void initialize() {
        // Register Lucky Coin in the Ingredients Creative tab
        CreativeModeTabEvents.modifyOutputEvent(
                CreativeModeTabs.INGREDIENTS
        ).register(tab -> tab.accept(LUCKY_COIN));
    }
}