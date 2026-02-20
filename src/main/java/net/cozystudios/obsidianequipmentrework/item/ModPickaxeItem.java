package net.cozystudios.obsidianequipmentrework.item;

//? if <1.21 {
/*import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;

public class ModPickaxeItem extends PickaxeItem {
    public ModPickaxeItem(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }
}
*///?} elif <1.21.2 {
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;

public class ModPickaxeItem extends PickaxeItem {
    public ModPickaxeItem(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, settings.attributeModifiers(PickaxeItem.createAttributeModifiers(material, attackDamage, attackSpeed)));
    }
}
//?} else {
/*public class ModPickaxeItem {
    private ModPickaxeItem() {}
}
*///?}
