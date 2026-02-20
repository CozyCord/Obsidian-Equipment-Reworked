package net.cozystudios.obsidianequipmentrework.material;

//? if <1.21 {
/*import net.cozystudios.obsidianequipmentrework.item.ModItems;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public enum ModToolMaterials implements ToolMaterial {
    OBSIDIAN(4, 1800, 8.7f, 3.5f, 12);

    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;

    ModToolMaterials(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
    }

    @Override
    public int getDurability() { return itemDurability; }

    @Override
    public float getMiningSpeedMultiplier() { return miningSpeed; }

    @Override
    public float getAttackDamage() { return attackDamage; }

    @Override
    public int getMiningLevel() { return miningLevel; }

    @Override
    public int getEnchantability() { return enchantability; }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModItems.OBSIDIAN_INGOT);
    }
}
*///?} elif <1.21.2 {
import net.cozystudios.obsidianequipmentrework.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;

public enum ModToolMaterials implements ToolMaterial {
    OBSIDIAN(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 1800, 8.7f, 3.5f, 12);

    private final TagKey<Block> inverseTag;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;

    ModToolMaterials(TagKey<Block> inverseTag, int itemDurability, float miningSpeed, float attackDamage, int enchantability) {
        this.inverseTag = inverseTag;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
    }

    @Override
    public int getDurability() { return itemDurability; }

    @Override
    public float getMiningSpeedMultiplier() { return miningSpeed; }

    @Override
    public float getAttackDamage() { return attackDamage; }

    @Override
    public TagKey<Block> getInverseTag() { return inverseTag; }

    @Override
    public int getEnchantability() { return enchantability; }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModItems.OBSIDIAN_INGOT);
    }
}
//?} else {
/*import net.minecraft.block.Block;
import net.minecraft.item.ToolMaterial;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;

public class ModToolMaterials {
    public static final ToolMaterial OBSIDIAN = new ToolMaterial(
            BlockTags.INCORRECT_FOR_NETHERITE_TOOL,
            1800,
            8.7f,
            3.5f,
            12,
            ItemTags.DIAMOND_TOOL_MATERIALS
    );
}
*///?}
