package net.cozystudios.obsidianequipmentrework.item;

//? if <1.21 {
/*import net.minecraft.item.AxeItem;
import net.minecraft.item.ToolMaterial;

public class ModAxeItem extends AxeItem {
    public ModAxeItem(ToolMaterial material, float attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }
}
*///?} elif <1.21.2 {
import net.minecraft.item.AxeItem;
import net.minecraft.item.ToolMaterial;

public class ModAxeItem extends AxeItem {
    public ModAxeItem(ToolMaterial material, float attackDamage, float attackSpeed, Settings settings) {
        super(material, settings.attributeModifiers(AxeItem.createAttributeModifiers(material, attackDamage, attackSpeed)));
    }
}
//?} else {
/*public class ModAxeItem {
    private ModAxeItem() {}
}
*///?}
