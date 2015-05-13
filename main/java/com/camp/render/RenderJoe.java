package com.camp.render;

import com.camp.lib.StringLibrary;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderJoe extends RenderLiving {

	public RenderJoe(ModelBase par1ModelBase, float par2) {
		super(par1ModelBase, par2);
		// TODO Auto-generated constructor stub
	}

	/*
	 * @Override public void doRender(Entity var1, double var2, double var4,
	 * double var6, float var8, float var9) { // TODO Auto-generated method stub
	 * }
	 */

	@Override
	protected ResourceLocation getEntityTexture(Entity var1) {
		// TODO Auto-generated method stub
		return new ResourceLocation(StringLibrary.MODID
				+ ":textures/entity/joe.png");
	}
}
