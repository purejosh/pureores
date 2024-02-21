
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.purejosh.pureores.init;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

public class PureoresModSounds {
	public static SoundEvent EQUIP_FIRE_OPAL = SoundEvent.createVariableRangeEvent(new ResourceLocation("pureores", "equip_fire_opal"));

	public static void load() {
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("pureores", "equip_fire_opal"), EQUIP_FIRE_OPAL);
	}
}
