package com.camp.entity; 
 
import net.minecraft.block.BlockDeadBush;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.IRangedAttackMob;
import net.minecraft.entity.ai.EntityAIArrowAttack;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIFleeSun;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAIRestrictSun;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITradePlayer;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;

import com.camp.item.CustomSword;
 
public class CustomEntityMob extends EntitySkeleton implements IRangedAttackMob{
	
	public EnumCreatureAttribute getCreatureAttribute()
    {
        return EnumCreatureAttribute.UNDEAD;
    }
	//private EntityAIArrowAttack aiArrowAttack = new EntityAIArrowAttack(this, 1.0D, 20, 60, 15.0F);
    //private EntityAIAttackOnCollide aiAttackOnCollide = new EntityAIAttackOnCollide(this, EntityPlayer.class, 1.2D, false);
	
	public boolean isAIEnabled()
    {
        return true;
    }
	
	{
	this.tasks.addTask(1, new EntityAISwimming(this));
	//this.tasks.removeTask(2, new EntityAIRestrictSun(this));
    //this.tasks.addTask(3, new EntityAIFleeSun(this, 1.0D));
    this.tasks.addTask(5, new EntityAIWander(this, 1.0D));
    this.addRandomArmor();
    //this.applyEntityAttributes();
    //this.attackEntityWithRangedAttack(getLastAttacker(), limbSwing);
    this.canBreatheUnderwater();
    this.enchantEquipment();
    this.extinguish();
    this.isAIEnabled();
    this.setAttackTarget(getLastAttacker());
    this.targetTasks.addTask(0, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, false));
    //this.tasks.removeTask(p_85156_1_);
	//private EntityAITradePlayer aiTradePlayer = new EntityAITradePlayer(this, EntityPlayer.class, 1.2D, false);
	this.isImmuneToFire = true;
	//this.addSpawn(Joe.class, 1000, 1, 5, EnumCreatureType.creature, BiomeGenBase.plains, BiomeGenBase.taigaHills, BiomeGenBase.taiga, BiomeGenBase.forest, BiomeGenBase.extremeHills);


}
 
    public CustomEntityMob(World par1World) {
        super(par1World);
        // TODO Auto-generated constructor stub
    }  
    protected void addRandomArmor()
    {
        super.addRandomArmor();
        this.setCurrentItemOrArmor(0, new ItemStack(Blocks.deadbush));
    }
	//private void setCurrentItemOrArmor(int p_70062_1_, BlockDeadBush deadbush) {
		//// TODO Auto-generated method stub
		
//	}
 
}