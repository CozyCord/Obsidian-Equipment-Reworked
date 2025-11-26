package net.cozystudios.obsidianequipmentrework.datagen;

import net.cozystudios.obsidianequipmentrework.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {

    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator generator) {}

    @Override
    public void generateItemModels(ItemModelGenerator itemGen) {
        itemGen.register(ModItems.OBSIDIAN_SWORD, Models.HANDHELD);
        itemGen.register(ModItems.OBSIDIAN_PICKAXE, Models.HANDHELD);
        itemGen.register(ModItems.OBSIDIAN_AXE, Models.HANDHELD);
        itemGen.register(ModItems.OBSIDIAN_SHOVEL, Models.HANDHELD);
        itemGen.register(ModItems.OBSIDIAN_HOE, Models.HANDHELD);

        itemGen.register(ModItems.OBSIDIAN_HELMET, Models.GENERATED);
        itemGen.register(ModItems.OBSIDIAN_CHESTPLATE, Models.GENERATED);
        itemGen.register(ModItems.OBSIDIAN_LEGGINGS, Models.GENERATED);
        itemGen.register(ModItems.OBSIDIAN_BOOTS, Models.GENERATED);

        itemGen.register(ModItems.OBSIDIAN_INGOT, Models.GENERATED);
        itemGen.register(ModItems.OBSIDIAN_HORSE_ARMOR, Models.GENERATED);
    }
}