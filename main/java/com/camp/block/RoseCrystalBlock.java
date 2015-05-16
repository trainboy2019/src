package com.camp.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import com.camp.coloredlightscore.src.api.CLApi;

import com.camp.lib.StringLibrary;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class RoseCrystalBlock extends Block{

	protected RoseCrystalBlock(Material p_i45394_8_) {
		super(p_i45394_8_);
		this.setBlockTextureName(StringLibrary.MODID + ":" + "roseCrystal" + "Block");
		// TODO Auto-generated constructor stub
		if (Loader.isModLoaded("coloredlightscore")) {
            CLApi.setBlockColorRGB(this, 252, 144, 244);
            //CLApi.setBlockColorRGB(this, 26, 255, 1);
            //System.out.println("\n\nTHIS WAS SET RIGHT!!!!!!!!!!!!!!!!!!\n\n!!!!!!");
        } else {
            setLightLevel(0F/15F);
            //System.out.println("\n\nTHIS WAS SET WRONG!!!!!!!!!!!!!!!!!!\n\n!!!!!!");
        }
	}
	@SideOnly(Side.CLIENT)
    public int getRenderBlockPass()
    {
        return 1;
    }
	public boolean isOpaqueCube() {
		return false;
		}
}
