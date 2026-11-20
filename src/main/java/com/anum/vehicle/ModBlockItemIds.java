
package com.anum.vehicle;

import net.minecraft.resources.Identifier;
import net.minecraft.references.BlockItemId;

public class ModBlockItemIds {

    public static final BlockItemId LUCKY_BLOCK =
            create("lucky_block");

    private static BlockItemId create(String name) {
        Identifier id = Vehicle.id(name);
        return BlockItemId.create(id, id);
    }
}
