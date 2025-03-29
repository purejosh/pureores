package net.purejosh.pureores.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;
import net.purejosh.pureores.block.ModBlocks;
import net.purejosh.pureores.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        // Building Blocks
        addDrop(ModBlocks.MOONSTONE_BLOCK);
        addDrop(ModBlocks.FIRE_OPAL_BLOCK);
        addDrop(ModBlocks.JADEITE_BLOCK);
        addDrop(ModBlocks.AMETRINE_BLOCK);
        addDrop(ModBlocks.CHRYSOBERYL_BLOCK);
        addDrop(ModBlocks.SAPPHIRE_BLOCK);
        addDrop(ModBlocks.BLACK_DIAMOND_BLOCK);
        addDrop(ModBlocks.LONSDALEITE_BLOCK);
        addDrop(ModBlocks.SERPENTINITE);
        addDrop(ModBlocks.SERPENTINITE_STAIRS);
        addDrop(ModBlocks.SERPENTINITE_SLAB);
        addDrop(ModBlocks.SERPENTINITE_WALL);
        addDrop(ModBlocks.POLISHED_SERPENTINITE);
        addDrop(ModBlocks.POLISHED_SERPENTINITE_STAIRS);
        addDrop(ModBlocks.POLISHED_SERPENTINITE_SLAB);
        addDrop(ModBlocks.POLISHED_SERPENTINITE_WALL);
        addDrop(ModBlocks.SERPENTINITE_BRICKS);
        addDrop(ModBlocks.SERPENTINITE_BRICK_SLAB);
        addDrop(ModBlocks.SERPENTINITE_BRICK_STAIRS);
        addDrop(ModBlocks.SERPENTINITE_BRICK_WALL);
        addDrop(ModBlocks.MICA_SCHIST);
        addDrop(ModBlocks.MICA_SCHIST_STAIRS);
        addDrop(ModBlocks.MICA_SCHIST_SLAB);
        addDrop(ModBlocks.MICA_SCHIST_WALL);
        addDrop(ModBlocks.POLISHED_MICA_SCHIST);
        addDrop(ModBlocks.POLISHED_MICA_SCHIST_STAIRS);
        addDrop(ModBlocks.POLISHED_MICA_SCHIST_SLAB);
        addDrop(ModBlocks.POLISHED_MICA_SCHIST_WALL);
        addDrop(ModBlocks.MICA_SCHIST_BRICKS);
        addDrop(ModBlocks.MICA_SCHIST_BRICK_SLAB);
        addDrop(ModBlocks.MICA_SCHIST_BRICK_STAIRS);
        addDrop(ModBlocks.MICA_SCHIST_BRICK_WALL);
        addDrop(ModBlocks.LONSDALEITE_METEORITE);
        addDrop(ModBlocks.LONSDALEITE_METEORITE_STAIRS);
        addDrop(ModBlocks.LONSDALEITE_METEORITE_SLAB);
        addDrop(ModBlocks.LONSDALEITE_METEORITE_WALL);
        addDrop(ModBlocks.POLISHED_LONSDALEITE_METEORITE);
        addDrop(ModBlocks.POLISHED_LONSDALEITE_METEORITE_STAIRS);
        addDrop(ModBlocks.POLISHED_LONSDALEITE_METEORITE_SLAB);
        addDrop(ModBlocks.POLISHED_LONSDALEITE_METEORITE_WALL);
        addDrop(ModBlocks.LONSDALEITE_METEORITE_BRICKS);
        addDrop(ModBlocks.LONSDALEITE_METEORITE_BRICK_SLAB);
        addDrop(ModBlocks.LONSDALEITE_METEORITE_BRICK_STAIRS);
        addDrop(ModBlocks.LONSDALEITE_METEORITE_BRICK_WALL);

        // Colored Blocks
        addDrop(ModBlocks.MOONSTONE_GLASS, dropsWithSilkTouch(ModBlocks.MOONSTONE_GLASS));
        addDrop(ModBlocks.FIRE_OPAL_GLASS, dropsWithSilkTouch(ModBlocks.FIRE_OPAL_GLASS));
        addDrop(ModBlocks.JADEITE_GLASS, dropsWithSilkTouch(ModBlocks.JADEITE_GLASS));
        addDrop(ModBlocks.AMETRINE_GLASS, dropsWithSilkTouch(ModBlocks.AMETRINE_GLASS));
        addDrop(ModBlocks.CHRYSOBERYL_GLASS, dropsWithSilkTouch(ModBlocks.CHRYSOBERYL_GLASS));
        addDrop(ModBlocks.SAPPHIRE_GLASS, dropsWithSilkTouch(ModBlocks.SAPPHIRE_GLASS));
        addDrop(ModBlocks.BLACK_DIAMOND_GLASS, dropsWithSilkTouch(ModBlocks.BLACK_DIAMOND_GLASS));
        addDrop(ModBlocks.LONSDALEITE_GLASS, dropsWithSilkTouch(ModBlocks.LONSDALEITE_GLASS));
        addDrop(ModBlocks.FROSTED_MOONSTONE_GLASS, dropsWithSilkTouch(ModBlocks.FROSTED_MOONSTONE_GLASS));
        addDrop(ModBlocks.FROSTED_FIRE_OPAL_GLASS, dropsWithSilkTouch(ModBlocks.FROSTED_FIRE_OPAL_GLASS));
        addDrop(ModBlocks.FROSTED_JADEITE_GLASS, dropsWithSilkTouch(ModBlocks.FROSTED_JADEITE_GLASS));
        addDrop(ModBlocks.FROSTED_AMETRINE_GLASS, dropsWithSilkTouch(ModBlocks.FROSTED_AMETRINE_GLASS));
        addDrop(ModBlocks.FROSTED_CHRYSOBERYL_GLASS, dropsWithSilkTouch(ModBlocks.FROSTED_CHRYSOBERYL_GLASS));
        addDrop(ModBlocks.FROSTED_SAPPHIRE_GLASS, dropsWithSilkTouch(ModBlocks.FROSTED_SAPPHIRE_GLASS));
        addDrop(ModBlocks.FROSTED_BLACK_DIAMOND_GLASS, dropsWithSilkTouch(ModBlocks.FROSTED_BLACK_DIAMOND_GLASS));
        addDrop(ModBlocks.FROSTED_LONSDALEITE_GLASS, dropsWithSilkTouch(ModBlocks.FROSTED_LONSDALEITE_GLASS));
        addDrop(ModBlocks.MOONSTONE_GLASS_PANE, dropsWithSilkTouch(ModBlocks.MOONSTONE_GLASS_PANE));
        addDrop(ModBlocks.FIRE_OPAL_GLASS_PANE, dropsWithSilkTouch(ModBlocks.FIRE_OPAL_GLASS_PANE));
        addDrop(ModBlocks.JADEITE_GLASS_PANE, dropsWithSilkTouch(ModBlocks.JADEITE_GLASS_PANE));
        addDrop(ModBlocks.AMETRINE_GLASS_PANE, dropsWithSilkTouch(ModBlocks.AMETRINE_GLASS_PANE));
        addDrop(ModBlocks.CHRYSOBERYL_GLASS_PANE, dropsWithSilkTouch(ModBlocks.CHRYSOBERYL_GLASS_PANE));
        addDrop(ModBlocks.SAPPHIRE_GLASS_PANE, dropsWithSilkTouch(ModBlocks.SAPPHIRE_GLASS_PANE));
        addDrop(ModBlocks.BLACK_DIAMOND_GLASS_PANE, dropsWithSilkTouch(ModBlocks.BLACK_DIAMOND_GLASS_PANE));
        addDrop(ModBlocks.LONSDALEITE_GLASS_PANE, dropsWithSilkTouch(ModBlocks.LONSDALEITE_GLASS_PANE));
        addDrop(ModBlocks.FROSTED_MOONSTONE_GLASS_PANE, dropsWithSilkTouch(ModBlocks.FROSTED_MOONSTONE_GLASS_PANE));
        addDrop(ModBlocks.FROSTED_FIRE_OPAL_GLASS_PANE, dropsWithSilkTouch(ModBlocks.FROSTED_FIRE_OPAL_GLASS_PANE));
        addDrop(ModBlocks.FROSTED_JADEITE_GLASS_PANE, dropsWithSilkTouch(ModBlocks.FROSTED_JADEITE_GLASS_PANE));
        addDrop(ModBlocks.FROSTED_AMETRINE_GLASS_PANE, dropsWithSilkTouch(ModBlocks.FROSTED_AMETRINE_GLASS_PANE));
        addDrop(ModBlocks.FROSTED_CHRYSOBERYL_GLASS_PANE, dropsWithSilkTouch(ModBlocks.FROSTED_CHRYSOBERYL_GLASS_PANE));
        addDrop(ModBlocks.FROSTED_SAPPHIRE_GLASS_PANE, dropsWithSilkTouch(ModBlocks.FROSTED_SAPPHIRE_GLASS_PANE));
        addDrop(ModBlocks.FROSTED_BLACK_DIAMOND_GLASS_PANE, dropsWithSilkTouch(ModBlocks.FROSTED_BLACK_DIAMOND_GLASS_PANE));
        addDrop(ModBlocks.FROSTED_LONSDALEITE_GLASS_PANE, dropsWithSilkTouch(ModBlocks.FROSTED_LONSDALEITE_GLASS_PANE));

        // Natural Blocks
        addDrop(ModBlocks.MOONSTONE_ORE, oreDrops(ModBlocks.MOONSTONE_ORE, ModItems.MOONSTONE));
        addDrop(ModBlocks.NETHER_FIRE_OPAL_ORE, oreDrops(ModBlocks.NETHER_FIRE_OPAL_ORE, ModItems.FIRE_OPAL));
        addDrop(ModBlocks.JADEITE_ORE, oreDrops(ModBlocks.JADEITE_ORE, ModItems.JADEITE));
        addDrop(ModBlocks.END_AMETRINE_ORE, oreDrops(ModBlocks.END_AMETRINE_ORE, ModItems.AMETRINE));
        addDrop(ModBlocks.CHRYSOBERYL_ORE, oreDrops(ModBlocks.CHRYSOBERYL_ORE, ModItems.CHRYSOBERYL));
        addDrop(ModBlocks.DEEPSLATE_SAPPHIRE_ORE, oreDrops(ModBlocks.DEEPSLATE_SAPPHIRE_ORE, ModItems.SAPPHIRE));
        addDrop(ModBlocks.DEEPSLATE_BLACK_DIAMOND_ORE, oreDrops(ModBlocks.DEEPSLATE_BLACK_DIAMOND_ORE, ModItems.BLACK_DIAMOND));
        addDrop(ModBlocks.LONSDALEITE_ORE, oreDrops(ModBlocks.LONSDALEITE_ORE, ModItems.LONSDALEITE));
    }
}
