
package com.anum.vehicle;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Block;

public class ModBlockIds {

    public static final ResourceKey<Block> LUCKY_BLOCK =
            ResourceKey.create(
                    Registries.BLOCK,
                    Vehicle.id("lucky_block")
            );
}
