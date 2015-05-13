package com.camp.item;

import com.camp.creativetabs.CreativeTabsManager;
import com.camp.lib.StringLibrary;

import net.minecraft.item.ItemFood;

public class onion extends ItemFood{

	public onion(int p_i45340_1_, boolean p_i45340_2_) {
		super(p_i45340_1_, p_i45340_2_);
		// TODO Auto-generated constructor stub
		//super(p_i45340_1_, p_i45340_2_);
		this.bFull3D = true;
		this.isFull3D();
		this.setFull3D();
		//this.getRarity(p_77613_1_)
		this.setCreativeTab(CreativeTabsManager.tabItem);
		this.setTextureName(StringLibrary.MODID + ":tomato");
		// TODO Auto-generated constructor stub
	}
}


