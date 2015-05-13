package com.camp.item;
 
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

//import com.camp.creativeTabs.CreativeTabManager;
import com.camp.creativetabs.CreativeTabsManager;
import com.camp.lib.StringLibrary;
import com.google.common.collect.Multimap;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
 
public class CustomItem extends ItemFood {private double field_150934_a;

	/*public void ItemFood(Item.ToolMaterial);
	public CustomItem(ToolMaterial apple){
	super(apple);*/


{}
	
	
		//super(apple);}
	//}

/*for making something a weapon
  @Override
public Multimap getItemAttributeModifiers()
{
    Multimap multimap = super.getItemAttributeModifiers();
    {
    multimap.put(SharedMonsterAttributes.attackDamage.getAttributeUnlocalizedName(), new 
    		AttributeModifier(field_111210_e, "Weapon modifier", Input Damage Here, 0));
    return multimap;
    }
}*/

@Override
public Multimap getItemAttributeModifiers()
{
    Multimap multimap = super.getItemAttributeModifiers();
    {
    multimap.put(SharedMonsterAttributes.attackDamage.getAttributeUnlocalizedName(), new 
    		AttributeModifier(field_111210_e, "Weapon modifier", 10, 0));
    return multimap;
    }
}
	public CustomItem(int p_i45339_1_, float p_i45339_2_, boolean p_i45339_3_) {
        super(5, true);
        this.setAlwaysEdible();	
        //this.bFull3D;
        //this.isFull3D();
        //this.setFull3D();
        
        //this.setUnlocalizedName("CustomItem");
	    this.setCreativeTab(CreativeTabsManager.tabItem);
	    //this.setDamage(1, 99999999);
	    //this.setMaxDamage(99999);
	    //this.setMaxStackSize(42);
	    //this.setCreativeTab(CreativeTabManager.tabItem);
	    //this.setTextureName(StringLibrary.MODID + ":CustomItem");
	    this.setUnlocalizedName("CustomItem");
	    //this.setCreativeTab(CreativeTabs.tabMisc);
	    this.setMaxDamage(64);
	    this.setMaxStackSize(1);
	    this.setTextureName(StringLibrary.MODID + ":custom_item");
	    
	}

	@SideOnly(Side.CLIENT)
	public boolean hasEffect(ItemStack par1ItemStack)
	{ return true;
	}
	@Override
	public void onFoodEaten(ItemStack stack, World world, EntityPlayer player) {
	    super.onFoodEaten(stack, world, player);
	    if(!world.isRemote) {
	    	int duration = 20*60;
	        player.addPotionEffect(new PotionEffect(Potion.nightVision.getId(), duration, 2));
	        player.addPotionEffect(new PotionEffect(Potion.waterBreathing.getId(), duration, 2));
	        player.addPotionEffect(new PotionEffect(Potion.damageBoost.getId(), duration, 2));
	        player.addPotionEffect(new PotionEffect(Potion.heal.getId(), duration, 2));
	        player.addPotionEffect(new PotionEffect(Potion.digSpeed.getId(), duration, 2));
	    }
	}
}



/*package com.camp.item;

import com.camp.lib.StringLibrary;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
 
public class CustomItem extends Item {
 
	public CustomItem() {
	    this.setUnlocalizedName("CustomItem");
	    this.setCreativeTab(CreativeTabs.tabMisc);
	    this.setMaxDamage(64);
	    this.setMaxStackSize(1);
	    this.setTextureName(StringLibrary.MODID + ":custom_item");
	}   
 
}*/