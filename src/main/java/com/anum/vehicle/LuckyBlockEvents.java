
package com.anum.vehicle;

import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.EntitySpawnReason;
import net.minecraft.world.entity.EntityTypes;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

import java.util.Random;

public class LuckyBlockEvents {

    private static final Random RANDOM = new Random();

    public static void initialize() {

        PlayerBlockBreakEvents.AFTER.register(
                (world, player, pos, state, blockEntity) -> {

                    if (world.isClientSide()) {
                        return;
                    }

                    if (state.getBlock() != ModBlocks.LUCKY_BLOCK) {
                        return;
                    }

                    ServerLevel serverWorld = (ServerLevel) world;

                    int outcome = RANDOM.nextInt(6);

                    switch (outcome) {

                        case 0:
                            dropReward(serverWorld, pos, Items.DIAMOND, 3);
                            break;

                        case 1:
                            dropReward(serverWorld, pos, Items.GOLD_INGOT, 10);
                            break;

                        case 2:
                            dropReward(serverWorld, pos, Items.TNT, 2);
                            break;

                        case 3:
                            // Lightning event
                            EntityTypes.LIGHTNING_BOLT.spawn(
                                    serverWorld,
                                    pos.above(),
                                    EntitySpawnReason.TRIGGERED
                            );

                            serverWorld.playSound(
                                    null,
                                    pos,
                                    net.minecraft.sounds.SoundEvents.LIGHTNING_BOLT_THUNDER,
                                    net.minecraft.sounds.SoundSource.WEATHER,
                                    2.0F,
                                    1.0F
                            );
                            break;
                        case 4:
                            // Zombie event
                            EntityTypes.ZOMBIE.spawn(
                                    serverWorld,
                                    pos,
                                    EntitySpawnReason.TRIGGERED
                            );

                            serverWorld.playSound(
                                    null,
                                    pos,
                                    net.minecraft.sounds.SoundEvents.ZOMBIE_AMBIENT,
                                    net.minecraft.sounds.SoundSource.HOSTILE,
                                    1.0F,
                                    1.0F
                            );
                            break;
                        case 5:
                            dropReward(serverWorld, pos, Items.GOLDEN_APPLE, 1);
                            break;
                    }
                }
        );
    }

    private static void dropReward(
            ServerLevel world,
            BlockPos pos,
            Item item,
            int count
    ) {

        ItemEntity entity = new ItemEntity(
                world,
                pos.getX() + 0.5,
                pos.getY() + 0.5,
                pos.getZ() + 0.5,
                new ItemStack(item, count)
        );

        world.addFreshEntity(entity);

        // Green particle effect
        world.sendParticles(
                net.minecraft.core.particles.ParticleTypes.HAPPY_VILLAGER,
                pos.getX() + 0.5,
                pos.getY() + 0.8,
                pos.getZ() + 0.5,
                15,
                0.3,
                0.3,
                0.3,
                0.05
        );

        // Reward sound
        world.playSound(
                null,
                pos,
                net.minecraft.sounds.SoundEvents.EXPERIENCE_ORB_PICKUP,
                net.minecraft.sounds.SoundSource.BLOCKS,
                1.0F,
                1.0F
        );
    }
}
