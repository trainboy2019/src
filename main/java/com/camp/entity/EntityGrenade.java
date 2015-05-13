package com.camp.entity;
 
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
 
public class EntityGrenade extends EntityThrowable {
 
    public EntityGrenade(World par1World, EntityLivingBase par2EntityLivingBase) {
        super(par1World, par2EntityLivingBase);
        
    }
 
    public EntityGrenade(World world) {
        super(world);
    }

	@Override
	protected void onImpact(MovingObjectPosition var1) {
		if (!this.worldObj.isRemote) {
			 this.worldObj.newExplosion(this, this.posX, this.posY, this.posZ, 16.0F, false, true);
			 this.setDead();
	    }
		
	}
 
}
