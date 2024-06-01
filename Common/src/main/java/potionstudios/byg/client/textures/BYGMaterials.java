package potionstudios.byg.client.textures;

import net.minecraft.world.level.material.MapColor;
import potionstudios.byg.common.block.Material;

public class BYGMaterials {
    public static final Material AMETRINE;
    public static final Material SUBZERO_CRYSTAL;

    static {
        AMETRINE = new Material.Builder(MapColor.COLOR_PINK).nonSolid().build();
        SUBZERO_CRYSTAL = new Material.Builder(MapColor.COLOR_LIGHT_BLUE).nonSolid().build();
    }
}
