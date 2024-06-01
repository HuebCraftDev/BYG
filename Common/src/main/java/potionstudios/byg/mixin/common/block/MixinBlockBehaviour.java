package potionstudios.byg.mixin.common.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import potionstudios.byg.common.block.Material;
import potionstudios.byg.common.block.BlockBehaviorPropertiesAccess;
import potionstudios.byg.common.block.HasMaterial;

import javax.annotation.Nullable;

@Mixin(BlockBehaviour.class)
public abstract class MixinBlockBehaviour implements HasMaterial {
    @Unique
    @Nullable
    private Material byg_material = null;

    @Inject(method = "<init>", at = @At("RETURN"))
    private void byg_init(BlockBehaviour.Properties $$0, CallbackInfo ci) {
        final var access = (BlockBehaviorPropertiesAccess) $$0;
        byg_material = access.byg$getMaterial();
    }

    @Override
    @Nullable
    public Material byg$getMaterial() {
        return byg_material;
    }

    @Override
    public boolean is(Material material) {
        return byg$getMaterial() == material;
    }
}
