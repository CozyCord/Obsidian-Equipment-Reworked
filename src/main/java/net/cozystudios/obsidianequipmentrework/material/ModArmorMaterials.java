package net.cozystudios.obsidianequipmentrework.material;

import net.cozystudios.obsidianequipmentrework.ObsidianEquipmentRework;
import net.cozystudios.obsidianequipmentrework.item.ModItems;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvents;

public enum ModArmorMaterials implements ArmorMaterial {
    OBSIDIAN(
            "obsidian",
            35,
            new int[]{3, 7, 9, 4},
            12,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
            2.5f,
            0.05f
    );

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
    public int getEnchantability() {
        return enchantability;
    }

    @Override
    public net.minecraft.sound.SoundEvent getEquipSound() {
        return equipSound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModItems.OBSIDIAN_INGOT);
    }

    @Override
    public String getName() {
        return ObsidianEquipmentRework.MOD_ID + ":" + name;
    }

    @Override
    public float getToughness() {
        return toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return knockbackResistance;
    }
}