package potionstudios.byg.mixin.common.entity;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.NbtOps;
import net.minecraft.nbt.Tag;
import net.minecraft.world.entity.player.Player;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import potionstudios.byg.common.entity.player.extension.BiomepediaExtension;
import potionstudios.byg.server.level.BYGPlayerTrackedData;
import potionstudios.byg.util.BYGAdditionalData;

import java.util.HashMap;

@Mixin(Player.class)
public abstract class MixinPlayer implements BYGAdditionalData, BYGPlayerTrackedData.Access, BiomepediaExtension {
    @Unique
    private BYGPlayerTrackedData byg_PlayerTrackedData = new BYGPlayerTrackedData(new HashMap<>());

    @Unique
    private boolean byg_gotBiomepedia = false;

    @Inject(method = "addAdditionalSaveData", at = @At("RETURN"))
    private void writeBYGData(CompoundTag tag, CallbackInfo ci) {
        this.writeBYG(tag);
    }

    @Inject(method = "readAdditionalSaveData", at = @At("RETURN"))
    private void readBYGData(CompoundTag tag, CallbackInfo ci) {
        this.readBYG(tag);
    }

    @Override
    public Tag byg_write() {
        CompoundTag tag = (CompoundTag) BYGPlayerTrackedData.CODEC.encodeStart(NbtOps.INSTANCE, this.byg_PlayerTrackedData).result().orElseThrow();
        tag.putBoolean("biomepedia", byg_gotBiomepedia);
        return tag;
    }

    @Override
    public void byg_read(CompoundTag tag) {
        this.byg_PlayerTrackedData = BYGPlayerTrackedData.CODEC.decode(NbtOps.INSTANCE, tag).result().orElseThrow().getFirst();
        this.byg_gotBiomepedia = tag.contains("biomepedia") && tag.getBoolean("biomepedia");
    }

    @Override
    public BYGPlayerTrackedData byg_getPlayerTrackedData() {
        return this.byg_PlayerTrackedData;
    }

    @Override
    public BYGPlayerTrackedData byg_setPlayerTrackedData(BYGPlayerTrackedData newVal) {
        this.byg_PlayerTrackedData = newVal;
        return this.byg_PlayerTrackedData;
    }

    @Override
    public void byg_setGotBiomepedia(boolean gotBiomepedia) {
        this.byg_gotBiomepedia = gotBiomepedia;
    }

    @Override
    public boolean byg_gotBiomepedia() {
        return this.byg_gotBiomepedia;
    }
}
