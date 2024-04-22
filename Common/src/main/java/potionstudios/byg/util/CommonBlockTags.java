package potionstudios.byg.util;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class CommonBlockTags {
    // TODO: Replace with forge and fabric compatible tags
    public static final TagKey<Block> PLANT = TagKey.create(Registries.BLOCK, new ResourceLocation("c:plant"));
    public static final TagKey<Block> WATER_PLANT = TagKey.create(Registries.BLOCK, new ResourceLocation("c:water_plant"));
    private CommonBlockTags() {
    }
}
