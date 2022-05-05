package potionstudios.byg.common.world.biome;

import net.minecraft.core.Registry;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;
import potionstudios.byg.BYG;
import potionstudios.byg.common.entity.npc.VillagerTradeRegistry;
import potionstudios.byg.common.world.biome.end.BYGEndBiomes;
import potionstudios.byg.common.world.placement.BYGPlacementModifierType;
import potionstudios.byg.common.world.structure.BYGStructurePieceTypes;
import potionstudios.byg.common.world.structure.BYGStructureSets;
import potionstudios.byg.common.world.surfacerules.BYGRuleSources;
import potionstudios.byg.registration.RegistrationProvider;
import potionstudios.byg.util.blendingfunction.BlendingFunction;

import java.util.function.Supplier;

import static potionstudios.byg.common.world.biome.BYGOverworldBiomes.*;

public class BYGBiomes {

    public static final RegistrationProvider<Biome> PROVIDER = RegistrationProvider.get(BuiltinRegistries.BIOME, BYG.MOD_ID);

    /************Primary Biomes************/
    public static ResourceKey<Biome> ALLIUM_FIELDS = createBiome("allium_fields", BYGOverworldBiomes::alliumFields);
    public static ResourceKey<Biome> AMARANTH_FIELDS = createBiome("amaranth_fields", BYGOverworldBiomes::amaranthFields);
    public static ResourceKey<Biome> ARAUCARIA_SAVANNA = createBiome("araucaria_savanna", () -> araucariaSavanna(false));
    public static ResourceKey<Biome> ASPEN_FOREST = createBiome("aspen_forest", BYGOverworldBiomes::aspenForest);
    public static ResourceKey<Biome> ATACAMA_DESERT = createBiome("atacama_desert", BYGOverworldBiomes::atacamaDesert);
    public static ResourceKey<Biome> AUTUMNAL_VALLEY = createBiome("autumnal_valley", BYGOverworldBiomes::autumnalValley);
    public static ResourceKey<Biome> BAOBAB_SAVANNA = createBiome("baobab_savanna", BYGOverworldBiomes::baobabSavanna);
    public static ResourceKey<Biome> BAYOU = createBiome("bayou", BYGOverworldBiomes::bayou);
    public static ResourceKey<Biome> BLACK_FOREST = createBiome("black_forest", BYGOverworldBiomes::blackForest);
    public static ResourceKey<Biome> BOREALIS_GROVE = createBiome("borealis_grove", BYGOverworldBiomes::borealisGrove);
    public static ResourceKey<Biome> CANADIAN_SHIELD = createBiome("canadian_shield", BYGOverworldBiomes::canadianShield);
    public static ResourceKey<Biome> CHERRY_BLOSSOM_FOREST = createBiome("cherry_blossom_forest", BYGOverworldBiomes::cherryBlossomForest);
    public static ResourceKey<Biome> CIKA_WOODS = createBiome("cika_woods", BYGOverworldBiomes::cikaWoods);
    public static ResourceKey<Biome> CONIFEROUS_FOREST = createBiome("coniferous_forest", () -> coniferousForest(false));
    public static ResourceKey<Biome> CRAG_GARDENS = createBiome("crag_gardens", BYGOverworldBiomes::cragGardens);
    public static ResourceKey<Biome> CYPRESS_SWAMPLANDS = createBiome("cypress_swamplands", BYGOverworldBiomes::cypressSwamplands);
    public static ResourceKey<Biome> LUSH_STACKS = createBiome("lush_stacks", BYGOverworldBiomes::lushStacks);
    public static ResourceKey<Biome> DEAD_SEA = createBiome("dead_sea", BYGOverworldBiomes::deadSea);
    public static ResourceKey<Biome> DACITE_RIDGES = createBiome("dacite_ridges", BYGOverworldBiomes::daciteRidges);
    public static ResourceKey<Biome> WINDSWEPT_DUNES = createBiome("windswept_dunes", BYGOverworldBiomes::windsweptDunes);
    public static ResourceKey<Biome> EBONY_WOODS = createBiome("ebony_woods", BYGOverworldBiomes::ebonyWoods);
    public static ResourceKey<Biome> FORGOTTEN_FOREST = createBiome("forgotten_forest", BYGOverworldBiomes::forgottenForest);
    public static ResourceKey<Biome> GROVE = createBiome("temperate_grove", () -> temperateGrove(false));
    public static ResourceKey<Biome> GUIANA_SHIELD = createBiome("guiana_shield", BYGOverworldBiomes::guianaShield);
    public static ResourceKey<Biome> HOWLING_PEAKS = createBiome("howling_peaks", BYGOverworldBiomes::howlingPeaks);
    public static ResourceKey<Biome> JACARANDA_FOREST = createBiome("jacaranda_forest", BYGOverworldBiomes::jacarandaForest);
    public static ResourceKey<Biome> MAPLE_TAIGA = createBiome("maple_taiga", BYGOverworldBiomes::mapleTaiga);
    public static ResourceKey<Biome> COCONINO_MEADOW = createBiome("coconino_meadow", () -> coconinoMeadow(false, false));
    public static ResourceKey<Biome> MOJAVE_DESERT = createBiome("mojave_desert", BYGOverworldBiomes::mojaveDesert);
    public static ResourceKey<Biome> CARDINAL_TUNDRA = createBiome("cardinal_tundra", BYGOverworldBiomes::cardinalTundra);
    public static ResourceKey<Biome> ORCHARD = createBiome("orchard", BYGOverworldBiomes::orchard);
    public static ResourceKey<Biome> PRAIRIE = createBiome("prairie", BYGOverworldBiomes::prairie);
    public static ResourceKey<Biome> RED_OAK_FOREST = createBiome("red_oak_forest", BYGOverworldBiomes::redOakForest);
    public static ResourceKey<Biome> RED_ROCK_VALLEY = createBiome("red_rock_valley", BYGOverworldBiomes::redRockValley);
    public static ResourceKey<Biome> ROSE_FIELDS = createBiome("rose_fields", BYGOverworldBiomes::roseFields);
    public static ResourceKey<Biome> AUTUMNAL_FOREST = createBiome("autumnal_forest", BYGOverworldBiomes::autumnalForest);
    public static ResourceKey<Biome> AUTUMNAL_TAIGA = createBiome("autumnal_taiga", () -> autumnalTaiga(false));
    public static ResourceKey<Biome> SHATTERED_GLACIER = createBiome("shattered_glacier", BYGOverworldBiomes::shatteredGlacier);
    public static ResourceKey<Biome> FIRECRACKER_SHRUBLAND = createBiome("firecracker_shrubland", BYGOverworldBiomes::firecrackerShrubland);
    public static ResourceKey<Biome> SIERRA_BADLANDS = createBiome("sierra_badlands", BYGOverworldBiomes::sierraBadlands);
    public static ResourceKey<Biome> SKYRIS_VALE = createBiome("skyris_vale", BYGOverworldBiomes::skyrisVale);
    public static ResourceKey<Biome> REDWOOD_THICKET = createBiome("redwood_thicket", BYGOverworldBiomes::redwoodThicket);
    public static ResourceKey<Biome> FROSTED_TAIGA = createBiome("frosted_taiga", () -> frostedTaiga(true, false));
    public static ResourceKey<Biome> FROSTED_CONIFEROUS_FOREST = createBiome("frosted_coniferous_forest", () -> coniferousForest(true));
    public static ResourceKey<Biome> FRAGMENT_FOREST = createBiome("fragment_forest", BYGOverworldBiomes::fragmentForest);
    //    public static ResourceKey<Biome> TROPICAL_ISLAND = createBiome("tropical_islands", tropicalRainforest());
    public static ResourceKey<Biome> TROPICAL_RAINFOREST = createBiome("tropical_rainforest", BYGOverworldBiomes::tropicalRainforest);
    public static ResourceKey<Biome> TWILIGHT_MEADOW = createBiome("twilight_meadow", BYGOverworldBiomes::twilightMeadow);
    public static ResourceKey<Biome> WEEPING_WITCH_FOREST = createBiome("weeping_witch_forest", BYGOverworldBiomes::weepingWitchForest);
//    public static ResourceKey<Biome> WHITE_MANGROVE_MARSHES = createBiome("white_mangrove_marshes", whiteMangroveMarshes()); //TODO: Trees are floating and need to be fixed.
    public static ResourceKey<Biome> TEMPERATE_RAINFOREST = createBiome("temperate_rainforest", BYGOverworldBiomes::temperateRainForest);
    public static ResourceKey<Biome> ZELKOVA_FOREST = createBiome("zelkova_forest", BYGOverworldBiomes::zelkovaForest);

