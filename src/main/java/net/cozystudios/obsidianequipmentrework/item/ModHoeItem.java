package net.cozystudios.obsidianequipmentrework.item;

//? if <1.21 {
/*import net.minecraft.item.HoeItem;
import net.minecraft.item.ToolMaterial;

public class ModHoeItem extends HoeItem {
    public ModHoeItem(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }
}
*///?} elif <1.21.2 {
import net.minecraft.item.HoeItem;
import net.minecraft.item.ToolMaterial;

public class ModHoeItem extends HoeItem {
    public ModHoeItem(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, settings.attributeModifiers(HoeItem.createAttributeModifiers(material, attackDamage, attackSpeed)));
    }
}
//?} else {
/*public class ModHoeItem {
    private ModHoeItem() {}
}
*///?}
