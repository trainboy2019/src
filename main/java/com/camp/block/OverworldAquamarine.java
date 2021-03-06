package com.camp.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.camp.creativetabs.CreativeTabsManager;
import com.camp.item.ItemManager;
//import com.bedrockminer.tutorial.Main;
import com.camp.lib.StringLibrary;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class OverworldAquamarine extends Block {
	

	private Item drop;
	private int meta;
	private int least_quantity;
	private int most_quantity;

	protected OverworldAquamarine(String unlocalizedName, Material mat, Item drop, int meta, int least_quantity, int most_quantity) {
		super(mat);
		this.drop = drop;
		this.meta = meta;
		this.least_quantity = 1;
		this.most_quantity = 2;
		this.setLightLevel(0.0F);
		this.setBlockName(unlocalizedName);
		this.setBlockTextureName(StringLibrary.MODID + ":" + "overworld_" + "aquamarine");
		this.setCreativeTab(CreativeTabsManager.tabBlock);
		
	}

	protected OverworldAquamarine(String unlocalizedName, Material mat, Item drop, int least_quantity, int most_quantity) {
		this(unlocalizedName, mat, drop, 0, least_quantity, most_quantity);
	}

	protected OverworldAquamarine(String unlocalizedName, Material mat, Item drop) {
		this(unlocalizedName, mat, drop, 1, 1);
	}

	@Override
	public Item getItemDropped(int meta, Random random, int fortune) {
		return ItemManager.aquamarineGem;
	}

	@Override
	public int damageDropped(int meta) {
		return meta;
	}

	@Override
	public int quantityDropped(int meta, int fortune, Random random) {
		if (this.least_quantity >= this.most_quantity)
			return this.least_quantity;
		return this.least_quantity + random.nextInt(this.most_quantity - this.least_quantity + fortune + 1);
	}
}