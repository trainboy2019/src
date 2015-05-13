package com.camp.block;
 
import net.minecraft.block.Block;
import net.minecraft.block.BlockCrops;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

import com.camp.item.ItemManager;
import com.camp.lib.StringLibrary;
 
public class CustomBlockCrops extends BlockCrops {
	{
		this.setBlockTextureName(StringLibrary.MODID + ":custom_block_crops");
	}
     
    protected Item func_149866_i() {
        return ItemManager.customSeeds;
    }
 
    protected Item func_149865_P() {
        return ItemManager.customItemCrops;
    }
    
    @Override
    protected boolean canPlaceBlockOn(Block p_149854_1_)
    {
        return p_149854_1_ == Blocks.packed_ice;
    }
     
 
}