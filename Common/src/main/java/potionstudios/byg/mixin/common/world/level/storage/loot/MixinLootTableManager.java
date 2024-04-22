//package potionstudios.byg.mixin.common.world.level.storage.loot;
//
//import com.google.gson.JsonArray;
//import com.google.gson.JsonElement;
//import net.minecraft.resources.ResourceLocation;
//import net.minecraft.server.packs.resources.PreparableReloadListener;
//import net.minecraft.server.packs.resources.Resource;
//import net.minecraft.server.packs.resources.ResourceManager;
//import net.minecraft.util.GsonHelper;
//import net.minecraft.util.profiling.ProfilerFiller;
//import net.minecraft.world.level.storage.loot.LootDataManager;
//import net.minecraft.world.level.storage.loot.LootDataResolver;
//import net.minecraft.world.level.storage.loot.LootDataType;
//import org.spongepowered.asm.mixin.Mixin;
//import org.spongepowered.asm.mixin.Shadow;
//import org.spongepowered.asm.mixin.Unique;
//import org.spongepowered.asm.mixin.injection.At;
//import org.spongepowered.asm.mixin.injection.Inject;
//import org.spongepowered.asm.mixin.injection.Redirect;
//import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
//import org.spongepowered.asm.mixin.injection.callback.LocalCapture;
//import potionstudios.byg.BYG;
//import potionstudios.byg.config.SettingsConfig;
//import potionstudios.byg.mixin.access.JsonReloadListenerAccess;
//
//import java.io.*;
//import java.nio.charset.StandardCharsets;
//import java.util.Map;
//import java.util.Optional;
//import java.util.concurrent.CompletableFuture;
//import java.util.concurrent.CompletionStage;
//import java.util.concurrent.Executor;
//import java.util.function.Function;
//
//@Mixin(LootDataManager.class)
//public abstract class MixinLootTableManager implements PreparableReloadListener, LootDataResolver {
//    @Shadow protected abstract void apply(Map<LootDataType<?>, Map<ResourceLocation, ?>> collectedElements);
//
//    @Unique
//    private final ThreadLocal<CompletableFuture<?>> reloadFuture = new ThreadLocal<>();
//
//    @Redirect(method = "reload", at = @At(value = "INVOKE", target = "Ljava/util/concurrent/CompletableFuture;thenCompose(Ljava/util/function/Function;)Ljava/util/concurrent/CompletableFuture;"))
//    private CompletableFuture<Void> redirectReloadFuture(CompletableFuture<Void> instance, Function<Void, ? extends CompletionStage<Void>> fn) {
//        reloadFuture.set(instance);
//        return instance.thenCompose(fn).thenAccept(it -> {
//            this.apply(this.values);
//        });
//    }
//
//    @Inject(method = "reload", at = @At(value = "INVOKE", target = "Ljava/util/concurrent/CompletableFuture;thenCompose(Ljava/util/function/Function;)Ljava/util/concurrent/CompletableFuture;"), locals = LocalCapture.PRINT)
//    private void appendTables(PreparationBarrier $$0, ResourceManager $$1, ProfilerFiller $$2, ProfilerFiller $$3, Executor $$4, Executor $$5, CallbackInfoReturnable<CompletableFuture<Void>> cir) {
//        if (!SettingsConfig.getConfig().appendLootTables()) {
//            return;
//        }
//        String appendTablesDir = "append_loot_tables";
//        Map<ResourceLocation, Resource> resourceMap = $$1.listResources(appendTablesDir, (key) -> key.toString().endsWith(".json"));
//        for (ResourceLocation resourceLocation : resourceMap.keySet()) {
//            ResourceLocation key = new ResourceLocation(resourceLocation.getPath().replace(appendTablesDir + "/", "").replaceFirst("/", ":").replace(".json", ""));
//            if (values.containsKey(key)) {
//                values.get(key).getAsJsonObject().getAsJsonArray("pools").addAll(extractPools(resourceManager, resourceLocation));
//            }
//        }
//    }
//
//    private JsonArray extractPools(ResourceManager resourceManager, ResourceLocation location) {
//        try {
//            Optional<Resource> optionalResource = resourceManager.getResource(location);
//            if (optionalResource.isPresent()) {
//                Resource appendedTable = optionalResource.get();
//
//                InputStream inputstream = appendedTable.open();
//                Reader reader = new BufferedReader(new InputStreamReader(inputstream, StandardCharsets.UTF_8));
//                JsonElement appendedElement = GsonHelper.fromJson(((JsonReloadListenerAccess) this).byg_getGson(), reader, JsonElement.class);
//                return appendedElement.getAsJsonObject().getAsJsonArray("pools");
//            }
//        } catch (IOException e) {
//            BYG.logError("Could not read appended table:" + location);
//            e.printStackTrace();
//        }
//        return new JsonArray();
//    }
//}
