package net.cozystudios.obsidianequipmentrework.mixin;

import net.cozystudios.obsidianequipmentrework.ObsidianEquipmentRework;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
//? if >=1.21 && <1.21.5 {
/*import net.minecraft.nbt.NbtElement;
import net.minecraft.registry.RegistryWrapper;
import java.util.Optional;
*///?}
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ItemStack.class)
public abstract class ItemIdMigrationMixin {

    @Unique
    private static final String OLD_NAMESPACE = "obsidianequipment:";
    @Unique
    private static final String NEW_NAMESPACE = "obsidianequipmentrework:";

    //? if <1.21 {
    @Inject(method = "fromNbt", at = @At("HEAD"))
    private static void obsidianequipmentrework$remapOldItems(NbtCompound nbt, CallbackInfoReturnable<ItemStack> cir) {
        obsidianequipmentrework$remapId(nbt);
    }
    //?} elif <1.21.5 {
    /*@Inject(method = "fromNbt", at = @At("HEAD"))
    private static void obsidianequipmentrework$remapOldItems(RegistryWrapper.WrapperLookup lookup, NbtElement nbt, CallbackInfoReturnable<Optional<ItemStack>> cir) {
        if (nbt instanceof NbtCompound compound) {
            obsidianequipmentrework$remapId(compound);
        }
    }
    *///?}

    //? if <1.21.5 {
    @Unique
    private static void obsidianequipmentrework$remapId(NbtCompound nbt) {
        if (!nbt.contains("id", 8)) return;

        String id = nbt.getString("id");
        if (!id.startsWith(OLD_NAMESPACE)) return;

        String path = id.substring(OLD_NAMESPACE.length());
        if (path.equals("obsidian_shard")) {
            path = "obsidian_ingot";
        }

        String newId = NEW_NAMESPACE + path;
        nbt.putString("id", newId);

        ObsidianEquipmentRework.LOGGER.info("[ObsidianEquipmentRework] Migrated item {} -> {}", id, newId);
    }
    //?}
}
