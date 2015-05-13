package com.camp.recipie;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import com.camp.block.BlockManager;
import com.camp.item.ItemManager;

import cpw.mods.fml.common.registry.GameRegistry;

public class RecipieManager {
	public static void mainRegistry(){
        addCraftingRecipes();
        addSmeltingRecipes();
 
    }//end mainRegistry
	public static void addCraftingRecipes() {
		//End Portal
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.end_portal,1),ItemManager.customItem);
		//diamond block crafting
    	GameRegistry.addShapelessRecipe(new ItemStack(Blocks.diamond_block,500000000),Blocks.dragon_egg, Blocks.lava);
    	//lava crafting
    	GameRegistry.addShapelessRecipe(new ItemStack(Blocks.lava,1),Blocks.dirt, Blocks.cobblestone);
    	//dragon egg crafting
    	GameRegistry.addShapelessRecipe(new ItemStack(Blocks.dragon_egg,1),Items.ender_pearl, Items.ender_eye);
    	//bedrock crafting
    	GameRegistry.addShapelessRecipe(new ItemStack(Blocks.bedrock,1),Blocks.stone, Items.bed);
    	//carpet to wool crafting
    	GameRegistry.addShapelessRecipe(new ItemStack(Blocks.wool,2),Blocks.carpet, Blocks.carpet,Blocks.carpet);
    	//iron ingot smelting
    	GameRegistry.addSmelting(Items.iron_ingot, new ItemStack(Blocks.fire), 0.1f);
    	//horse armor rotation
    	GameRegistry.addSmelting(Items.golden_horse_armor, new ItemStack(Items.iron_horse_armor), 10.0f);
    	GameRegistry.addSmelting(Items.iron_horse_armor, new ItemStack(Items.diamond_horse_armor), 10.0f);
    	GameRegistry.addSmelting(Items.diamond_horse_armor, new ItemStack(Items.golden_horse_armor), 10.0f);
    	//music disc rotation
    	GameRegistry.addSmelting(Items.record_13, new ItemStack(Items.record_11), 0.1f);
    	GameRegistry.addSmelting(Items.record_blocks, new ItemStack(Items.record_13), 0.1f);
    	GameRegistry.addSmelting(Items.record_cat, new ItemStack(Items.record_blocks), 0.1f);
    	GameRegistry.addSmelting(Items.record_chirp, new ItemStack(Items.record_cat), 0.1f);
    	GameRegistry.addSmelting(Items.record_far, new ItemStack(Items.record_chirp), 0.1f);
    	GameRegistry.addSmelting(Items.record_mall, new ItemStack(Items.record_far), 0.1f);
    	GameRegistry.addSmelting(Items.record_mellohi, new ItemStack(Items.record_mall), 0.1f);
    	GameRegistry.addSmelting(Items.record_stal, new ItemStack(Items.record_mellohi), 0.1f);
    	GameRegistry.addSmelting(Items.record_strad, new ItemStack(Items.record_stal), 0.1f);
    	GameRegistry.addSmelting(Items.record_wait, new ItemStack(Items.record_strad), 0.1f);
    	GameRegistry.addSmelting(Items.record_ward, new ItemStack(Items.record_wait), 0.1f);
    	GameRegistry.addSmelting(Items.record_11, new ItemStack(Items.record_ward), 0.1f);
    	//command block crafting
    	GameRegistry.addRecipe(new ItemStack(Blocks.command_block,1), new Object[]{
    		"TTT","TRT","TTT",'T',Items.iron_ingot,'R',Items.redstone,
    		});
    	//nether star crafting
    	ItemStack skullStackWither = new ItemStack(Items.skull,1);
    	skullStackWither.setItemDamage(1);
    	GameRegistry.addRecipe(new ItemStack(Items.nether_star,1), new Object[]{
    		"TPT","PRP","TPT",'T',Blocks.soul_sand,'R',skullStackWither,'P',Blocks.diamond_block,
    		});
    	//notch apple crafting
    	ItemStack skullStackApple = new ItemStack(Items.golden_apple,1);
    	skullStackApple.setItemDamage(1);
    	GameRegistry.addRecipe(new ItemStack(Items.golden_apple,1,1), new Object[]{
    		"TPQ","SRS","QPT",'T',Items.diamond,'R',Items.golden_apple,'P',Items.emerald,'S',Items.iron_ingot,'Q',Items.gold_ingot,
    		});
    	//GameRegistry.addRecipe((new ItemStack(Items.emerald)), "xxx", "xxx", "xxx", 'x', ItemManager.emeraldnugget);
    	//GameRegistry.addRecipe(new ItemStack(ItemManager.EmeraldRod), " x", " y", 'x', ItemManager.emeraldnugget, 'y', Items.redstone);
    	//GameRegistry.addRecipe(new ItemStack(ItemManager.emeraldsword), " x ", " x ", " y ", 'x', Items.emerald, 'y', ItemManager.EmeraldRod);
    	//GameRegistry.addRecipe(new ItemStack(ItemManager.bapple), "xyx", "yzy", "xyx", 'x', Items.fermented_spider_eye, 'y', Items.poisonous_potato, 'z', Items.apple);
    	GameRegistry.addRecipe(new ItemStack(Items.cooked_chicken), "xxx", "xyx", "xxx", 'x', Items.stick, 'y', Items.chicken);
    	GameRegistry.addRecipe(new ItemStack(BlockManager.customBlock, 1), "xxx", "xyx", "xxx", 'x', Blocks.glass, 'y', Blocks.glowstone);
    	//GameRegistry.addRecipe(new ItemStack(BlockManager.CakeBlock), "xxx", "yzy", "wvw", 'y', Items.milk_bucket, 'x', Items.sugar, 'z', Items.egg, 'w', Items.wheat, 'v', Items.bread);
    	GameRegistry.addRecipe(new ItemStack(ItemManager.customItem), "xyx", "yzy", "xyx", 'x', Items.diamond, 'y', Items.emerald, 'z', Items.apple);
    	GameRegistry.addRecipe(new ItemStack(ItemManager.lightningHammer), "xyx", "yzy", "wzw", 'x', Items.gold_ingot, 'y', Items.diamond, 'z', Items.stick, 'w', Items.redstone);	
    	GameRegistry.addRecipe(new ItemStack(ItemManager.customShovel), " x ", " y ", " y ", 'x', ItemManager.tutorial_item, 'y', Items.stick);
    	GameRegistry.addRecipe(new ItemStack(ItemManager.customHoe), "xx ", " y ", " y ", 'x', ItemManager.tutorial_item, 'y', Items.stick);
    	GameRegistry.addRecipe(new ItemStack(ItemManager.customPickaxe), "xxx", " y ", " y ", 'x', ItemManager.tutorial_item, 'y', Items.stick);
    	GameRegistry.addRecipe(new ItemStack(ItemManager.customAxe), "xx ", "xy ", " y ", 'x', ItemManager.tutorial_item, 'y', Items.stick);
    	GameRegistry.addRecipe(new ItemStack(ItemManager.customSword), " x ", " x ", " y ", 'x', ItemManager.tutorial_item, 'y', Items.stick);
    	GameRegistry.addRecipe(new ItemStack(ItemManager.customHelmet), "xxx", "x x", "   ", 'x', ItemManager.tutorial_item);
    	GameRegistry.addRecipe(new ItemStack(ItemManager.customChestplate), "x x", "xxx", "xxx", 'x', ItemManager.tutorial_item);
    	GameRegistry.addRecipe(new ItemStack(ItemManager.customLeggings), "xxx", "x x", "x x", 'x', ItemManager.tutorial_item);
    	GameRegistry.addRecipe(new ItemStack(ItemManager.customBoots), "   ", "x x", "x x", 'x', ItemManager.tutorial_item);
    	GameRegistry.addRecipe(new ItemStack(BlockManager.rubyBlock), "xxx", "xxx", "xxx", 'x', ItemManager.tutorial_item);
    	GameRegistry.addShapelessRecipe(new ItemStack(ItemManager.tutorial_item, 9), BlockManager.rubyBlock);
    	
	}
	public static void addSmeltingRecipes() { 
		ItemStack potionPoisonStack = new ItemStack(Items.potionitem, 1, 8292);
    	GameRegistry.addSmelting(Items.poisonous_potato, potionPoisonStack, 0.1f);
    	GameRegistry.addSmelting(Items.rotten_flesh, new ItemStack(Items.leather), 0.1f);
    	//stone brick smelting
    	ItemStack stoneStackCrack = new ItemStack(Blocks.stonebrick);
    	stoneStackCrack.setItemDamage(2);
    	GameRegistry.addSmelting(Blocks.stonebrick, stoneStackCrack, 0.1f);
    	GameRegistry.addSmelting(Blocks.stone, new ItemStack(Blocks.stonebrick), 0.1f);
    	//carpet smelting
    	ItemStack carpetStackWhite = new ItemStack(Blocks.carpet);
    	ItemStack carpetStackOrange = new ItemStack(Blocks.carpet);
    	ItemStack carpetStackMagenta = new ItemStack(Blocks.carpet);
    	ItemStack carpetStackLightBlue = new ItemStack(Blocks.carpet);
    	ItemStack carpetStackYellow = new ItemStack(Blocks.carpet);
    	ItemStack carpetStackLime = new ItemStack(Blocks.carpet);
    	ItemStack carpetStackPink = new ItemStack(Blocks.carpet);
    	ItemStack carpetStackGrey = new ItemStack(Blocks.carpet);
    	ItemStack carpetStackLightGrey = new ItemStack(Blocks.carpet);
    	ItemStack carpetStackCyan = new ItemStack(Blocks.carpet);
    	ItemStack carpetStackPurple = new ItemStack(Blocks.carpet);
    	ItemStack carpetStackBlue = new ItemStack(Blocks.carpet);
    	ItemStack carpetStackBrown = new ItemStack(Blocks.carpet);
    	ItemStack carpetStackGreen = new ItemStack(Blocks.carpet);
    	ItemStack carpetStackRed = new ItemStack(Blocks.carpet);
    	ItemStack carpetStackBlack = new ItemStack(Blocks.carpet);
    	carpetStackWhite.setItemDamage(0);
    	carpetStackOrange.setItemDamage(1);
    	carpetStackMagenta.setItemDamage(2);
    	carpetStackLightBlue.setItemDamage(3);
    	carpetStackYellow.setItemDamage(4);
    	carpetStackLime.setItemDamage(5);
    	carpetStackPink.setItemDamage(6);
    	carpetStackGrey.setItemDamage(7);
    	carpetStackLightGrey.setItemDamage(8);
    	carpetStackCyan.setItemDamage(9);
    	carpetStackPurple.setItemDamage(10);
    	carpetStackBlue.setItemDamage(11);
    	carpetStackBrown.setItemDamage(12);
    	carpetStackGreen.setItemDamage(13);
    	carpetStackRed.setItemDamage(14);
    	carpetStackBlack.setItemDamage(15);
    	GameRegistry.addSmelting(carpetStackWhite, carpetStackOrange, 0.1f);
    	GameRegistry.addSmelting(carpetStackOrange, carpetStackMagenta, 0.1f);
    	GameRegistry.addSmelting(carpetStackMagenta, carpetStackLightBlue, 0.1f);
    	GameRegistry.addSmelting(carpetStackLightBlue, carpetStackYellow, 0.1f);
    	GameRegistry.addSmelting(carpetStackYellow, carpetStackLime, 0.1f);
    	GameRegistry.addSmelting(carpetStackLime, carpetStackPink, 0.1f);
    	GameRegistry.addSmelting(carpetStackPink, carpetStackGrey, 0.1f);
    	GameRegistry.addSmelting(carpetStackGrey, carpetStackLightGrey, 0.1f);
    	GameRegistry.addSmelting(carpetStackLightGrey, carpetStackCyan, 0.1f);
    	GameRegistry.addSmelting(carpetStackCyan, carpetStackPurple, 0.1f);
    	GameRegistry.addSmelting(carpetStackPurple, carpetStackBlue, 0.1f);
    	GameRegistry.addSmelting(carpetStackBlue, carpetStackBrown, 0.1f);
    	GameRegistry.addSmelting(carpetStackBrown, carpetStackGreen, 0.1f);
    	GameRegistry.addSmelting(carpetStackGreen, carpetStackRed, 0.1f);
    	GameRegistry.addSmelting(carpetStackRed, carpetStackBlack, 0.1f);
    	GameRegistry.addSmelting(carpetStackBlack, carpetStackWhite, 0.1f);
    //wool smelting
    	ItemStack woolStackWhite = new ItemStack(Blocks.wool);
    	ItemStack woolStackOrange = new ItemStack(Blocks.wool);
    	ItemStack woolStackMagenta = new ItemStack(Blocks.wool);
    	ItemStack woolStackLightBlue = new ItemStack(Blocks.wool);
    	ItemStack woolStackYellow = new ItemStack(Blocks.wool);
    	ItemStack woolStackLime = new ItemStack(Blocks.wool);
    	ItemStack woolStackPink = new ItemStack(Blocks.wool);
    	ItemStack woolStackGrey = new ItemStack(Blocks.wool);
    	ItemStack woolStackLightGrey = new ItemStack(Blocks.wool);
    	ItemStack woolStackCyan = new ItemStack(Blocks.wool);
    	ItemStack woolStackPurple = new ItemStack(Blocks.wool);
    	ItemStack woolStackBlue = new ItemStack(Blocks.wool);
    	ItemStack woolStackBrown = new ItemStack(Blocks.wool);
    	ItemStack woolStackGreen = new ItemStack(Blocks.wool);
    	ItemStack woolStackRed = new ItemStack(Blocks.wool);
    	ItemStack woolStackBlack = new ItemStack(Blocks.wool);
    	woolStackWhite.setItemDamage(0);
    	woolStackOrange.setItemDamage(1);
    	woolStackMagenta.setItemDamage(2);
    	woolStackLightBlue.setItemDamage(3);
    	woolStackYellow.setItemDamage(4);
    	woolStackLime.setItemDamage(5);
    	woolStackPink.setItemDamage(6);
    	woolStackGrey.setItemDamage(7);
    	woolStackLightGrey.setItemDamage(8);
    	woolStackCyan.setItemDamage(9);
    	woolStackPurple.setItemDamage(10);
    	woolStackBlue.setItemDamage(11);
    	woolStackBrown.setItemDamage(12);
    	woolStackGreen.setItemDamage(13);
    	woolStackRed.setItemDamage(14);
    	woolStackBlack.setItemDamage(15);
    	GameRegistry.addSmelting(woolStackWhite, woolStackOrange, 0.1f);
    	GameRegistry.addSmelting(woolStackOrange, woolStackMagenta, 0.1f);
    	GameRegistry.addSmelting(woolStackMagenta, woolStackLightBlue, 0.1f);
    	GameRegistry.addSmelting(woolStackLightBlue, woolStackYellow, 0.1f);
    	GameRegistry.addSmelting(woolStackYellow, woolStackLime, 0.1f);
    	GameRegistry.addSmelting(woolStackLime, woolStackPink, 0.1f);
    	GameRegistry.addSmelting(woolStackPink, woolStackGrey, 0.1f);
    	GameRegistry.addSmelting(woolStackGrey, woolStackLightGrey, 0.1f);
    	GameRegistry.addSmelting(woolStackLightGrey, woolStackCyan, 0.1f);
    	GameRegistry.addSmelting(woolStackCyan, woolStackPurple, 0.1f);
    	GameRegistry.addSmelting(woolStackPurple, woolStackBlue, 0.1f);
    	GameRegistry.addSmelting(woolStackBlue, woolStackBrown, 0.1f);
    	GameRegistry.addSmelting(woolStackBrown, woolStackGreen, 0.1f);
    	GameRegistry.addSmelting(woolStackGreen, woolStackRed, 0.1f);
    	GameRegistry.addSmelting(woolStackRed, woolStackBlack, 0.1f);
    	GameRegistry.addSmelting(woolStackBlack, woolStackWhite, 0.1f);
    	
    	ItemStack lapisDye = new ItemStack(Items.dye);
    	lapisDye.setItemDamage(4);
    	//New ores
    	GameRegistry.addSmelting(BlockManager.tutorial_ore, new ItemStack(ItemManager.tutorial_item), 0.1F);
    	GameRegistry.addSmelting(BlockManager.endCoal, new ItemStack(Items.coal), 0.1F);
    	GameRegistry.addSmelting(BlockManager.endDiamond, new ItemStack(Items.diamond), 0.1F);
    	GameRegistry.addSmelting(BlockManager.endEmerald, new ItemStack(Items.emerald), 0.1F);
    	GameRegistry.addSmelting(BlockManager.endGold, new ItemStack(Items.gold_ingot), 0.1F);
    	GameRegistry.addSmelting(BlockManager.endIron, new ItemStack(Items.iron_ingot), 0.1F);
    	GameRegistry.addSmelting(BlockManager.endLapis, lapisDye, 0.1F);
    	GameRegistry.addSmelting(BlockManager.endQuartz, new ItemStack(Items.quartz), 0.1F);
    	GameRegistry.addSmelting(BlockManager.endRedstone, new ItemStack(Items.redstone), 0.1F);
    	GameRegistry.addSmelting(BlockManager.endRuby, new ItemStack(ItemManager.tutorial_item), 0.1F);
    	GameRegistry.addSmelting(BlockManager.netherCoal, new ItemStack(Items.coal), 0.1F);
    	GameRegistry.addSmelting(BlockManager.netherDiamond, new ItemStack(Items.diamond), 0.1F);
    	GameRegistry.addSmelting(BlockManager.netherEmerald, new ItemStack(Items.emerald), 0.1F);
    	GameRegistry.addSmelting(BlockManager.netherGold, new ItemStack(Items.gold_ingot), 0.1F);
    	GameRegistry.addSmelting(BlockManager.netherIron, new ItemStack(Items.iron_ingot), 0.1F);
    	GameRegistry.addSmelting(BlockManager.netherLapis, lapisDye, 0.1F);
    	GameRegistry.addSmelting(BlockManager.netherRedstone, new ItemStack(Items.redstone), 0.1F);
    	GameRegistry.addSmelting(BlockManager.netherRuby, new ItemStack(ItemManager.tutorial_item), 0.1F);
    	GameRegistry.addSmelting(BlockManager.overworldQuartz, new ItemStack(Items.quartz), 0.1F);
	}
	

}
