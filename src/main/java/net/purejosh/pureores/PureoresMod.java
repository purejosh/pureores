/*
 *	MCreator note:
 *
 *	If you lock base mod element files, you can edit this file and the proxy files
 *	and they won't get overwritten. If you change your mod package or modid, you
 *	need to apply these changes to this file MANUALLY.
 *
 *
 *	If you do not lock base mod element files in Workspace settings, this file
 *	will be REGENERATED on each build.
 *
 */
package net.purejosh.pureores;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.purejosh.pureores.init.PureoresModSounds;
import net.purejosh.pureores.init.PureoresModProcedures;
import net.purejosh.pureores.init.PureoresModItems;
import net.purejosh.pureores.init.PureoresModGameRules;
import net.purejosh.pureores.init.PureoresModFeatures;
import net.purejosh.pureores.init.PureoresModBlocks;

import net.fabricmc.api.ModInitializer;

public class PureoresMod implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MODID = "pureores";

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing PureoresMod");

		PureoresModGameRules.load();

		PureoresModBlocks.load();
		PureoresModItems.load();

		PureoresModFeatures.load();

		PureoresModProcedures.load();

		PureoresModSounds.load();

	}
}
