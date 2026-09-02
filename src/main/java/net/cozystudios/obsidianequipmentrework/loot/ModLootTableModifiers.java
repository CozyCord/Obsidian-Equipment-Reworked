package net.cozystudios.obsidianequipmentrework.loot;

import net.cozystudios.obsidianequipmentrework.item.ModItems;
//? if <1.21 {
/*import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTables;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.util.Identifier;

import java.util.Map;
import java.util.Set;

public class ModLootTableModifiers {
    private static final Set<Identifier> OBSIDIAN_HORSE_ARMOR_LOOT_TABLES = Set.of(
            LootTables.NETHER_BRIDGE_CHEST,
            LootTables.BASTION_TREASURE_CHEST,
            LootTables.RUINED_PORTAL_CHEST
    );

    private static final Map<Identifier, Float> OBSIDIAN_UPGRADE_TEMPLATE_LOOT_TABLES = Map.of(
            LootTables.BASTION_TREASURE_CHEST, 0.20f,
            LootTables.BASTION_OTHER_CHEST, 0.13f,
            LootTables.BASTION_BRIDGE_CHEST, 0.13f,
            LootTables.NETHER_BRIDGE_CHEST, 0.15f,
            LootTables.ABANDONED_MINESHAFT_CHEST, 0.11f,
            LootTables.STRONGHOLD_CORRIDOR_CHEST, 0.13f,
            LootTables.ANCIENT_CITY_CHEST, 0.15f,
            LootTables.RUINED_PORTAL_CHEST, 0.10f
    );

    public static void registerLootTableModifiers() {
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (OBSIDIAN_HORSE_ARMOR_LOOT_TABLES.contains(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.18f))
                        .with(ItemEntry.builder(ModItems.OBSIDIAN_HORSE_ARMOR));
                tableBuilder.pool(poolBuilder);
            }
            Float templateChance = OBSIDIAN_UPGRADE_TEMPLATE_LOOT_TABLES.get(id);
            if (templateChance != null) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(templateChance))
                        .with(ItemEntry.builder(ModItems.OBSIDIAN_UPGRADE_SMITHING_TEMPLATE));
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
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.registry.RegistryKey;

import java.util.Map;
import java.util.Set;

public class ModLootTableModifiers {
    private static final Set<RegistryKey<LootTable>> OBSIDIAN_HORSE_ARMOR_LOOT_TABLES = Set.of(
            LootTables.NETHER_BRIDGE_CHEST,
            LootTables.BASTION_TREASURE_CHEST,
            LootTables.RUINED_PORTAL_CHEST
    );

    private static final Map<RegistryKey<LootTable>, Float> OBSIDIAN_UPGRADE_TEMPLATE_LOOT_TABLES = Map.of(
            LootTables.BASTION_TREASURE_CHEST, 0.20f,
            LootTables.BASTION_OTHER_CHEST, 0.13f,
            LootTables.BASTION_BRIDGE_CHEST, 0.13f,
            LootTables.NETHER_BRIDGE_CHEST, 0.15f,
            LootTables.ABANDONED_MINESHAFT_CHEST, 0.11f,
            LootTables.STRONGHOLD_CORRIDOR_CHEST, 0.13f,
            LootTables.ANCIENT_CITY_CHEST, 0.15f,
            LootTables.RUINED_PORTAL_CHEST, 0.10f
    );

    //? if >=1.21.11 {
    /*private static final Set<RegistryKey<LootTable>> OBSIDIAN_NAUTILUS_ARMOR_LOOT_TABLES = Set.of(
            LootTables.SHIPWRECK_SUPPLY_CHEST,
            LootTables.UNDERWATER_RUIN_SMALL_CHEST,
            LootTables.UNDERWATER_RUIN_BIG_CHEST,
            LootTables.BURIED_TREASURE_CHEST
    );
    *///?}

    public static void registerLootTableModifiers() {
        LootTableEvents.MODIFY.register((key, tableBuilder, source, registries) -> {
            if (OBSIDIAN_HORSE_ARMOR_LOOT_TABLES.contains(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.18f))
                        .with(ItemEntry.builder(ModItems.OBSIDIAN_HORSE_ARMOR));
                tableBuilder.pool(poolBuilder);
            }
            Float templateChance = OBSIDIAN_UPGRADE_TEMPLATE_LOOT_TABLES.get(key);
            if (templateChance != null) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(templateChance))
                        .with(ItemEntry.builder(ModItems.OBSIDIAN_UPGRADE_SMITHING_TEMPLATE));
                tableBuilder.pool(poolBuilder);
            }
            //? if >=1.21.11 {
            /*if (OBSIDIAN_NAUTILUS_ARMOR_LOOT_TABLES.contains(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .conditionally(RandomChanceLootCondition.builder(0.004f))
                        .with(ItemEntry.builder(ModItems.OBSIDIAN_NAUTILUS_ARMOR));
                tableBuilder.pool(poolBuilder);
            }
            *///?}
        });
    }
}
//?}
