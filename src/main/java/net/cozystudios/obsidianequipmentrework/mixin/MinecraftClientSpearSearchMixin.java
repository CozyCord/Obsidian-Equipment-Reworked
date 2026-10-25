package net.cozystudios.obsidianequipmentrework.mixin;

import net.minecraft.item.ItemGroup;
import org.spongepowered.asm.mixin.Mixin;
//? if =1.20.1 {
/*import net.cozystudios.obsidianequipmentrework.item.ModItems;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
*///?}

@Mixin(ItemGroup.class)
public abstract class MinecraftClientSpearSearchMixin {

    //? if =1.20.1 {
    /*@Shadow private Set<ItemStack> field_40860;
    @Shadow private Consumer<List<ItemStack>> field_41035;

    @Inject(method = "method_47314", at = @At("HEAD"))
    private void obsidianequipmentrework$reorderObsidianSpear(CallbackInfo ci) {
        if (this.field_41035 == null) return;
        ItemGroup self = (ItemGroup) (Object) this;
        if (self != Registries.ITEM_GROUP.get(ItemGroups.SEARCH)) return;

        Item obsidianSpear = ModItems.OBSIDIAN_SPEAR;
        if (obsidianSpear == null) return;
        Item diamondSpear = Registries.ITEM.get(new Identifier("minecraft", "diamond_spear"));
        if (diamondSpear == Items.AIR) return;

        List<ItemStack> ordered = new ArrayList<>(this.field_40860);
        int diamondIdx = -1;
        int obsidianIdx = -1;
        for (int i = 0; i < ordered.size(); i++) {
            Item item = ordered.get(i).getItem();
            if (item == diamondSpear && diamondIdx == -1) diamondIdx = i;
            else if (item == obsidianSpear && obsidianIdx == -1) obsidianIdx = i;
        }
        if (diamondIdx < 0) return;
        if (obsidianIdx == diamondIdx + 1) return;

        if (obsidianIdx >= 0) {
            ItemStack obsidianStack = ordered.remove(obsidianIdx);
            if (obsidianIdx < diamondIdx) diamondIdx--;
            ordered.add(diamondIdx + 1, obsidianStack);
        } else {
            ordered.add(diamondIdx + 1, new ItemStack(obsidianSpear));
        }
        this.field_40860.clear();
        this.field_40860.addAll(ordered);
    }
    *///?}
}
