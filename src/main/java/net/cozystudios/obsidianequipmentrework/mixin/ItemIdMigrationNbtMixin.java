package net.cozystudios.obsidianequipmentrework.mixin;

//? if >=1.21.5 {
/*import net.cozystudios.obsidianequipmentrework.ObsidianEquipmentRework;
import net.minecraft.nbt.NbtCompound;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

// For 1.21.5+ where ItemStack.fromNbt no longer exists.
// Intercepts NbtCompound.getString to remap old item IDs before
// the Codec-based ItemStack deserializer reads them.
@Mixin(NbtCompound.class)
public abstract class ItemIdMigrationNbtMixin {

    private static final String OLD_NAMESPACE = "obsidianequipment:";
    private static final String NEW_NAMESPACE = "obsidianequipmentrework:";

    @Inject(method = "getString", at = @At("RETURN"), cancellable = true)
    private void obsidianequipmentrework$remapOldIds(String key, CallbackInfoReturnable<String> cir) {
        if (!"id".equals(key)) return;

        String value = cir.getReturnValue();
        if (value == null || !value.startsWith(OLD_NAMESPACE)) return;

        String path = value.substring(OLD_NAMESPACE.length());
        // obsidian_shard has no equivalent in the reworked mod — map to obsidian_ingot
        if (path.equals("obsidian_shard")) {
            path = "obsidian_ingot";
        }

        String newId = NEW_NAMESPACE + path;
        cir.setReturnValue(newId);

        ObsidianEquipmentRework.LOGGER.info("[ObsidianEquipmentRework] Migrated item {} -> {}", value, newId);
    }
}
*///?} else {
import org.spongepowered.asm.mixin.Mixin;
import net.minecraft.nbt.NbtCompound;

@Mixin(NbtCompound.class)
public abstract class ItemIdMigrationNbtMixin {
}
//?}
