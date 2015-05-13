package com.camp.biome;

import java.util.Random;

import com.camp.block.BlockManager;
import com.camp.entity.Joe;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenDesertWells;
import net.minecraft.world.gen.feature.WorldGenIcePath;
import net.minecraft.world.gen.feature.WorldGenIceSpike;

public class BiomeGenTest extends BiomeGenBase{
	private boolean field_150615_aC;
	private WorldGenIceSpike field_150616_aD = new WorldGenIceSpike();
	private WorldGenIcePath field_150617_aE = new WorldGenIcePath(4);
	public BiomeGenTest(int id, boolean p_i45378_2_){
		super(id);
		this.field_150615_aC = p_i45378_2_;
		
		this.fillerBlock = BlockManager.multiBlock;
		//this.canSpawnLightningBolt();
		//this.spawnableCreatureList.add(new SpawnListEntry(Joe.class, 3, 1, 10));
		this.spawnableMonsterList.clear();
        this.spawnableCreatureList.clear();
        this.spawnableWaterCreatureList.clear();
        this.spawnableCreatureList.add(new SpawnListEntry(Joe.class, 3, 1, 5));
        this.theBiomeDecorator.grassPerChunk = -100;
        this.theBiomeDecorator.bigMushroomsPerChunk = 3;
        this.theBiomeDecorator.treesPerChunk = 2;
        this.theBiomeDecorator.reedsPerChunk = 10;
        this.theBiomeDecorator.grassPerChunk = -100;
        this.theBiomeDecorator.mushroomsPerChunk = 10;
        this.theBiomeDecorator.flowersPerChunk = 5;
        this.waterColorMultiplier = 0xffffff;
        this.waterColorMultiplier = 0x00ff06;
        this.setTemperatureRainfall(20.0F, 20.0F);
        //this.worldGeneratorBigTree;
        //this.
        //this.color
        //this.getModdedBiomeDecorator(BiomeGenSnow)
        //this.
        //this.getBiomeFoliageColor(50, 50, 50);
        this.isHighHumidity();
        this.getSkyColorByTemp(0);
       // this.
        //this.field_150616_aD.generate(p_76728_1_, p_76728_2_, l, p_76728_1_.getHeightValue(l, i1), i1);
        this.getModdedBiomeFoliageColor(0xff80c5);
        //this.theBiomeDecorator.bigMushroomsPerChunk = 1;
		//this.theBiomeDecorator.
        //this.desert;
        //this.field_150616_aD.generate(p_76728_1_, p_76728_2_, l, p_76728_1_.getHeightValue(l, i1), i1);
        
        
        
        
        
        this.setColor(16289679);
		
		
	}
	
	
	public void decorate(World p_76728_1_, Random p_76728_2_, int p_76728_3_, int p_76728_4_)
    {
        if (this.field_150615_aC)
        {
            int k;
            int l;
            int i1;

            for (k = 0; k < 3; ++k)
            {
                l = p_76728_3_ + p_76728_2_.nextInt(16) + 8;
                i1 = p_76728_4_ + p_76728_2_.nextInt(16) + 8;
                this.field_150616_aD.generate(p_76728_1_, p_76728_2_, l, p_76728_1_.getHeightValue(l, i1), i1);
            }

            for (k = 0; k < 2; ++k)
            {
                l = p_76728_3_ + p_76728_2_.nextInt(16) + 8;
                i1 = p_76728_4_ + p_76728_2_.nextInt(16) + 8;
                this.field_150617_aE.generate(p_76728_1_, p_76728_2_, l, p_76728_1_.getHeightValue(l, i1), i1);
            }
        }

        super.decorate(p_76728_1_, p_76728_2_, p_76728_3_, p_76728_4_);
    }
	
	
	/*public void decorate(World p_76728_1_, Random p_76728_2_, int p_76728_3_, int p_76728_4_)
    {
        super.decorate(p_76728_1_, p_76728_2_, p_76728_3_, p_76728_4_);

        if (p_76728_2_.nextInt(1000) == 0)
        {
            int k = p_76728_3_ + p_76728_2_.nextInt(16) + 8;
            int l = p_76728_4_ + p_76728_2_.nextInt(16) + 8;
            WorldGenIceSpike worldgenicespike = new WorldGenIceSpike();
            worldgenicespike.generate(p_76728_1_, p_76728_2_, k, p_76728_1_.getHeightValue(k, l) + 1, l);
        }
    }*/
	
	/*@Override
    @SideOnly(Side.CLIENT)
    public int getBiomeFoliageColor(int x, int y, int z)
    {
    	double d0 = plantNoise.func_151601_a((double)x * 0.0225D, (double)z* 0.0225D);
        return d0 < -0.1D ? 39285 : 39259;
    }*/
	//Pink Backup
	/*@Override
	//TODO:		getBiomeFoliageColor()
	public int getBiomeFoliageColor(int x, int y, int z)
	{
		return 0xffa3fe;
	}*/
	
	@Override
	//TODO:		getBiomeFoliageColor()
	public int getBiomeFoliageColor(int x, int y, int z)
	{
		return 10747818;
	}
	
	@Override
    public int getSkyColorByTemp(float par1)
    {
        return 11128415;
        
    }
	//@Override 
	public int colorMultiplier (float par1)
	{
		return 0xffffff;
		
	}

}
