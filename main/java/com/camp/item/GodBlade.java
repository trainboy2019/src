package com.camp.item;

import com.camp.lib.StringLibrary;

import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class GodBlade extends ItemSword {
	public boolean hasEffect(ItemStack itemstack)
    {
        return true;
    }
	public EnumRarity getRarity(ItemStack itemstack)
    {
    return EnumRarity.epic;
    }

	public GodBlade(String unlocalizedName, ToolMaterial material) {
        super(material);
        this.setUnlocalizedName("GodBlade");
        this.setTextureName(StringLibrary.MODID + ":" + "god_blade");
}
	

}
