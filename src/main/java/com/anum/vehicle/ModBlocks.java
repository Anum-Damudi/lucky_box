
package com.anum.vehicle;

import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

public class ModBlocks {

    // Register the Lucky Block
    public static final Block LUCKY_BLOCK =
            Registry.register(
                    BuiltInRegistries.BLOCK,
                    ModBlockIds.LUCKY_BLOCK,
                    new Block(
                            Block.Properties.ofFullCopy(Blocks.GOLD_BLOCK)
                                    .setId(ModBlockIds.LUCKY_BLOCK)
                    )
            );

    // Register the Lucky Block as an item
    public static final BlockItem LUCKY_BLOCK_ITEM =
            Registry.register(
                    BuiltInRegistries.ITEM,
                    ModBlockItemIds.LUCKY_BLOCK.item(),
                    new BlockItem(
                            LUCKY_BLOCK,
                            new BlockItem.Properties()
                                    .setId(ModBlockItemIds.LUCKY_BLOCK.item())
                    )
            );

    // Add Lucky Block to the Building Blocks creative tab
    public static void initialize() {

        CreativeModeTabEvents.modifyOutputEvent(
                CreativeModeTabs.BUILDING_BLOCKS
        ).register(tab -> tab.accept(LUCKY_BLOCK_ITEM));

    }
}
