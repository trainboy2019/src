package com.camp.block;
 
import java.util.Random;

import com.camp.creativetabs.CreativeTabsManager;
import com.camp.lib.StringLibrary;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.world.World;
 
public class CustomBlock extends Block {
	
	
	
	
	
	
	@SideOnly(Side.CLIENT)
    public int getRenderBlockPass()
    {
        return 1;
    }
	public boolean isOpaqueCube() {
		return false;
		}
	public boolean canProvidePower()
    {
        return true;
    }
 
	protected CustomBlock(Material p_i45394_1_) {
	    super(p_i45394_1_);
	    // TODO Auto-generated constructor stub
	 
	    this.setBlockName("CustomBlock");
	    this.setCreativeTab(CreativeTabsManager.tabBlock);
	    this.setLightLevel((float) 2.0);
	    //this.blockParticleGravity = -100;
	    //this.
	    this.setBlockTextureName(StringLibrary.MODID + ":custom_block");
	    
	}  
	
	@SideOnly(Side.CLIENT)
	public void randomDisplayTick(World world, int x, int y, int z, Random random){
		
		float f1 = (float)x + 0.5F;
		float f2 = (float)y + 1.1F;
		float f3 = (float)z + 0.5F;
		float f4 = random.nextFloat() * 0.6F -0.3F;
		float f5 = random.nextFloat() * -0.6F - -0.3F;
		
		float f6 = (float)x + 0.5F;
		float f7 = (float)y + 0.5F;
		float f8 = (float)z + 0.5F;
		float f9 = random.nextFloat() * 0.6F -0.3F;
		float f0 = random.nextFloat() * -0.6F - -0.3F;
		
		world.spawnParticle("portal", (double)(f1+f4), (double)f2, (double)(f3+f5), 0.0D, -0.1D, 0.0D);
		world.spawnParticle("flame", (double)(f1+f4), (double)f2, (double)(f3+f5), 0.0D, -0.1D, 0.0D);
		world.spawnParticle("lava", (double)(f1+f4), (double)f2, (double)(f3+f5), 0.0D, -0.1D, 0.0D);
		world.spawnParticle("rain", (double)(f1+f4), (double)f2, (double)(f3+f5), 0.0D, -0.1D, 0.0D);
		world.spawnParticle("crit", (double)(f1+f4), (double)f2, (double)(f3+f5), 0.0D, -0.1D, 0.0D);
		world.spawnParticle("explode", (double)(f6+f9), (double)f7, (double)(f8+f0), 0.3D, 0.4D, 0.3D);
		world.spawnParticle("crit2", (double)(f1+f4), (double)f2, (double)(f3+f5), 0.0D, -0.1D, 0.0D);
		world.spawnParticle("splash", (double)(f1+f4), (double)f2, (double)(f3+f5), 0.0D, -0.1D, 0.0D);
		
		
		
		
		
	}
 
}