    /************Beach Biomes*************/
    public static ResourceKey<Biome> WINDSWEPT_BEACH = createBiome("windswept_beach", BYGOverworldBiomes::windsweptBeach);


    /************Nether Biomes************/
    public static ResourceKey<Biome> BRIMSTONE_CAVERNS = createBiome("brimstone_caverns", BYGNetherBiomes::brimstoneCaverns);
    public static ResourceKey<Biome> CRIMSON_GARDENS = createBiome("crimson_gardens", BYGNetherBiomes::crimsonGardens);
    public static ResourceKey<Biome> EMBUR_BOG = createBiome("embur_bog", BYGNetherBiomes::emburBog);
    public static ResourceKey<Biome> GLOWSTONE_GARDENS = createBiome("glowstone_gardens", BYGNetherBiomes::glowstoneGardens);
    public static ResourceKey<Biome> MAGMA_WASTES = createBiome("magma_wastes", BYGNetherBiomes::magmaWastes);
    public static ResourceKey<Biome> SUBZERO_HYPOGEAL = createBiome("subzero_hypogeal", BYGNetherBiomes::subzeroHypogeal);
    public static ResourceKey<Biome> SYTHIAN_TORRIDS = createBiome("sythian_torrids", BYGNetherBiomes::sythianTorrids);
    public static ResourceKey<Biome> WARPED_DESERT = createBiome("warped_desert", BYGNetherBiomes::warpedDesert);
    public static ResourceKey<Biome> WAILING_GARTH = createBiome("wailing_garth", BYGNetherBiomes::wailingGarth);
    public static ResourceKey<Biome> ARISIAN_UNDERGROWTH = createBiome("arisian_undergrowth", BYGNetherBiomes::arisianUndergrowth);
    public static ResourceKey<Biome> WEEPING_MIRE = createBiome("weeping_mire", BYGNetherBiomes::weepingMire);
    public static ResourceKey<Biome> QUARTZ_DESERT = createBiome("quartz_desert", BYGNetherBiomes::quartzDesert);

