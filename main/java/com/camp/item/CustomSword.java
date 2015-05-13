package com.camp.item;
 
import com.camp.lib.StringLibrary;

import net.minecraft.item.ItemSword;
 
public class CustomSword extends ItemSword {
	
 
    protected CustomSword(ToolMaterial p_i45347_1_) {
        super(p_i45347_1_);
        this.setTextureName(StringLibrary.MODID + ":custom_sword");
        // TODO Auto-generated constructor stub
    }
 
}