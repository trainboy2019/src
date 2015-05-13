package com.camp.item;
 
import com.camp.lib.StringLibrary;

import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
 
public class CustomShovel extends ItemSpade {
	{
		this.setTextureName(StringLibrary.MODID + ":custom_shovel");
	}
 
    protected CustomShovel(ToolMaterial p_i45347_1_) {
        super(p_i45347_1_);
        // TODO Auto-generated constructor stub
    }
 
}