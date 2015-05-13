// Date: 3/4/15 1:54:12 AM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package com.camp.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class cbc32801Ninja extends ModelBase
{
  //fields
    ModelRenderer head;
    ModelRenderer body;
    ModelRenderer rightarm;
    ModelRenderer leftarm;
    ModelRenderer rightleg;
    ModelRenderer leftleg;
    ModelRenderer Shape1;
  
  public cbc32801Ninja()
  {
    textureWidth = 64;
    textureHeight = 64;
    
      head = new ModelRenderer(this, 0, 0);
      head.addBox(-4F, -8F, -4F, 8, 8, 8);
      head.setRotationPoint(0F, -6F, 0F);
      head.setTextureSize(64, 64);
      head.mirror = true;
      setRotation(head, 0F, 0F, 0F);
      body = new ModelRenderer(this, 16, 16);
      body.addBox(-4F, 0F, -2F, 8, 15, 4);
      body.setRotationPoint(0F, -6F, 0F);
      body.setTextureSize(64, 64);
      body.mirror = true;
      setRotation(body, 0F, 0F, 0F);
      rightarm = new ModelRenderer(this, 40, 16);
      rightarm.addBox(-3F, -2F, -2F, 4, 15, 4);
      rightarm.setRotationPoint(-5F, -1F, 0F);
      rightarm.setTextureSize(64, 64);
      rightarm.mirror = true;
      setRotation(rightarm, -2.672188F, 3.008548F, -0.9530182F);
      leftarm = new ModelRenderer(this, 40, 16);
      leftarm.addBox(-3F, -2F, -8F, 4, 12, 4);
      leftarm.setRotationPoint(5F, -1F, 0F);
      leftarm.setTextureSize(64, 64);
      leftarm.mirror = true;
      setRotation(leftarm, -1.756543F, 0.2242396F, 2.242396F);
      rightleg = new ModelRenderer(this, 0, 16);
      rightleg.addBox(-2F, 0F, -2F, 4, 15, 4);
      rightleg.setRotationPoint(-2F, 9F, 0F);
      rightleg.setTextureSize(64, 64);
      rightleg.mirror = true;
      setRotation(rightleg, 0F, 0F, 0F);
      leftleg = new ModelRenderer(this, 0, 16);
      leftleg.addBox(-2F, 0F, -2F, 4, 15, 4);
      leftleg.setRotationPoint(2F, 9F, 0F);
      leftleg.setTextureSize(64, 64);
      leftleg.mirror = true;
      setRotation(leftleg, 0F, 0F, 0F);
      Shape1 = new ModelRenderer(this, 0, 0);
      Shape1.addBox(0F, 0F, 0F, 1, 1, 1);
      Shape1.setRotationPoint(0F, 0F, 0F);
      Shape1.setTextureSize(64, 64);
      Shape1.mirror = true;
      setRotation(Shape1, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    head.render(f5);
    body.render(f5);
    rightarm.render(f5);
    leftarm.render(f5);
    rightleg.render(f5);
    leftleg.render(f5);
    Shape1.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float time, float speed, float rotationAngle, float rotationYaw, float rotationPitch, float scale, Entity entity){
	    super.setRotationAngles(time, speed, rotationAngle, rotationYaw, rotationPitch, scale, entity);
	    this.body.rotateAngleX = rotationPitch / (180F / (float)Math.PI);
	    this.body.rotateAngleY = rotationYaw / (180F / (float)Math.PI);
	    this.rightleg.rotateAngleX = MathHelper.cos(time * 0.6662F) * 1.4F * speed;
	    this.leftarm.rotateAngleX = MathHelper.cos(time * 0.6662F) * 1.4F * speed;
	    this.leftleg.rotateAngleX = MathHelper.cos(time * 0.6662F + (float)Math.PI) * 1.4F * speed;
	    this.rightarm.rotateAngleX = MathHelper.cos(time * 0.6662F + (float)Math.PI) * 1.4F * speed;
	}

}