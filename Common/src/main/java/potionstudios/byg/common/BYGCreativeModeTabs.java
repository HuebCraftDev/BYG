package potionstudios.byg.common;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import potionstudios.byg.BYG;
import potionstudios.byg.common.item.BYGItems;
import potionstudios.byg.reg.RegistrationProvider;
import potionstudios.byg.reg.RegistryObject;

public class BYGCreativeModeTabs {
    private static final RegistrationProvider<CreativeModeTab> PROVIDER =
            RegistrationProvider.get(Registries.CREATIVE_MODE_TAB, BYG.MOD_ID);

    public static final RegistryObject<CreativeModeTab> BYG_TAB = PROVIDER.register(
            BYG.MOD_ID,
            () -> new CreativeModeTab.Builder(null, -1)
                    .icon(() -> new ItemStack(BYGItems.BYG_LOGO.get()))
                    .title(Component.translatable("itemGroup.byg.byg"))
                    .displayItems((displayParameters, pOutput) -> {
                        for (ResourceKey<Item> entry : BYGItems.REGISTRATION_ORDERED_ITEMS) {
                            Item pItem = BYGItems.PROVIDER.getRegistry().get(entry);

                            if (pItem != BYGItems.BYG_LOGO.get()) {
                                pOutput.accept(pItem);
                            }
                        }
                    })
                    .build()
    );

    public static void loadClass() {
    }
}
