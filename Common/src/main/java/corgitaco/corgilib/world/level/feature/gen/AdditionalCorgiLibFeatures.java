package corgitaco.corgilib.world.level.feature.gen;

import corgitaco.corgilib.reg.RegistrationProvider;
import corgitaco.corgilib.reg.RegistryObject;
import corgitaco.corgilib.world.level.feature.CorgiLibFeatures;
import corgitaco.corgilib.world.level.feature.gen.configurations.TreeFromStructureNBTConfig;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;

import java.util.function.Supplier;

public class AdditionalCorgiLibFeatures {
    public static final RegistryObject<Feature<TreeFromStructureNBTConfig>> TREE_FROM_NBT = createFeature("tree_from_nbt", () -> new TreeFromStructureNBTFeature(TreeFromStructureNBTConfig.CODEC.stable()));

    @SuppressWarnings("unchecked")
    private static <C extends FeatureConfiguration, F extends Feature<C>> RegistryObject<F> createFeature(String id, Supplier<? extends F> feature) {
        try {
            final var field = CorgiLibFeatures.class.getDeclaredField("PROVIDER");
            field.setAccessible(true);
            final var PROVIDER = (RegistrationProvider<Feature<?>>) field.get(null);
            return PROVIDER.register(id, feature);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    public static void register() {
    }

    private AdditionalCorgiLibFeatures() {
    }
}
