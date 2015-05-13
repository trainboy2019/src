package com.camp.item;

import com.camp.lib.StringLibrary;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class Cherry extends ItemFood {

	public Cherry(int p_i45339_1_, float p_i45339_2_, boolean p_i45339_3_) {
        super(p_i45339_1_, p_i45339_2_, p_i45339_3_);
        // TODO Auto-generated constructor stub
        this.setAlwaysEdible();
        this.bFull3D = true;
    //    this.getChestGenBase(chest, rnd, original)
        this.isFull3D();
        this.setFull3D();
        //PotionEffect.
        //this.
        //this.curativeItems.add(new ItemStack(Items.milk_bucket));
        this.setTextureName(StringLibrary.MODID + ":cherry");
    }
	
	//his.curativeItems.add(new ItemStack(Items.milk_bucket));
	/*public boolean isCurativeItem(ItemStack stack)
	{
	    for (ItemStack curativeItem : this.curativeItems)
	    {
	        if (curativeItem.isItemEqual(stack))
	        {
	            return true;
	        }
	    }
	    return false;
	}*/
	/*@Override
	public void onFoodEaten(ItemStack stack, World world, EntityPlayer player) {
	    super.onFoodEaten(stack, world, player);
	    if(!world.isRemote) {
	        player.addPotionEffect(new PotionEffect(Potion.moveSlowdown));//(new PotionEffect(Potion.moveSpeed.getId(), 100, 2));
	    }
	}*/
	
	
	@SideOnly(Side.CLIENT)
	public boolean hasEffect(ItemStack par1ItemStack)
	{ return true;
	}
	
	
	@Override
	public void onFoodEaten(ItemStack stack, World world, EntityPlayer player) {
	    super.onFoodEaten(stack, world, player);
	    if(!world.isRemote) {
	    	int duration = 20*120;
	    	//player.removePotionEffect(p_82170_1_);
	    	//player.addPotionEffect(p_70690_1_);
	    	player.addPotionEffect(new PotionEffect(Potion.blindness.getId(), 1, 2));
	    	player.addPotionEffect(new PotionEffect(Potion.confusion.getId(), 1, 2));
	    	player.addPotionEffect(new PotionEffect(Potion.digSpeed.getId(), 1, 2));
	    	player.addPotionEffect(new PotionEffect(Potion.hunger.getId(), 1, 2));
	    	player.addPotionEffect(new PotionEffect(Potion.poison.getId(), 1, 2));
	    	player.addPotionEffect(new PotionEffect(Potion.weakness.getId(), 1, 2));
	    	player.addPotionEffect(new PotionEffect(Potion.moveSpeed.getId(), 1, 2));
	    	player.addPotionEffect(new PotionEffect(Potion.wither.getId(), 1, 2));
	        player.addPotionEffect(new PotionEffect(Potion.digSlowdown.getId(), duration, 3));
	        player.addPotionEffect(new PotionEffect(Potion.moveSlowdown.getId(), duration, 1));
	        player.addPotionEffect(new PotionEffect(Potion.damageBoost.getId(), duration, 2));
	        player.addPotionEffect(new PotionEffect(Potion.nightVision.getId(), duration, 2));
	        player.addPotionEffect(new PotionEffect(Potion.jump.getId(), duration, 3));
	        player.addPotionEffect(new PotionEffect(Potion.regeneration.getId(), duration, 2));
	        player.addPotionEffect(new PotionEffect(Potion.resistance.getId(), duration, 1));
	       ///. player.removePotionEffect(Potion.blindness);
	    }
	}
}