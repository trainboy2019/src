package com.camp.item;

import com.camp.block.CustomBlockCrops;
//import com.camp.block.custom_farmland;

import com.camp.lib.StringLibrary;

import net.minecraft.block.Block;
import net.minecraft.item.ItemSeeds;

public class customSeeds extends ItemSeeds{

	public customSeeds(Block p_i45352_1_, Block p_i45352_2_) {
		super(p_i45352_1_, p_i45352_2_);
		// TODO Auto-generated constructor stub
		this.setTextureName(StringLibrary.MODID + ":custom_seeds");
	}

	//public customSeeds(CustomBlockCrops p_i45352_1_, custom_farmland p_i45352_2_) {
		//super(p_i45352_1_, p_i45352_2_);
		// TODO Auto-generated constructor stub
	//}

}
