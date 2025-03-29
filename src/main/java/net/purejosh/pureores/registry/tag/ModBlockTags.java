package net.purejosh.pureores.registry.tag;

import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.purejosh.pureores.PureOres;

public class ModBlockTags {
    public static final TagKey<Block> METEORITE_REPLACEABLE = of("meteorite_replaceable");

    private ModBlockTags() {
    }

    private static TagKey<Block> of(String id) {
        return TagKey.of(RegistryKeys.BLOCK, Identifier.of(PureOres.MOD_ID, id));
    }
}
