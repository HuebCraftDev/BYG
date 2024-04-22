package potionstudios.byg.client.textures;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;

import java.util.function.Supplier;

public class BYGMaterials {
    public static final Supplier<BlockBehaviour.Properties> AMETRINE;
    public static final Supplier<BlockBehaviour.Properties> SUBZERO_CRYSTAL;

    static {
        AMETRINE = () -> BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).forceSolidOff();
        SUBZERO_CRYSTAL = () -> BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_BLUE).forceSolidOff();
    }
}
