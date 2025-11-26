package net.cozystudios.obsidianequipmentrework;

import net.cozystudios.obsidianequipmentrework.item.ModItems;
import net.cozystudios.obsidianequipmentrework.loot.ModLootTableModifiers;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ObsidianEquipmentRework implements ModInitializer {
	public static final String MOD_ID = "obsidianequipmentrework";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        ModItems.registerModItems();
        ModLootTableModifiers.registerLootTableModifiers();

        LOGGER.info("Obsidian Equipment Reworked initialized!");
	}
}