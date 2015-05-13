package com.camp.item;
 
import com.camp.lib.StringLibrary;

import net.minecraft.item.ItemHoe;
 
public class CustomHoe extends ItemHoe {
	{
		this.setTextureName(StringLibrary.MODID + ":custom_hoe");
	}
 
    protected CustomHoe(ToolMaterial p_i45347_1_) {
        super(p_i45347_1_);
        // TODO Auto-generated constructor stub
    }
 
}