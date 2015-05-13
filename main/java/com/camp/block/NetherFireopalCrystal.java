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

public class NetherFireopalCrystal extends Block {
	//"LapisItem" = new ItemStack(Items.dye, 1, 4);
	
	
	private Item drop;
	private int meta;
	private int least_quantity;
	private int most_quantity;
	//("gemLapis",    new ItemStack(Items.dye, 1, 4)

	protected NetherFireopalCrystal(String unlocalizedName, Material mat, Item drop, int meta, int least_quantity, int most_quantity) {
		super(mat);
		this.drop = drop;
		this.meta = meta;
		this.least_quantity = 1;
		this.most_quantity = 2;
		this.setLightLevel(0.0F);
		this.setBlockName(unlocalizedName);
		this.setBlockTextureName(StringLibrary.MODID + ":" + "nether_fireopalCrystal");
		this.setCreativeTab(CreativeTabsManager.tabBlock);
		
	}
	//ItemStack gemLapis = new ItemStack(Items.dye,1);
	///ItemStack gemLapis = new ItemStack(Items.dye, 1, 4); setItemDamage(4);
	ItemStack gemLapisGem = new ItemStack(Items.dye, 1, 4);

	protected NetherFireopalCrystal(String unlocalizedName, Material mat, Item drop, int least_quantity, int most_quantity) {
		this(unlocalizedName, mat, drop, 0, least_quantity, most_quantity);
	}

	protected NetherFireopalCrystal(String unlocalizedName, Material mat, Item drop) {
		this(unlocalizedName, mat, drop, 1, 1);
	}
	@Override
	public Item getItemDropped (int meta, Random random, int fortune) {
		return ItemManager.fireopalCrystal;
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