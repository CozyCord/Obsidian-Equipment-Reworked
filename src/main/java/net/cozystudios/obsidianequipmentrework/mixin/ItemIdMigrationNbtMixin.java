package net.cozystudios.obsidianequipmentrework.mixin;

//? if >=1.21.5 {
/*import net.cozystudios.obsidianequipmentrework.ObsidianEquipmentRework;
import net.minecraft.nbt.NbtCompound;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import java.util.Optional;

// For 1.21.5+ where ItemStack.fromNbt no longer exists.
// Intercepts NbtCompound.getString to remap old item IDs before
// the Codec-based ItemStack deserializer reads them.
// NOTE: getString(String) returns Optional<String> in 1.21.5+.
@Mixin(NbtCompound.class)
public abstract class ItemIdMigrationNbtMixin {

    private static final String OLD_NAMESPACE = "obsidianequipment:";
    private static final String NEW_NAMESPACE = "obsidianequipmentrework:";

    @Inject(method = "getString(Ljava/lang/String;)Ljava/util/Optional;", at = @At("RETURN"), cancellable = true)
    private void obsidianequipmentrework$remapOldIds(String key, CallbackInfoReturnable<Optional<String>> cir) {
        if (!"id".equals(key)) return;

        Optional<String> opt = cir.getReturnValue();
        if (opt == null || opt.isEmpty()) return;

        String value = opt.get();
        if (!value.startsWith(OLD_NAMESPACE)) return;

        String path = value.substring(OLD_NAMESPACE.length());
        // obsidian_shard has no equivalent in the reworked mod — map to obsidian_ingot
        if (path.equals("obsidian_shard")) {
            path = "obsidian_ingot";
        }

        String newId = NEW_NAMESPACE + path;
        cir.setReturnValue(Optional.of(newId));

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
