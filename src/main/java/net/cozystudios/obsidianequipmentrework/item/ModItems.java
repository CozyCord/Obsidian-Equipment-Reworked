package net.cozystudios.obsidianequipmentrework.item;

import net.cozystudios.obsidianequipmentrework.ObsidianEquipmentRework;
import net.cozystudios.obsidianequipmentrework.material.ModArmorMaterials;
import net.cozystudios.obsidianequipmentrework.material.ModToolMaterials;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
//? if >=1.21 && <1.21.2 {
import net.minecraft.item.AnimalArmorItem;
//?}
//? if >=1.21.2 && <1.21.5 {
/*import net.minecraft.item.AnimalArmorItem;
import net.minecraft.item.equipment.EquipmentType;
*///?}
//? if >=1.21.5 {
/*import net.minecraft.item.equipment.EquipmentType;
*///?}
//? if >=1.21.2 {
/*import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
*///?}

public class ModItems {

    private static Item.Settings settings(String name) {
        //? if >=1.21.2 {
        /*return new Item.Settings()
                .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(ObsidianEquipmentRework.MOD_ID, name)));
        *///?} else {
        return new Item.Settings();
        //?}
    }

    public static final Item OBSIDIAN_INGOT = register("obsidian_ingot",
            new Item(settings("obsidian_ingot")));


