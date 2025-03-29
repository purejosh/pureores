package net.purejosh.pureores;

import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import net.purejosh.pureores.block.ModBlocks;
import net.purejosh.pureores.command.ModCommands;
import net.purejosh.pureores.item.ModArmorMaterials;
import net.purejosh.pureores.item.ModItemGroups;
import net.purejosh.pureores.item.ModItems;
import net.purejosh.pureores.world.ModGameRules;
import net.purejosh.pureores.world.gen.ModWorldGeneration;
import net.purejosh.pureores.world.gen.feature.ModFeature;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PureOres implements ModInitializer {
	public static final String MOD_ID = "pureores";
	public static final String MOD_NAME = "Pure Ores";
	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

	// This code is executed when the mod is loaded.
	@Override
	public void onInitialize() {
		// This is the log line that gets printed when the mod is loaded.
		LOGGER.info(PureOres.MOD_NAME + " by purejosh has been loaded!");
		// Now, I call the init methods in the registry classes.
		ModCommands.init();
		ModGameRules.init();
		ModFeature.init();
		ModArmorMaterials.init();
		ModItems.init();
		ModBlocks.init();
		ModItemGroups.init();
		ModWorldGeneration.init();
	}
	// This is used in the configured features and placed features registry. No idea why.
	public static Identifier id(String path) {
		return Identifier.of(MOD_ID, path);
	}
}
