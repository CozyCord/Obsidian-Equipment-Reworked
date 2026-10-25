package net.cozystudios.obsidianequipmentrework.mixin;

//? if =1.20.1 {
/*import net.cozystudios.obsidianequipmentrework.item.ModItems;
import net.minecraft.client.gui.screen.ingame.CreativeInventoryScreen;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import java.lang.reflect.Field;
import java.util.List;
*///?}
//? if =1.20.1 {
/*@Mixin(CreativeInventoryScreen.class)
*///?}
public class CreativeSearchResultsMixin {

    //? if =1.20.1 {
    /*@Inject(
            method = "method_2464",
            at = @At(
                    value = "INVOKE",
                    target = "Lnet/minecraft/class_481$class_483;method_2473(F)V",
                    shift = org.spongepowered.asm.mixin.injection.At.Shift.BEFORE
            )
    )
    private void obsidianequipmentrework$reorderSearchResults(CallbackInfo ci) {
        Item obsidianSpear = ModItems.OBSIDIAN_SPEAR;
        if (obsidianSpear == null) return;
        Item diamondSpear = Registries.ITEM.get(new Identifier("minecraft", "diamond_spear"));
        if (diamondSpear == Items.AIR) return;

        try {
            CreativeInventoryScreen self = (CreativeInventoryScreen) (Object) this;
            ScreenHandler handler = self.getScreenHandler();
            Field itemListField = handler.getClass().getDeclaredField("field_2897");
            itemListField.setAccessible(true);
            @SuppressWarnings("unchecked")
            List<ItemStack> itemList = (List<ItemStack>) itemListField.get(handler);

            int diamondIdx = -1;
            int obsidianIdx = -1;
            for (int i = 0; i < itemList.size(); i++) {
                Item item = itemList.get(i).getItem();
                if (item == diamondSpear && diamondIdx == -1) diamondIdx = i;
                else if (item == obsidianSpear && obsidianIdx == -1) obsidianIdx = i;
            }
            if (diamondIdx < 0 || obsidianIdx < 0) return;
            if (obsidianIdx == diamondIdx + 1) return;

            ItemStack obsidianStack = itemList.remove(obsidianIdx);
            if (obsidianIdx < diamondIdx) diamondIdx--;
            itemList.add(diamondIdx + 1, obsidianStack);
        } catch (ReflectiveOperationException ignored) {
        }
    }
    *///?}
}
