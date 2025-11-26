package net.cozystudios.obsidianequipmentrework.item;

import net.cozystudios.obsidianequipmentrework.ObsidianEquipmentRework;
import net.cozystudios.obsidianequipmentrework.material.ModArmorMaterials;
import net.cozystudios.obsidianequipmentrework.material.ModToolMaterials;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item OBSIDIAN_INGOT = register("obsidian_ingot",
            new Item(new Item.Settings()));

    // Tools
    public static final SwordItem OBSIDIAN_SWORD = register("obsidian_sword",
            new SwordItem(ModToolMaterials.OBSIDIAN, 3, -2.4f, new Item.Settings()));

    public static final ModPickaxeItem OBSIDIAN_PICKAXE = register("obsidian_pickaxe",
            new ModPickaxeItem(ModToolMaterials.OBSIDIAN, 1, -2.8f, new Item.Settings()));

    public static final ShovelItem OBSIDIAN_SHOVEL = register("obsidian_shovel",
            new ShovelItem(ModToolMaterials.OBSIDIAN, 1.5f, -3.0f, new Item.Settings()));

    public static final ModAxeItem OBSIDIAN_AXE = register("obsidian_axe",
            new ModAxeItem(ModToolMaterials.OBSIDIAN, 5.0f, -3.1f, new Item.Settings()));

    public static final ModHoeItem OBSIDIAN_HOE = register("obsidian_hoe",
            new ModHoeItem(ModToolMaterials.OBSIDIAN, -2, 0.0f, new Item.Settings()));

    // Armor
    public static final ArmorItem OBSIDIAN_HELMET = register("obsidian_helmet",
            new ArmorItem(ModArmorMaterials.OBSIDIAN, ArmorItem.Type.HELMET, new Item.Settings()));

    public static final ArmorItem OBSIDIAN_CHESTPLATE = register("obsidian_chestplate",
            new ArmorItem(ModArmorMaterials.OBSIDIAN, ArmorItem.Type.CHESTPLATE, new Item.Settings()));

    public static final ArmorItem OBSIDIAN_LEGGINGS = register("obsidian_leggings",
            new ArmorItem(ModArmorMaterials.OBSIDIAN, ArmorItem.Type.LEGGINGS, new Item.Settings()));

    public static final ArmorItem OBSIDIAN_BOOTS = register("obsidian_boots",
            new ArmorItem(ModArmorMaterials.OBSIDIAN, ArmorItem.Type.BOOTS, new Item.Settings()));

    // Horse armor
    public static final HorseArmorItem OBSIDIAN_HORSE_ARMOR = register("obsidian_horse_armor",
            new HorseArmorItem(15,
                    "obsidian",
                    new Item.Settings().maxCount(1)));

    private static <T extends Item> T register(String name, T item) {
        return Registry.register(Registries.ITEM, new Identifier(ObsidianEquipmentRework.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ObsidianEquipmentRework.LOGGER.info("Registering mod items for " + ObsidianEquipmentRework.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> {
            entries.add(OBSIDIAN_PICKAXE);
            entries.add(OBSIDIAN_SHOVEL);
            entries.add(OBSIDIAN_AXE);
            entries.add(OBSIDIAN_HOE);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> {
            entries.add(OBSIDIAN_SWORD);
            entries.add(OBSIDIAN_AXE);
            entries.add(OBSIDIAN_HELMET);
            entries.add(OBSIDIAN_CHESTPLATE);
            entries.add(OBSIDIAN_LEGGINGS);
            entries.add(OBSIDIAN_BOOTS);
            entries.add(OBSIDIAN_HORSE_ARMOR);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(OBSIDIAN_INGOT);
        });
    }
}
