package potionstudios.byg.util;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.Tag;
import potionstudios.byg.BYG;

import java.util.Locale;

public interface BYGAdditionalData {

    default void writeBYG(CompoundTag tag) {
        tag.put(BYG.MOD_ID.toLowerCase(Locale.ROOT), byg_write());
    }

    default void readBYG(CompoundTag tag) {
        String tagLocation = BYG.MOD_ID.toLowerCase(Locale.ROOT);
        if (tag.contains(tagLocation, Tag.TAG_COMPOUND)) {
            byg_read(tag.getCompound(tagLocation));
        }
    }

    Tag byg_write();

    void byg_read(CompoundTag tag);
}
