package net.cozystudios.obsidianequipmentrework;

import net.cozystudios.obsidianequipmentrework.datagen.ModModelProvider;
import net.cozystudios.obsidianequipmentrework.datagen.ModRecipeProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class ObsidianEquipmentReworkDataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        pack.addProvider(ModRecipeProvider::new);
        pack.addProvider(ModModelProvider::new);
    }
}