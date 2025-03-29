package net.purejosh.pureores.data.family;

import net.minecraft.data.family.BlockFamily;
import net.purejosh.pureores.block.ModBlocks;

import static net.minecraft.data.family.BlockFamilies.register;

public class ModBlockFamilies {
    public static final BlockFamily SERPENTINITE = register(ModBlocks.SERPENTINITE).stairs(ModBlocks.SERPENTINITE_STAIRS).slab(ModBlocks.SERPENTINITE_SLAB).wall(ModBlocks.SERPENTINITE_WALL).polished(ModBlocks.POLISHED_SERPENTINITE).build();
    public static final BlockFamily POLISHED_SERPENTINITE = register(ModBlocks.POLISHED_SERPENTINITE).stairs(ModBlocks.POLISHED_SERPENTINITE_STAIRS).slab(ModBlocks.POLISHED_SERPENTINITE_SLAB).wall(ModBlocks.POLISHED_SERPENTINITE_WALL).polished(ModBlocks.SERPENTINITE_BRICKS).build();
    public static final BlockFamily SERPENTINITE_BRICKS = register(ModBlocks.SERPENTINITE_BRICKS).stairs(ModBlocks.SERPENTINITE_BRICK_STAIRS).slab(ModBlocks.SERPENTINITE_BRICK_SLAB).wall(ModBlocks.SERPENTINITE_BRICK_WALL).build();

    public static final BlockFamily MICA_SCHIST = register(ModBlocks.MICA_SCHIST).stairs(ModBlocks.MICA_SCHIST_STAIRS).slab(ModBlocks.MICA_SCHIST_SLAB).wall(ModBlocks.MICA_SCHIST_WALL).polished(ModBlocks.POLISHED_MICA_SCHIST).build();
    public static final BlockFamily POLISHED_MICA_SCHIST = register(ModBlocks.POLISHED_MICA_SCHIST).stairs(ModBlocks.POLISHED_MICA_SCHIST_STAIRS).slab(ModBlocks.POLISHED_MICA_SCHIST_SLAB).wall(ModBlocks.POLISHED_MICA_SCHIST_WALL).polished(ModBlocks.MICA_SCHIST_BRICKS).build();
    public static final BlockFamily MICA_SCHIST_BRICKS = register(ModBlocks.MICA_SCHIST_BRICKS).stairs(ModBlocks.MICA_SCHIST_BRICK_STAIRS).slab(ModBlocks.MICA_SCHIST_BRICK_SLAB).wall(ModBlocks.MICA_SCHIST_BRICK_WALL).build();

    public static final BlockFamily LONSDALEITE_METEORITE = register(ModBlocks.LONSDALEITE_METEORITE).stairs(ModBlocks.LONSDALEITE_METEORITE_STAIRS).slab(ModBlocks.LONSDALEITE_METEORITE_SLAB).wall(ModBlocks.LONSDALEITE_METEORITE_WALL).polished(ModBlocks.POLISHED_LONSDALEITE_METEORITE).build();
    public static final BlockFamily POLISHED_LONSDALEITE_METEORITE = register(ModBlocks.POLISHED_LONSDALEITE_METEORITE).stairs(ModBlocks.POLISHED_LONSDALEITE_METEORITE_STAIRS).slab(ModBlocks.POLISHED_LONSDALEITE_METEORITE_SLAB).wall(ModBlocks.POLISHED_LONSDALEITE_METEORITE_WALL).polished(ModBlocks.LONSDALEITE_METEORITE_BRICKS).build();
    public static final BlockFamily LONSDALEITE_METEORITE_BRICKS = register(ModBlocks.LONSDALEITE_METEORITE_BRICKS).stairs(ModBlocks.LONSDALEITE_METEORITE_BRICK_STAIRS).slab(ModBlocks.LONSDALEITE_METEORITE_BRICK_SLAB).wall(ModBlocks.LONSDALEITE_METEORITE_BRICK_WALL).build();

}
