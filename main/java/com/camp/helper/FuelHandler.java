package com.camp.helper;


import net.minecraft.item.ItemStack;

import com.camp.*;
import com.camp.item.ItemManager;

import cpw.mods.fml.common.IFuelHandler;

public class FuelHandler implements IFuelHandler {

	@Override
	public int getBurnTime(ItemStack fuel) {
		
		if(fuel.getItem() == ItemManager.itemTreePitch) return 800;
		
		return 0;
	}

}