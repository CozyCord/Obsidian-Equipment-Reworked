package net.cozystudios.obsidianequipmentrework.item;

import net.minecraft.item.Item;
import net.minecraft.item.SmithingTemplateItem;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;

import java.util.List;

public final class ObsidianUpgradeTemplate {

    private static final Formatting TITLE_FORMATTING = Formatting.GRAY;
    private static final Formatting DESCRIPTION_FORMATTING = Formatting.BLUE;

    private static final Text APPLIES_TO_TEXT =
            Text.translatable("item.obsidianequipmentrework.smithing_template.obsidian_upgrade.applies_to")
                    .formatted(DESCRIPTION_FORMATTING);
    private static final Text INGREDIENTS_TEXT =
            Text.translatable("item.obsidianequipmentrework.smithing_template.obsidian_upgrade.ingredients")
                    .formatted(DESCRIPTION_FORMATTING);
    private static final Text BASE_SLOT_DESCRIPTION_TEXT =
            Text.translatable("item.obsidianequipmentrework.smithing_template.obsidian_upgrade.base_slot_description")
                    .formatted(DESCRIPTION_FORMATTING);
    private static final Text ADDITIONS_SLOT_DESCRIPTION_TEXT =
            Text.translatable("item.obsidianequipmentrework.smithing_template.obsidian_upgrade.additions_slot_description")
                    .formatted(DESCRIPTION_FORMATTING);
    //? if <1.21.2 {
    private static final Text TITLE_TEXT =
            Text.translatable("upgrade.obsidianequipmentrework.obsidian_upgrade")
                    .formatted(TITLE_FORMATTING);
    //?}

    private static Identifier vId(String path) {
        //? if <1.21 {
        /*return new Identifier(path);
        *///?} else {
        return Identifier.ofVanilla(path);
        //?}
    }

    //? if <1.21.4 {
    private static List<Identifier> emptyBaseSlots() {
        return List.of(
                vId("item/empty_armor_slot_helmet"),
                vId("item/empty_slot_sword"),
                vId("item/empty_armor_slot_chestplate"),
                vId("item/empty_slot_pickaxe"),
                vId("item/empty_armor_slot_leggings"),
                vId("item/empty_slot_axe"),
                vId("item/empty_armor_slot_boots"),
                vId("item/empty_slot_shovel"),
                vId("item/empty_slot_hoe")
        );
    }

    private static List<Identifier> emptyAdditionsSlots() {
        return List.of(vId("item/empty_slot_ingot"));
    }
    //?} else {
    /*private static List<Identifier> emptyBaseSlots() {
        return List.of(
                vId("container/slot/helmet"),
                vId("container/slot/sword"),
                vId("container/slot/chestplate"),
                vId("container/slot/pickaxe"),
                vId("container/slot/leggings"),
                vId("container/slot/axe"),
                vId("container/slot/boots"),
                vId("container/slot/shovel"),
                vId("container/slot/hoe")
        );
    }

    private static List<Identifier> emptyAdditionsSlots() {
        return List.of(vId("container/slot/ingot"));
    }
    *///?}

    public static SmithingTemplateItem create(Item.Settings settings) {
        //? if <1.21.2 {
        return new SmithingTemplateItem(
                APPLIES_TO_TEXT,
                INGREDIENTS_TEXT,
                TITLE_TEXT,
                BASE_SLOT_DESCRIPTION_TEXT,
                ADDITIONS_SLOT_DESCRIPTION_TEXT,
                emptyBaseSlots(),
                emptyAdditionsSlots()
        );
        //?} else {
        /*return new SmithingTemplateItem(
                APPLIES_TO_TEXT,
                INGREDIENTS_TEXT,
                BASE_SLOT_DESCRIPTION_TEXT,
                ADDITIONS_SLOT_DESCRIPTION_TEXT,
                emptyBaseSlots(),
                emptyAdditionsSlots(),
                settings
        );
        *///?}
    }

    private ObsidianUpgradeTemplate() {
    }
}
