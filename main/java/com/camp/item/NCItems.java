package com.camp.item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.camp.creativetabs.*;
import com.camp.lib.StringLibrary;

public class NCItems extends Item {
	
	public NCItems() {
		this.setCreativeTab(CreativeTabsManager.tabItem);
		//this.setCreativeTab(CreativeTabs.tabMaterials);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister) {
		this.itemIcon = iconRegister.registerIcon(StringLibrary.MODID + ":" + this.getUnlocalizedName().substring(5));
	}
}