    /************End Biomes************/
    public static ResourceKey<Biome> IVIS_FIELDS = createBiome("ivis_fields", BYGEndBiomes::ivisFields);
    public static ResourceKey<Biome> NIGHTSHADE_FOREST = createBiome("nightshade_forest", BYGEndBiomes::nightshadeForest);
    public static ResourceKey<Biome> ETHEREAL_ISLANDS = createBiome("ethereal_islands", BYGEndBiomes::etherealIslands);
    public static ResourceKey<Biome> VISCAL_ISLES = createBiome("viscal_isles", BYGEndBiomes::viscalIsles);
    public static ResourceKey<Biome> BULBIS_GARDENS = createBiome("bulbis_gardens", BYGEndBiomes::bulbisGardens);
    //    public static ResourceKey<Biome> SHATTERED_DESERT = createBiome("shattered_desert", shatteredDesert());
    public static ResourceKey<Biome> SHULKREN_FOREST = createBiome("shulkren_forest", BYGEndBiomes::shulkrenForest);
    public static ResourceKey<Biome> CRYPTIC_WASTES = createBiome("cryptic_wastes", BYGEndBiomes::crypticWastes);
    public static ResourceKey<Biome> IMPARIUS_GROVE = createBiome("imparius_grove", BYGEndBiomes::impariusGrove);


    public static <B extends Biome> ResourceKey<Biome> createBiome(String id, Supplier<? extends B> biome) {
        ResourceLocation bygID = BYG.createLocation(id);
        if (BuiltinRegistries.BIOME.keySet().contains(bygID)) {
            throw new IllegalStateException("Biome ID: \"" + bygID + "\" already exists in the Biome registry!");
        }
        if (BYG.BIOMES) {
            PROVIDER.register(id, biome);
        }

        return ResourceKey.create(Registry.BIOME_REGISTRY, bygID);
    }

    public static void loadClass() {
        BlendingFunction.register();
        BYGStructurePieceTypes.bootStrap();
        BYGStructureSets.bootStrap();
        BYGPlacementModifierType.bootStrap();
        BYGRuleSources.bootStrap();
        VillagerTradeRegistry.register();
    }

    static {
        BYG.LOGGER.info("BYG Biomes class loaded.");
    }
}