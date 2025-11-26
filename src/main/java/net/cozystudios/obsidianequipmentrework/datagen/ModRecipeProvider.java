package net.cozystudios.obsidianequipmentrework.datagen;

import net.cozystudios.obsidianequipmentrework.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.CookingRecipeJsonBuilder;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
    @SuppressWarnings("unused")
    public ModRecipeProvider(FabricDataOutput output,
                             CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        CookingRecipeJsonBuilder.createBlasting(
                        Ingredient.ofItems(Items.OBSIDIAN),
                        RecipeCategory.MISC,
                        ModItems.OBSIDIAN_INGOT,
                        0.7f,
                        100)
                .criterion(hasItem(Items.OBSIDIAN), conditionsFromItem(Items.OBSIDIAN))
                .offerTo(exporter);

        var shardCriterion = hasItem(ModItems.OBSIDIAN_INGOT);

        // --- Tools ---

        // Sword
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.OBSIDIAN_SWORD)
                .pattern("O")
                .pattern("O")
                .pattern("S")
                .input('O', ModItems.OBSIDIAN_INGOT)
                .input('S', Items.STICK)
                .criterion(shardCriterion, conditionsFromItem(ModItems.OBSIDIAN_INGOT))
                .offerTo(exporter);

        // Pickaxe
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.OBSIDIAN_PICKAXE)
                .pattern("OOO")
                .pattern(" S ")
                .pattern(" S ")
                .input('O', ModItems.OBSIDIAN_INGOT)
                .input('S', Items.STICK)
                .criterion(shardCriterion, conditionsFromItem(ModItems.OBSIDIAN_INGOT))
                .offerTo(exporter);

        // Shovel
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.OBSIDIAN_SHOVEL)
                .pattern("O")
                .pattern("S")
                .pattern("S")
                .input('O', ModItems.OBSIDIAN_INGOT)
                .input('S', Items.STICK)
                .criterion(shardCriterion, conditionsFromItem(ModItems.OBSIDIAN_INGOT))
                .offerTo(exporter);

        // Axe
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.OBSIDIAN_AXE)
                .pattern("OO")
                .pattern("OS")
                .pattern(" S")
                .input('O', ModItems.OBSIDIAN_INGOT)
                .input('S', Items.STICK)
                .criterion(shardCriterion, conditionsFromItem(ModItems.OBSIDIAN_INGOT))
                .offerTo(exporter);

        // Hoe
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.OBSIDIAN_HOE)
                .pattern("OO")
                .pattern(" S")
                .pattern(" S")
                .input('O', ModItems.OBSIDIAN_INGOT)
                .input('S', Items.STICK)
                .criterion(shardCriterion, conditionsFromItem(ModItems.OBSIDIAN_INGOT))
                .offerTo(exporter);

        // --- Armor ---
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.OBSIDIAN_HELMET)
                .pattern("OOO")
                .pattern("O O")
                .input('O', ModItems.OBSIDIAN_INGOT)
                .criterion(shardCriterion, conditionsFromItem(ModItems.OBSIDIAN_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.OBSIDIAN_CHESTPLATE)
                .pattern("O O")
                .pattern("OOO")
                .pattern("OOO")
                .input('O', ModItems.OBSIDIAN_INGOT)
                .criterion(shardCriterion, conditionsFromItem(ModItems.OBSIDIAN_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.OBSIDIAN_LEGGINGS)
                .pattern("OOO")
                .pattern("O O")
                .pattern("O O")
                .input('O', ModItems.OBSIDIAN_INGOT)
                .criterion(shardCriterion, conditionsFromItem(ModItems.OBSIDIAN_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.OBSIDIAN_BOOTS)
                .pattern("O O")
                .pattern("O O")
                .input('O', ModItems.OBSIDIAN_INGOT)
                .criterion(shardCriterion, conditionsFromItem(ModItems.OBSIDIAN_INGOT))
                .offerTo(exporter);
    }
}
