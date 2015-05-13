package com.camp.item;
 
import com.camp.lib.StringLibrary;

import net.minecraft.item.ItemPickaxe;
 
public class CustomPickaxe extends ItemPickaxe {
 
    protected CustomPickaxe(ToolMaterial p_i45347_1_) {
        super(p_i45347_1_);
        this.setTextureName(StringLibrary.MODID + ":custom_pickaxe");
        // TODO Auto-generated constructor stub
    }
 
}