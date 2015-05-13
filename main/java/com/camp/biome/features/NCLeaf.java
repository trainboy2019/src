package com.camp.biome.features;

import java.util.List;

import net.minecraft.block.BlockLeaves;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.ColorizerFoliage;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import com.camp.item.ItemManager;
import com.camp.lib.StringLibrary;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class NCLeaf extends BlockLeaves{
	//{
		//this.setBlockTextureName(StringLibrary.MODID + ":" +"LeafCherry");
//	}
	
	
	
	public static enum LeafCategory
	{
		CAT1, CAT2, CAT3, CAT4;
	}

	//leaves1
	//Yellow Autumn (0)
	//Bamboo 		(1)
	//Magic			(2)
	//Dark			(3)

	//leaves2
	//Dead			(0)
	//Fir			(1)
	//Ethereal		(2)
	//Orange Autumn (3)

	//leaves3
	//Origin		(0)
	//Pink Cherry	(1)
	//Maple			(2)
	//White Cherry	(3)

	//leaves4
	//Hellbark		(0)
	//Jacaranda		(1)

	
	public static final String[][] leafTypes = new String[][]{{"LeafCherry", "LeafwhiteCherry"}, {"LeafCherryOpaque", "LeafwhiteCherryOpaque"}};
	public static final String[] Leaves = new String[] {"Cherry", "whiteCherry"};
	private IIcon[][] textures;
	
	
	
	protected void func_150124_c(World p_150124_1_, int p_150124_2_, int p_150124_3_, int p_150124_4_, int p_150124_5_, int p_150124_6_)
    {
        if ((p_150124_5_ & 3) == 1 && p_150124_1_.rand.nextInt(p_150124_6_) == 0)
        {
            this.dropBlockAsItem(p_150124_1_, p_150124_2_, p_150124_3_, p_150124_4_, new ItemStack(ItemManager.cherry, 1, 0));
        }
    }
	
	
	@Override
	public IIcon getIcon(int side, int meta) {
		return (meta & 3) == 1 ? this.field_150129_M[this.field_150127_b][1] : this.field_150129_M[this.field_150127_b][0];
	}
	
	
	/*@Override
	//TODO:		registerIcons()
	public void registerBlockIcons(IIconRegister iconRegister)
	{
		textures = new IIcon[2][leafTypes.length];
		//if(Loader.isModLoaded("BetterGrassAndLeavesMod"))
			for (int i = 0; i < leafTypes.length; ++i)
			{
				textures[0][i] = iconRegister.registerIcon(StringLibrary.MODID + ":" + leafTypes[i] + "_fancy");
				textures[1][i] = iconRegister.registerIcon(StringLibrary.MODID + ":" + leafTypes[i] + "_fast");
				
			}
		
	}*/

    /**
     * Determines the damage on the item the block drops. Used in cloth and wood.
     */
    public int damageDropped(int p_149692_1_)
    {
        return super.damageDropped(p_149692_1_) + 4;
    }

    /**
     * Get the block's damage value (for use with pick block).
     */
    public int getDamageValue(World p_149643_1_, int p_149643_2_, int p_149643_3_, int p_149643_4_)
    {
        return p_149643_1_.getBlockMetadata(p_149643_2_, p_149643_3_, p_149643_4_) & 3;
    }

    /**
     * Gets the block's texture. Args: side, meta
     */
    
    
    
   /* @Override
	//TODO:		registerIcons()
	public void registerBlockIcons(IIconRegister iconRegister)
	{
		//textureName = new IIcon[3][leaves.length];
    	for (int i = 0; i < leafTypes.length; ++i)
			//for (int i = 0; i < Leaves.length; ++i)
			{
				iconRegister.registerIcon("cm:/blocks/leaves_" + Leaves[i]);
				
			}
	}*/
   /* @SideOnly(Side.CLIENT)
    public IIcon getIcon(int p_149691_1_, int p_149691_2_) {
		return null;
	}*/    
    
    

    /**
     * returns a list of blocks with the same ID, but different meta (eg: wood returns 4 blocks)
     */
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(Item item, CreativeTabs p_149666_2_, List list)
    {
    	for(int i = 0; i < Leaves.length; i++){
			list.add(new ItemStack(item, 1, i));
		}
    }

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        for (int i = 0; i < leafTypes.length; ++i)
        {
            this.field_150129_M[i] = new IIcon[leafTypes[i].length];

            for (int j = 0; j < leafTypes[i].length; ++j)
            {
                this.field_150129_M[i][j] = iconRegister.registerIcon(leafTypes[i][j]);
            }
        }
    }
    
    /*@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister) {
		this.blockIcon = iconRegister.registerIcon(StringLibrary.MODID + ":" + "AlabasterOvenSide");
		this.getIcon(getRenderType(), getRenderType()) = iconRegister.registerIcon(StringLibrary.MODID + ":" + (this.isActive ? "AlabasterOvenFrontOn" : "AlabasterOvenFrontOff"));
		this.iconTop = iconRegister.registerIcon(StringLibrary.MODID + ":" + "AlabasterOvenTop");
	}*/
    
   /* public void registerBlockIcons (IIconRegister iconRegister){
		this.field_150129_M = new IIcon[Leaves.length];
		this.field_150127_b = new IIcon[Leaves.length];
		
		for(int i = 0; i < this.field_150167_a.length; i++){
			this.field_150167_a[i] = iconRegister.registerIcon(this.getTextureName() + Logs[i]);
			this.field_150166_b[i] = iconRegister.registerIcon(this.getTextureName() + Logs[i] + "Top");
		}
	}*/
    
    /*@SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
    	for (int i = 0; i < leafTypes.length; ++i)
    	{
    		this.field_150129_M[i] = new IIcon[leafTypes[i].length];
    		
    		for (int j = 0; j < leafTypes[i].length; ++j)
    		{
    			this.field_150129_M[i][j] = iconRegister.registerIcon(leafTypes[i][j]);
    		}
    	}
    }

    
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int p_149691_1_, int p_149691_2_) {
		return null;
	}

    *//**
     * Pass true to draw this block using fancy graphics, or false for fast graphics.
     *//*
    @SideOnly(Side.CLIENT)
    public void setGraphicsLevel(boolean p_150122_1_)
    {
        this.field_150121_P = p_150122_1_;
        this.field_150127_b = p_150122_1_ ? 0 : 1;
    }*/
	
	
	

	/*@Override
	public IIcon getIcon(int side, int meta) {
		return (meta & 3) == 1 ? this.field_150129_M[this.field_150127_b][1] : this.field_150129_M[this.field_150127_b][0];
	}*/

	@Override
	public String[] func_150125_e() {
		return Leaves;
	}
	
	
	

	/*@Override
	//TODO:		 getIcon()
	public IIcon getIcon(int side, int metadata)
	{
		//int type = getTypeFromMeta(metadata) + (category.ordinal() * 4);
		//TODO:			  isOpaqueCube()
		return textures[(!isOpaqueCube() ? 0 : 1)][type >= leaves.length ? 0 : type];
	}*/
	
	
	@Override
    //TODO:	   getBlockColor()
    public int getBlockColor()
    {
        double temperature = 0.5D;
        double humidity = 1.0D;
        return ColorizerFoliage.getFoliageColor(temperature, humidity);
    }

    @Override
    //TODO:	   getRenderColor()
    public int getRenderColor(int par1)
    {
        switch (par1)
        {
            default:
                return ColorizerFoliage.getFoliageColorBasic();
        }
    }

    @Override
    //TODO:	   colorMultiplier()
    public int colorMultiplier(IBlockAccess world, int x, int y, int z)
    {
    	int var6 = 0;
    	int var7 = 0;
    	int var8 = 0;

    	for (int var9 = -1; var9 <= 1; ++var9)
    	{
    		for (int var10 = -1; var10 <= 1; ++var10)
    		{
    			//TODO:														getBiomeFoliageColor()
    			int var11 = world.getBiomeGenForCoords(x + var10, z + var9).getBiomeFoliageColor(x + var10, y, z + var9);
    			var6 += (var11 & 16711680) >> 16;
    		var7 += (var11 & 65280) >> 8;
    		var8 += var11 & 255;
    		}
    	}

    	return (var6 / 9 & 255) << 16 | (var7 / 9 & 255) << 8 | var8 / 9 & 255;
    }



	
	
	/*@Override
	//TODO:		registerIcons()
	public void registerBlockIcons(IIconRegister iconRegister)
	{
		textures = new IIcon[2][leafTypes.length];
		
			for (int i = 0; i < leafTypes.length; ++i)
			{
				textures[0][i] = iconRegister.registerIcon(StringLibrary.MODID + ":" + leafTypes[i] + "_fancy");
				textures[1][i] = iconRegister.registerIcon(StringLibrary.MODID + ":" + leafTypes[i] + "_fast");
				
			}
		
	}*/

}
