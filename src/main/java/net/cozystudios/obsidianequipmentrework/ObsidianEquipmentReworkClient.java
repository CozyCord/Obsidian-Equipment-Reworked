package net.cozystudios.obsidianequipmentrework;

import net.fabricmc.api.ClientModInitializer;
//? if =1.20.1 {
/*import net.cozystudios.obsidianequipmentrework.item.ModItems;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.client.util.ModelIdentifier;
import net.minecraft.item.ItemConvertible;
import net.minecraft.util.Identifier;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Map;
*///?}

public class ObsidianEquipmentReworkClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        //? if =1.20.1 {
        /*integrateObsidianSpearWithVanillaBackport();
        *///?}
    }

    //? if =1.20.1 {
    /*private static void integrateObsidianSpearWithVanillaBackport() {
        if (ModItems.OBSIDIAN_SPEAR == null) return;
        if (!FabricLoader.getInstance().isModLoaded("vanillabackport")) return;
        try {
            Class<?> spearRendererClass = Class.forName(
                    "com.blackgear.vanillabackport.client.level.renderer.item.SpearRenderer");
            Object spearRendererInstance = spearRendererClass.getField("INSTANCE").get(null);

            Field modelsField = spearRendererClass.getDeclaredField("SPEAR_MODELS");
            modelsField.setAccessible(true);
            @SuppressWarnings("unchecked")
            Map<ItemConvertible, ModelIdentifier> spearModels =
                    (Map<ItemConvertible, ModelIdentifier>) modelsField.get(null);
            spearModels.put(ModItems.OBSIDIAN_SPEAR, new ModelIdentifier(
                    new Identifier(ObsidianEquipmentRework.MOD_ID, "obsidian_spear_in_hand"),
                    "inventory"));

            Class<?> registryClass = Class.forName(
                    "com.blackgear.platform.client.v2.render.ItemRendererRegistry");
            com.google.common.base.Supplier<?> instanceSupplier =
                    (com.google.common.base.Supplier<?>) registryClass.getField("INSTANCE").get(null);
            Object registry = instanceSupplier.get();
            Class<?> rendererClass = Class.forName(
                    "com.blackgear.platform.client.v2.render.ItemRendererRegistry$Renderer");
            Method registerMethod = registryClass.getMethod("register",
                    net.minecraft.item.ItemConvertible.class, rendererClass);
            registerMethod.invoke(registry, ModItems.OBSIDIAN_SPEAR, spearRendererInstance);

            ObsidianEquipmentRework.LOGGER.info(
                    "Registered obsidian_spear with VanillaBackport SpearRenderer");
        } catch (Throwable t) {
            ObsidianEquipmentRework.LOGGER.warn(
                    "Failed to integrate obsidian_spear rendering with VanillaBackport", t);
        }
    }
    *///?}
}
