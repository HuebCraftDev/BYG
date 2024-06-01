package potionstudios.byg.common.block;

import javax.annotation.Nullable;

public interface HasMaterial {
    @Nullable
    Material byg$getMaterial();

    boolean is(Material material);
}