    //? if <1.21 {
    /*public static final SwordItem OBSIDIAN_SWORD = register("obsidian_sword",
            new SwordItem(ModToolMaterials.OBSIDIAN, 3, -2.4f, settings("obsidian_sword")));
    *///?} elif <1.21.2 {
    public static final SwordItem OBSIDIAN_SWORD = register("obsidian_sword",
            new SwordItem(ModToolMaterials.OBSIDIAN, settings("obsidian_sword")
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.OBSIDIAN, 3, -2.4f))));
    //?} elif <1.21.5 {
    /*public static final SwordItem OBSIDIAN_SWORD = register("obsidian_sword",
            new SwordItem(ModToolMaterials.OBSIDIAN, 3f, -2.4f, settings("obsidian_sword")));
    *///?} else {
    /*public static final Item OBSIDIAN_SWORD = register("obsidian_sword",
            new Item(settings("obsidian_sword").sword(ModToolMaterials.OBSIDIAN, 3f, -2.4f)));
    *///?}

    //? if <1.21 {
    /*public static final ModPickaxeItem OBSIDIAN_PICKAXE = register("obsidian_pickaxe",
            new ModPickaxeItem(ModToolMaterials.OBSIDIAN, 1, -2.8f, settings("obsidian_pickaxe")));
    *///?} elif <1.21.2 {
    public static final ModPickaxeItem OBSIDIAN_PICKAXE = register("obsidian_pickaxe",
            new ModPickaxeItem(ModToolMaterials.OBSIDIAN, 1, -2.8f, settings("obsidian_pickaxe")));
    //?} elif <1.21.5 {
    /*public static final PickaxeItem OBSIDIAN_PICKAXE = register("obsidian_pickaxe",
            new PickaxeItem(ModToolMaterials.OBSIDIAN, 1f, -2.8f, settings("obsidian_pickaxe")));
    *///?} else {
    /*public static final Item OBSIDIAN_PICKAXE = register("obsidian_pickaxe",
            new Item(settings("obsidian_pickaxe").pickaxe(ModToolMaterials.OBSIDIAN, 1f, -2.8f)));
    *///?}

    //? if <1.21 {
    /*public static final ShovelItem OBSIDIAN_SHOVEL = register("obsidian_shovel",
            new ShovelItem(ModToolMaterials.OBSIDIAN, 1.5f, -3.0f, settings("obsidian_shovel")));
    *///?} elif <1.21.2 {
    public static final ShovelItem OBSIDIAN_SHOVEL = register("obsidian_shovel",
            new ShovelItem(ModToolMaterials.OBSIDIAN, settings("obsidian_shovel")
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.OBSIDIAN, 1.5f, -3.0f))));
    //?} elif <1.21.5 {
    /*public static final ShovelItem OBSIDIAN_SHOVEL = register("obsidian_shovel",
            new ShovelItem(ModToolMaterials.OBSIDIAN, 1.5f, -3.0f, settings("obsidian_shovel")));
    *///?} else {
    /*public static final Item OBSIDIAN_SHOVEL = register("obsidian_shovel",
            new ShovelItem(ModToolMaterials.OBSIDIAN, 1.5f, -3.0f, settings("obsidian_shovel")));
    *///?}

    //? if <1.21 {
    /*public static final ModAxeItem OBSIDIAN_AXE = register("obsidian_axe",
            new ModAxeItem(ModToolMaterials.OBSIDIAN, 5.0f, -3.1f, settings("obsidian_axe")));
    *///?} elif <1.21.2 {
    public static final ModAxeItem OBSIDIAN_AXE = register("obsidian_axe",
            new ModAxeItem(ModToolMaterials.OBSIDIAN, 5.0f, -3.1f, settings("obsidian_axe")));
    //?} elif <1.21.5 {
    /*public static final AxeItem OBSIDIAN_AXE = register("obsidian_axe",
            new AxeItem(ModToolMaterials.OBSIDIAN, 5.0f, -3.1f, settings("obsidian_axe")));
    *///?} else {
    /*public static final Item OBSIDIAN_AXE = register("obsidian_axe",
            new AxeItem(ModToolMaterials.OBSIDIAN, 5.0f, -3.1f, settings("obsidian_axe")));
    *///?}

    //? if <1.21 {
    /*public static final ModHoeItem OBSIDIAN_HOE = register("obsidian_hoe",
            new ModHoeItem(ModToolMaterials.OBSIDIAN, -2, 0.0f, settings("obsidian_hoe")));
    *///?} elif <1.21.2 {
    public static final ModHoeItem OBSIDIAN_HOE = register("obsidian_hoe",
            new ModHoeItem(ModToolMaterials.OBSIDIAN, -2, 0.0f, settings("obsidian_hoe")));
    //?} elif <1.21.5 {
    /*public static final HoeItem OBSIDIAN_HOE = register("obsidian_hoe",
            new HoeItem(ModToolMaterials.OBSIDIAN, -2f, 0.0f, settings("obsidian_hoe")));
    *///?} else {
    /*public static final Item OBSIDIAN_HOE = register("obsidian_hoe",
            new HoeItem(ModToolMaterials.OBSIDIAN, -2f, 0.0f, settings("obsidian_hoe")));
    *///?}


    //? if <1.21 {
    /*public static final ArmorItem OBSIDIAN_HELMET = register("obsidian_helmet",
            new ArmorItem(ModArmorMaterials.OBSIDIAN, ArmorItem.Type.HELMET, settings("obsidian_helmet")));
    public static final ArmorItem OBSIDIAN_CHESTPLATE = register("obsidian_chestplate",
            new ArmorItem(ModArmorMaterials.OBSIDIAN, ArmorItem.Type.CHESTPLATE, settings("obsidian_chestplate")));
    public static final ArmorItem OBSIDIAN_LEGGINGS = register("obsidian_leggings",
            new ArmorItem(ModArmorMaterials.OBSIDIAN, ArmorItem.Type.LEGGINGS, settings("obsidian_leggings")));
    public static final ArmorItem OBSIDIAN_BOOTS = register("obsidian_boots",
            new ArmorItem(ModArmorMaterials.OBSIDIAN, ArmorItem.Type.BOOTS, settings("obsidian_boots")));
    *///?} elif <1.21.2 {
    public static final ArmorItem OBSIDIAN_HELMET = register("obsidian_helmet",
            new ArmorItem(ModArmorMaterials.OBSIDIAN, ArmorItem.Type.HELMET,
                    settings("obsidian_helmet").maxDamage(ArmorItem.Type.HELMET.getMaxDamage(35))));
    public static final ArmorItem OBSIDIAN_CHESTPLATE = register("obsidian_chestplate",
            new ArmorItem(ModArmorMaterials.OBSIDIAN, ArmorItem.Type.CHESTPLATE,
                    settings("obsidian_chestplate").maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(35))));
    public static final ArmorItem OBSIDIAN_LEGGINGS = register("obsidian_leggings",
            new ArmorItem(ModArmorMaterials.OBSIDIAN, ArmorItem.Type.LEGGINGS,
                    settings("obsidian_leggings").maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(35))));
    public static final ArmorItem OBSIDIAN_BOOTS = register("obsidian_boots",
            new ArmorItem(ModArmorMaterials.OBSIDIAN, ArmorItem.Type.BOOTS,
                    settings("obsidian_boots").maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(35))));
    //?} elif <1.21.5 {
    /*public static final ArmorItem OBSIDIAN_HELMET = register("obsidian_helmet",
            new ArmorItem(ModArmorMaterials.OBSIDIAN, EquipmentType.HELMET,
                    settings("obsidian_helmet").maxDamage(EquipmentType.HELMET.getMaxDamage(35))));
    public static final ArmorItem OBSIDIAN_CHESTPLATE = register("obsidian_chestplate",
            new ArmorItem(ModArmorMaterials.OBSIDIAN, EquipmentType.CHESTPLATE,
                    settings("obsidian_chestplate").maxDamage(EquipmentType.CHESTPLATE.getMaxDamage(35))));
    public static final ArmorItem OBSIDIAN_LEGGINGS = register("obsidian_leggings",
            new ArmorItem(ModArmorMaterials.OBSIDIAN, EquipmentType.LEGGINGS,
                    settings("obsidian_leggings").maxDamage(EquipmentType.LEGGINGS.getMaxDamage(35))));
    public static final ArmorItem OBSIDIAN_BOOTS = register("obsidian_boots",
            new ArmorItem(ModArmorMaterials.OBSIDIAN, EquipmentType.BOOTS,
                    settings("obsidian_boots").maxDamage(EquipmentType.BOOTS.getMaxDamage(35))));
    *///?} else {
    /*public static final Item OBSIDIAN_HELMET = register("obsidian_helmet",
            new Item(settings("obsidian_helmet")
                    .armor(ModArmorMaterials.OBSIDIAN, EquipmentType.HELMET)
                    .maxDamage(EquipmentType.HELMET.getMaxDamage(35))));
    public static final Item OBSIDIAN_CHESTPLATE = register("obsidian_chestplate",
            new Item(settings("obsidian_chestplate")
                    .armor(ModArmorMaterials.OBSIDIAN, EquipmentType.CHESTPLATE)
                    .maxDamage(EquipmentType.CHESTPLATE.getMaxDamage(35))));
    public static final Item OBSIDIAN_LEGGINGS = register("obsidian_leggings",
            new Item(settings("obsidian_leggings")
                    .armor(ModArmorMaterials.OBSIDIAN, EquipmentType.LEGGINGS)
                    .maxDamage(EquipmentType.LEGGINGS.getMaxDamage(35))));
    public static final Item OBSIDIAN_BOOTS = register("obsidian_boots",
            new Item(settings("obsidian_boots")
                    .armor(ModArmorMaterials.OBSIDIAN, EquipmentType.BOOTS)
                    .maxDamage(EquipmentType.BOOTS.getMaxDamage(35))));
    *///?}


    //? if <1.21 {
    /*public static final HorseArmorItem OBSIDIAN_HORSE_ARMOR = register("obsidian_horse_armor",
            new HorseArmorItem(15, "obsidian", settings("obsidian_horse_armor").maxCount(1)));
    *///?} elif <1.21.2 {
    public static final AnimalArmorItem OBSIDIAN_HORSE_ARMOR = register("obsidian_horse_armor",
            new AnimalArmorItem(ModArmorMaterials.OBSIDIAN, AnimalArmorItem.Type.EQUESTRIAN,
                    false, settings("obsidian_horse_armor").maxCount(1)));
    //?} elif <1.21.5 {
    /*public static final AnimalArmorItem OBSIDIAN_HORSE_ARMOR = register("obsidian_horse_armor",
            new AnimalArmorItem(ModArmorMaterials.OBSIDIAN, AnimalArmorItem.Type.EQUESTRIAN,
                    settings("obsidian_horse_armor").maxCount(1)));
    *///?} else {
    /*public static final Item OBSIDIAN_HORSE_ARMOR = register("obsidian_horse_armor",
            new Item(settings("obsidian_horse_armor").horseArmor(ModArmorMaterials.OBSIDIAN).maxCount(1)));
    *///?}


    //? if >=1.21.11 {
    /*public static final Item OBSIDIAN_SPEAR = register("obsidian_spear",
            new Item(settings("obsidian_spear").spear(ModToolMaterials.OBSIDIAN,
                    1.1f, 1.14f, 0.45f, 2.75f, 7.25f, 6.0f, 5.1f, 9.375f, 4.6f)));
    *///?}


    //? if >=1.21.11 {
    /*public static final Item OBSIDIAN_NAUTILUS_ARMOR = register("obsidian_nautilus_armor",
            new Item(settings("obsidian_nautilus_armor").nautilusArmor(ModArmorMaterials.OBSIDIAN).maxCount(1)));
    *///?}


    private static <T extends Item> T register(String name, T item) {
        //? if <1.21 {
        /*return Registry.register(Registries.ITEM, new Identifier(ObsidianEquipmentRework.MOD_ID, name), item);
        *///?} else {
        return Registry.register(Registries.ITEM, Identifier.of(ObsidianEquipmentRework.MOD_ID, name), item);
        //?}
    }

    public static void registerModItems() {
        ObsidianEquipmentRework.LOGGER.info("Registering mod items for " + ObsidianEquipmentRework.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> {
            entries.addAfter(Items.DIAMOND_HOE, OBSIDIAN_SHOVEL, OBSIDIAN_PICKAXE, OBSIDIAN_AXE, OBSIDIAN_HOE);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> {
            entries.addAfter(Items.DIAMOND_SWORD, OBSIDIAN_SWORD);
            entries.addAfter(Items.DIAMOND_AXE, OBSIDIAN_AXE);
            //? if >=1.21.11 {
            /*entries.addAfter(Items.DIAMOND_SPEAR, OBSIDIAN_SPEAR);
            *///?}
            entries.addAfter(Items.DIAMOND_BOOTS, OBSIDIAN_HELMET, OBSIDIAN_CHESTPLATE, OBSIDIAN_LEGGINGS, OBSIDIAN_BOOTS);
            entries.addAfter(Items.DIAMOND_HORSE_ARMOR, OBSIDIAN_HORSE_ARMOR);
            //? if >=1.21.11 {
            /*entries.addAfter(Items.DIAMOND_NAUTILUS_ARMOR, OBSIDIAN_NAUTILUS_ARMOR);
            *///?}
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.addAfter(Items.GOLD_INGOT, OBSIDIAN_INGOT);
        });
    }
}
