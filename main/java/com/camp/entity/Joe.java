package com.camp.entity;

import com.camp.block.BlockManager;
import com.camp.item.ItemManager;

import net.minecraft.entity.monster.*;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityFlying;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAIOpenDoor;
import net.minecraft.entity.ai.EntityAICreeperSwell;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIArrowAttack;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.attributes.IAttributeInstance;
import net.minecraft.entity.boss.BossStatus;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;

public class Joe extends EntityZombie {
	
	public Joe(World par1World) {
		super(par1World);
		this.setSize(1.0f, 2.0f);
		this.tasks.addTask(0, new EntityAISwimming(this));
		this.tasks.addTask(1, new EntityAIWander(this, 0.3d));
		this.tasks.addTask(2, new EntityAIOpenDoor(this, true));
		this.tasks.addTask(5, new EntityAIAttackOnCollide(this, EntityPlayer.class, 1.0D, false));
        this.tasks.addTask(4, new EntityAIAttackOnCollide(this, EntityVillager.class, 1.0D, true));
        this.tasks.addTask(4, new EntityAIAttackOnCollide(this, EntityBlaze.class, 1.0D, true));
		this.targetTasks.addTask(0, new EntityAINearestAttackableTarget(this, EntityVillager.class, 0, false));
		this.targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntityBlaze.class, 0, false));
		this.targetTasks.addTask(3, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, false));
		this.targetTasks.addTask(2, new EntityAIHurtByTarget(this, true));
		this.isImmuneToFire = true;
		this.tasks.addTask(3, new EntityAITempt(this, 1.0d, Items.apple, false));
		this.canPickUpLoot();
		this.dimension = -1;
		this.dimension = 0;
		this.dimension = 1;
		this.isAirBorne = true;
		this.canBePushed();
		this.addSpawn(Joe.class, 1000, 1, 5, EnumCreatureType.creature, BiomeGenBase.plains, BiomeGenBase.taigaHills, BiomeGenBase.taiga, BiomeGenBase.forest, BiomeGenBase.extremeHills);
		this.getActivePotionEffect(Potion.moveSpeed);
		this.getActivePotionEffect(Potion.confusion);
		this.getActivePotionEffect(Potion.waterBreathing);
		this.limbSwing = 1.0f;
		this.hitByEntity(getLastAttacker());
		this.getHeldItem(Items.stone_sword);
		this.spawnExplosionParticle();
		this.setSize(1.0f, 1.0f);
		/*public void setChild(boolean par1;
	    {
	        this.getDataWatcher().updateObject(12, Byte.valueOf((byte)(par1 ? 1 : 0)));

	        if (this.worldObj != null && !this.worldObj.isRemote)
	        {
	            IAttributeInstance iattributeinstance = this.getEntityAttribute(SharedMonsterAttributes.movementSpeed);
	            iattributeinstance.removeModifier(babySpeedBoostModifier);

	            if (par1)
	            {
	                iattributeinstance.applyModifier(babySpeedBoostModifier);
	            }
	        }

	        this.func_142017_o(par1);
	    }*/
		
		
		
		// this.isDead()= true;
		// this.findPlayerToAttack()=true;

	}
	private void getHeldItem(Item ironSword) {
		// TODO Auto-generated method stub
		
	}
	private void addSpawn(Class<Joe> class1, int i, int j, int k,
			EnumCreatureType creature, BiomeGenBase plains,
			BiomeGenBase taigahills, BiomeGenBase taiga, BiomeGenBase forest,
			BiomeGenBase extremehills) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void dropFewItems(boolean recentlyHit, int lootLevel) {
	    int quantity = this.rand.nextInt(4) + 1;
	 
	    for (int i = 0; i < quantity; i++) {
	        if (this.isBurning()) {
	            this.dropItem(ItemManager.grenade, 1);
	        }
	        else {
	            Item drop = (ItemManager.lightningHammer);
	            this.dropItem(drop, 1);
	        }
	    }
	 
	}
	public boolean canBreathUnderwater(){
		return true;
	}
	ItemStack goldStackApple = new ItemStack(Items.golden_apple,1);
	@Override
	public void dropRareDrop(int par1) {
		//this.setDamage(Items.golden_apple, 1);
		//this.dropItem(Items.iron_ingot, 1);
		this.entityDropItem(new ItemStack(Items.golden_apple, 1,1),.5f);
		//this.dropItem(Items.apple,1);//.setDamage(goldStackApple, 1));//(goldStackApple);//(Items.golden_apple,1,(short)1);
		//this.dropItem(Items.gold_ingot,8);
		
	}
	



	
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth)
				.setBaseValue(100.0D);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed)
				.setBaseValue(1.0d);
		this.getEntityAttribute(SharedMonsterAttributes.attackDamage)
				.setBaseValue(5.0d);
		this.getEntityAttribute(SharedMonsterAttributes.followRange)
				.setBaseValue(15.0);

	}

	public boolean isAIEnabled() {
		return true;
	}
	
	@Override
	protected String getLivingSound()
    {
        return "cm:mob.bigCat.howl"; // It uses sounds.json file to randomize and adds 1, 2 or 3 and .ogg
    }

    /**
     * Returns the sound this mob makes when it is hurt.
     */
	@Override
	protected String getHurtSound()
    {
        return "cm:mob.bigCat.hurt"; // It uses sounds.json file to randomize and adds 1, 2 or 3 and .ogg
    }

    /**
     * Returns the sound this mob makes on death.
     */
	@Override
    protected String getDeathSound()
    {
        return "cm.sounds.mob.bigCat.death";
    }

    @Override
    protected void func_145780_a(int p_145780_1_, int p_145780_2_, int p_145780_3_, Block p_145780_4_)
    {
        this.playSound("cm:mob.bigCat.step", 0.15F, 1.0F);
    }

}