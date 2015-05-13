package com.camp.creativetabs;
import com.camp.block.BlockManager;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BlockTab extends CreativeTabs {
 
    public BlockTab(String lable) {
		super(lable);
		// TODO Auto-generated constructor stub
	}
 
	@Override
	public Item getTabIconItem() {
	    // TODO Auto-generated method stub
	    return Item.getItemFromBlock(BlockManager.multiBlock);
	}
 
}