package com.camp.entity;

import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

public class TechnoCreeper extends EntityCreeper{
	private int fuseTime = 30;
	private int explosionRadius = 15;

	public TechnoCreeper(World p_i1733_1_) {
		super(p_i1733_1_);
		this.isAIEnabled();
		this.isImmuneToFire = true;
		// TODO Auto-generated constructor stub
	}
	public void writeEntityToNBT(NBTTagCompound p_70014_1_)
    {
        super.writeEntityToNBT(p_70014_1_);

        if (this.dataWatcher.getWatchableObjectByte(17) == 1)
        {
            p_70014_1_.setBoolean("powered", true);
        }

        p_70014_1_.setShort("Fuse", (short)this.fuseTime);
        p_70014_1_.setByte("ExplosionRadius", (byte)this.explosionRadius);
        p_70014_1_.setBoolean("ignited", this.func_146078_ca());
    }
	

	

}
