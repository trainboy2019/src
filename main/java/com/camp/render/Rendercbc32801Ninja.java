package com.camp.render;
 
import com.camp.lib.StringLibrary;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
 
public class Rendercbc32801Ninja extends RenderLiving {
 
    public Rendercbc32801Ninja(ModelBase par1ModelBase, float par2) {
        super(par1ModelBase, par2);
        // TODO Auto-generated constructor stub
    }
 
    @Override
    protected ResourceLocation getEntityTexture(Entity var1) {
        // TODO Auto-generated method stub
        return new ResourceLocation(StringLibrary.MODID + ":textures/entity/cbc32801.png");
    }
 
}