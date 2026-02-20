package net.cozystudios.obsidianequipmentrework.material;

//? if <1.21 {
/*import net.cozystudios.obsidianequipmentrework.ObsidianEquipmentRework;
import net.cozystudios.obsidianequipmentrework.item.ModItems;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvents;

public enum ModArmorMaterials implements ArmorMaterial {
    OBSIDIAN("obsidian", 35, new int[]{3, 6, 8, 3}, 12,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.5f, 0.05f);

    private static final int[] BASE_DURABILITY = new int[]{13, 15, 16, 11};
    private final String name;
    private final int durabilityMultiplier;
    private final int[] protectionAmounts;
    private final int enchantability;
    private final net.minecraft.sound.SoundEvent equipSound;
    private final float toughness;
    private final float knockbackResistance;

    ModArmorMaterials(String name, int durabilityMultiplier, int[] protectionAmounts,
                      int enchantability, net.minecraft.sound.SoundEvent equipSound,
                      float toughness, float knockbackResistance) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmounts = protectionAmounts;
        this.enchantability = enchantability;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
    }

    @Override
    public int getDurability(ArmorItem.Type type) {
        return BASE_DURABILITY[type.ordinal()] * durabilityMultiplier;
    }

    @Override
    public int getProtection(ArmorItem.Type type) {
        return protectionAmounts[type.ordinal()];
    }

    @Override
    public int getEnchantability() { return enchantability; }

    @Override
    public net.minecraft.sound.SoundEvent getEquipSound() { return equipSound; }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModItems.OBSIDIAN_INGOT);
    }

    @Override
    public String getName() {
        return ObsidianEquipmentRework.MOD_ID + ":" + name;
    }

    @Override
    public float getToughness() { return toughness; }

    @Override
    public float getKnockbackResistance() { return knockbackResistance; }
}
*///?} elif <1.21.2 {
import net.cozystudios.obsidianequipmentrework.ObsidianEquipmentRework;
import net.cozystudios.obsidianequipmentrework.item.ModItems;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.Map;

public class ModArmorMaterials {
    public static final RegistryEntry<ArmorMaterial> OBSIDIAN = registerArmorMaterial("obsidian");

    private static RegistryEntry<ArmorMaterial> registerArmorMaterial(String name) {
        ArmorMaterial material = new ArmorMaterial(
                Map.of(
                        ArmorItem.Type.HELMET, 3,
                        ArmorItem.Type.CHESTPLATE, 8,
                        ArmorItem.Type.LEGGINGS, 6,
                        ArmorItem.Type.BOOTS, 3
                ),
                12,
                SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
                () -> Ingredient.ofItems(ModItems.OBSIDIAN_INGOT),
                List.of(new ArmorMaterial.Layer(
                        Identifier.of(ObsidianEquipmentRework.MOD_ID, name)
                )),
                2.5f,
                0.05f
        );
        return Registry.registerReference(Registries.ARMOR_MATERIAL,
                Identifier.of(ObsidianEquipmentRework.MOD_ID, name), material);
    }

    public static void registerArmorMaterials() {
        ObsidianEquipmentRework.LOGGER.info("Registering armor materials");
    }
}
//?} elif <1.21.4 {
/*import net.cozystudios.obsidianequipmentrework.ObsidianEquipmentRework;
import net.minecraft.item.equipment.ArmorMaterial;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;

import java.util.Map;

public class ModArmorMaterials {
    public static final ArmorMaterial OBSIDIAN = new ArmorMaterial(
            35,
            Map.of(
                    EquipmentType.HELMET, 3,
                    EquipmentType.CHESTPLATE, 8,
                    EquipmentType.LEGGINGS, 6,
                    EquipmentType.BOOTS, 3
            ),
            12,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
            2.5f,
            0.05f,
            ItemTags.REPAIRS_DIAMOND_ARMOR,
            Identifier.of(ObsidianEquipmentRework.MOD_ID, "obsidian")
    );

    public static void registerArmorMaterials() {
        // No-op in 1.21.2+ (ArmorMaterial is not registered)
    }
}
*///?} else {
/*import net.cozystudios.obsidianequipmentrework.ObsidianEquipmentRework;
import net.minecraft.item.equipment.ArmorMaterial;
import net.minecraft.item.equipment.EquipmentAssetKeys;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;

import java.util.Map;

public class ModArmorMaterials {
    public static final ArmorMaterial OBSIDIAN = new ArmorMaterial(
            35,
            Map.of(
                    EquipmentType.HELMET, 3,
                    EquipmentType.CHESTPLATE, 8,
                    EquipmentType.LEGGINGS, 6,
                    EquipmentType.BOOTS, 3
            ),
            12,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
            2.5f,
            0.05f,
            ItemTags.REPAIRS_DIAMOND_ARMOR,
            RegistryKey.of(EquipmentAssetKeys.REGISTRY_KEY,
                    Identifier.of(ObsidianEquipmentRework.MOD_ID, "obsidian"))
    );

    public static void registerArmorMaterials() {
        // No-op in 1.21.4+ (ArmorMaterial is not registered)
    }
}
*///?}
