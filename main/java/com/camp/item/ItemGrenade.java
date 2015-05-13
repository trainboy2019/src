package com.camp.item;

import com.camp.entity.EntityGrenade;
import com.camp.lib.StringLibrary;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemGrenade extends Item {
	   {
		this.setTextureName(StringLibrary.MODID + ":grenade");
	}
	 
    public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player){
        if(!player.capabilities.isCreativeMode){
            --stack.stackSize;
        }
 
        if(!world.isRemote){
            world.spawnEntityInWorld(new EntityGrenade(world, player));
        }
 
        return stack;
    }
 
}
