package com.camp.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import com.camp.coloredlightscore.src.api.CLApi;

import com.camp.lib.StringLibrary;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class JetBlock extends Block{

	protected JetBlock(Material p_i45394_6_) {
		super(p_i45394_6_);
		this.setBlockTextureName(StringLibrary.MODID + ":" + "jet" + "Block");
		// TODO Auto-generated constructor stub
		if (Loader.isModLoaded("coloredlightscore")) {
            CLApi.setBlockColorRGB(this, 1, 8, 97);
            //CLApi.setBlockColorRGB(this, 97, 8, 1);
        } else {
            setLightLevel(6F/15F);
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
