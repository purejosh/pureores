
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.purejosh.pureores.init;

import net.purejosh.pureores.procedures.SapphireOreAdditionalGenerationConditionProcedure;
import net.purejosh.pureores.procedures.OreBlockDestroyedByPlayerProcedure;
import net.purejosh.pureores.procedures.NetherFireOpalOreAdditionalGenerationConditionProcedure;
import net.purejosh.pureores.procedures.MoonstoneOreAdditionalGenerationConditionProcedure;
import net.purejosh.pureores.procedures.LonsdaleiteOreBlockDestroyedByPlayerProcedure;
import net.purejosh.pureores.procedures.LonsdaleiteMeteoriteSmallOnStructureInstanceGeneratedProcedure;
import net.purejosh.pureores.procedures.LonsdaleiteMeteoriteSmallAdditionalGenerationConditionProcedure;
import net.purejosh.pureores.procedures.LonsdaleiteMeteoriteOnStructureInstanceGeneratedProcedure;
import net.purejosh.pureores.procedures.LonsdaleiteMeteoriteAdditionalGenerationConditionProcedure;
import net.purejosh.pureores.procedures.JadeiteOreAdditionalGenerationConditionProcedure;
import net.purejosh.pureores.procedures.FireOpalItemIsCraftedProcedure;
import net.purejosh.pureores.procedures.FireOpalArmorIsCraftedProcedure;
import net.purejosh.pureores.procedures.EndAmetrineOreAdditionalGenerationConditionProcedure;
import net.purejosh.pureores.procedures.DeepslateBlackDiamondOreAdditionalGenerationConditionProcedure;
import net.purejosh.pureores.procedures.ChrysoberylOreAdditionalGenerationConditionProcedure;

@SuppressWarnings("InstantiationOfUtilityClass")
public class PureoresModProcedures {
	public static void load() {
		new FireOpalItemIsCraftedProcedure();
		new FireOpalArmorIsCraftedProcedure();
		new EndAmetrineOreAdditionalGenerationConditionProcedure();
		new SapphireOreAdditionalGenerationConditionProcedure();
		new DeepslateBlackDiamondOreAdditionalGenerationConditionProcedure();
		new MoonstoneOreAdditionalGenerationConditionProcedure();
		new NetherFireOpalOreAdditionalGenerationConditionProcedure();
		new LonsdaleiteMeteoriteAdditionalGenerationConditionProcedure();
		new LonsdaleiteMeteoriteOnStructureInstanceGeneratedProcedure();
		new LonsdaleiteMeteoriteSmallOnStructureInstanceGeneratedProcedure();
		new LonsdaleiteMeteoriteSmallAdditionalGenerationConditionProcedure();
		new LonsdaleiteOreBlockDestroyedByPlayerProcedure();
		new OreBlockDestroyedByPlayerProcedure();
		new ChrysoberylOreAdditionalGenerationConditionProcedure();
		new JadeiteOreAdditionalGenerationConditionProcedure();
	}
}
