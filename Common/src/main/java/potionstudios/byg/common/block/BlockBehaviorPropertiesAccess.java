package potionstudios.byg.common.block;

import net.minecraft.world.level.block.state.BlockBehaviour;

public interface BlockBehaviorPropertiesAccess extends HasMaterial {
    boolean byg$isFlammable();

    BlockBehaviour.Properties byg$setFlammable(boolean flammable);

    void byg$setMaterial(Material material);
}
