package potionstudios.byg.world.biome;

public class LayerUtil {

//    public static Area createLayers(Registry<Biome> biomeRegistry, long worldSeed, SimpleWeightedRandomList<ResourceKey<Biome>> biomes, int regionSize) {
//        LongFunction<AreaContext> contextFactory = (seedModifier) -> new AreaContext(25, worldSeed, seedModifier);
//        AreaFactory factory = new InitLayer(biomes, biomeRegistry).run(contextFactory.apply(1L));
//        factory = ZoomLayer.FUZZY.run(contextFactory.apply(2000L), factory);
//        factory = zoom(2001L, ZoomLayer.FUZZY, factory, 3, contextFactory);
//        factory = zoom(1001L, ZoomLayer.NORMAL, factory, regionSize, contextFactory);
//        return factory.make();
//    }
//
//    @SuppressWarnings("unchecked")
//    private static class InitLayer implements AreaTransformer0 {
//
//        private final SimpleWeightedRandomList<ResourceKey<Biome>> biomes;
//        private final Registry<Biome> biomeRegistry;
//        private final int totalWeight;
//        private final List<WeightedEntry> entries;
//
//        public InitLayer(SimpleWeightedRandomList<ResourceKey<Biome>> biomes, Registry<Biome> biomeRegistry) {
//            this.biomes = biomes;
//            this.biomeRegistry = biomeRegistry;
//            this.totalWeight = ((WeightedListAccess<ResourceKey<Biome>>) this.biomes).byg_getTotalWeight();
//            this.entries = ((WeightedListAccess<WeightedEntry>) this.biomes).byg_getItems();
//        }
//
//        @Override
//        public int apply(AreaContext areaContext, int x, int z) {
//            if (totalWeight == 0) {
//                return biomeRegistry.getId(biomeRegistry.get(Biomes.OCEAN));
//            }
//            Optional<WeightedEntry> weightedItem = WeightedRandom.getWeightedItem(this.entries, areaContext.nextRandom(this.totalWeight));
//            WeightedEntry.Wrapper<ResourceKey<Biome>> resourceKeyWrapper = (WeightedEntry.Wrapper<ResourceKey<Biome>>) weightedItem.get();
//            return biomeRegistry.getId(biomeRegistry.get(resourceKeyWrapper.byg_getData()));
//        }
//    }
}