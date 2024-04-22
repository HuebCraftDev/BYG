package potionstudios.byg.util;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class CommonBlockTags {
    public static final TagKey<Block> PLANT = TagKey.create(Registries.BLOCK, new ResourceLocation("c:plant"));
    public static final TagKey<Block> WATER_PLANT = TagKey.create(Registries.BLOCK, new ResourceLocation("c:water_plant"));
    public static final TagKey<Block> WOOD = TagKey.create(Registries.BLOCK, new ResourceLocation("c:wood"));
    public static final TagKey<Block> STONES = TagKey.create(Registries.BLOCK, new ResourceLocation("c:stones"));
    private CommonBlockTags() {
    }
}
