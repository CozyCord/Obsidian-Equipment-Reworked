package net.cozystudios.obsidianequipmentrework.loot;

import net.cozystudios.obsidianequipmentrework.item.ModItems;
//? if <1.21 {
/*import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTables;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;

import java.util.Set;

public class ModLootTableModifiers {
    private static final Set<Identifier> OBSIDIAN_HORSE_ARMOR_LOOT_TABLES = Set.of(
            LootTables.NETHER_BRIDGE_CHEST,
            LootTables.BASTION_TREASURE_CHEST,
            LootTables.RUINED_PORTAL_CHEST
    );

    public static void registerLootTableModifiers() {
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (OBSIDIAN_HORSE_ARMOR_LOOT_TABLES.contains(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(UniformLootNumberProvider.create(0.0f, 1.0f))
                        .conditionally(RandomChanceLootCondition.builder(0.18f))
                        .with(ItemEntry.builder(ModItems.OBSIDIAN_HORSE_ARMOR));
                tableBuilder.pool(poolBuilder);
            }
        });
    }
}
*///?} else {
import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.LootTables;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.registry.RegistryKey;

import java.util.Set;

public class ModLootTableModifiers {
    private static final Set<RegistryKey<LootTable>> OBSIDIAN_HORSE_ARMOR_LOOT_TABLES = Set.of(
            LootTables.NETHER_BRIDGE_CHEST,
            LootTables.BASTION_TREASURE_CHEST,
            LootTables.RUINED_PORTAL_CHEST
    );

    public static void registerLootTableModifiers() {
        LootTableEvents.MODIFY.register((key, tableBuilder, source, registries) -> {
            if (OBSIDIAN_HORSE_ARMOR_LOOT_TABLES.contains(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(UniformLootNumberProvider.create(0.0f, 1.0f))
                        .conditionally(RandomChanceLootCondition.builder(0.18f))
                        .with(ItemEntry.builder(ModItems.OBSIDIAN_HORSE_ARMOR));
                tableBuilder.pool(poolBuilder);
            }
        });
    }
}
//?}
