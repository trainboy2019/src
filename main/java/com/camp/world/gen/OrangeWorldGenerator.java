package com.camp.world.gen;

import java.util.Random;

import com.camp.block.BlockManager;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class OrangeWorldGenerator implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch(world.provider.dimensionId){
			case 0: generateOverworld(random, world, chunkX * 16, chunkZ * 16); break;
			case 1: generateEnd(random, world, chunkX * 16, chunkZ * 16); break;
			case -1: generateNether(random, world, chunkX * 16, chunkZ * 16); break;
			default: generateOverworld(random, world, chunkX * 16, chunkZ * 16);
		}
		
	}

	private void generateOverworld(Random random, World world, int x, int z) {
		//addOresOverworld(Block to spawn <BlockManager.***>, world, random, x, z, minVainSize, maxVainSize, chanceToSpawn, minY, maxY);
		addOresOverworld(BlockManager.tutorial_ore, world, random, x, z, 3, 10, 20, 8, 20);
		addOresOverworld(BlockManager.overworldQuartz, world, random, x, z, 3, 10, 20, 8, 20);
		addOresOverworld(BlockManager.overworldAmethyst, world, random, x, z, 3, 10, 20, 8, 20);
		addOresOverworld(BlockManager.overworldAquamarine, world, random, x, z, 3, 10, 20, 8, 20);
		addOresOverworld(BlockManager.overworldCitrine, world, random, x, z, 3, 10, 20, 8, 20);
		addOresOverworld(BlockManager.overworldCobalt, world, random, x, z, 3, 10, 20, 8, 20);
		addOresOverworld(BlockManager.overworldFireopalCrystal, world, random, x, z, 3, 10, 20, 8, 20);
		addOresOverworld(BlockManager.overworldJet, world, random, x, z, 3, 10, 20, 8, 20);
		addOresOverworld(BlockManager.overworldPeridon, world, random, x, z, 3, 10, 20, 8, 20);
		addOresOverworld(BlockManager.overworldRoseQuartz, world, random, x, z, 3, 10, 20, 8, 20);
		addOresOverworld(BlockManager.overworldSapphire, world, random, x, z, 3, 10, 20, 8, 20);
		addOresOverworld(BlockManager.overworldSiam, world, random, x, z, 3, 10, 20, 8, 20);
		addOresOverworld(BlockManager.overworldTopaz, world, random, x, z, 3, 10, 20, 8, 20);
		addOresOverworld(BlockManager.overworldQuartz, world, random, x, z, 3, 10, 20, 8, 20);
	}

	private void generateEnd(Random random, World world, int x, int z) {
		//addOresEnd(Block to spawn <BlockManager.***>, world, random, x, z, minVainSize, maxVainSize, chanceToSpawn, minY, maxY);
		addOresEnd(BlockManager.endCoal, world, random, x, z, 3, 10, 20, 8, 40);
		addOresEnd(BlockManager.endDiamond, world, random, x, z, 3, 10, 20, 8, 40);
		addOresEnd(BlockManager.endEmerald, world, random, x, z, 3, 10, 20, 8, 40);
		addOresEnd(BlockManager.endGold, world, random, x, z, 3, 10, 20, 8, 40);
		addOresEnd(BlockManager.endIron, world, random, x, z, 3, 10, 20, 8, 40);
		addOresEnd(BlockManager.endLapis, world, random, x, z, 3, 10, 20, 8, 40);
		addOresEnd(BlockManager.endQuartz, world, random, x, z, 3, 10, 20, 8, 40);
		addOresEnd(BlockManager.endRedstone, world, random, x, z, 3, 10, 20, 8, 40);
		addOresEnd(BlockManager.endRuby, world, random, x, z, 3, 10, 20, 8, 40);
		addOresEnd(BlockManager.endAmethyst, world, random, x, z, 3, 10, 20, 8, 20);
		addOresEnd(BlockManager.endAquamarine, world, random, x, z, 3, 10, 20, 8, 20);
		addOresEnd(BlockManager.endCitrine, world, random, x, z, 3, 10, 20, 8, 20);
		addOresEnd(BlockManager.endCobalt, world, random, x, z, 3, 10, 20, 8, 20);
		addOresEnd(BlockManager.endFireopalCrystal, world, random, x, z, 3, 10, 20, 8, 20);
		addOresEnd(BlockManager.endJet, world, random, x, z, 3, 10, 20, 8, 20);
		addOresEnd(BlockManager.endPeridon, world, random, x, z, 3, 10, 20, 8, 20);
		addOresEnd(BlockManager.endRoseQuartz, world, random, x, z, 3, 10, 20, 8, 20);
		addOresEnd(BlockManager.endSapphire, world, random, x, z, 3, 10, 20, 8, 20);
		addOresEnd(BlockManager.endSiam, world, random, x, z, 3, 10, 20, 8, 20);
		addOresEnd(BlockManager.endTopaz, world, random, x, z, 3, 10, 20, 8, 20);
	}

	private void generateNether(Random random, World world, int x, int z) {
		//addOresNether(Block to spawn <BlockManager.***>, world, random, x, z, minVainSize, maxVainSize, chanceToSpawn, minY, maxY);
		addOresNether(BlockManager.netherCoal, world, random, x, z, 3, 10, 20, 8, 50);
		addOresNether(BlockManager.netherDiamond, world, random, x, z, 3, 10, 20, 8, 50);
		addOresNether(BlockManager.netherEmerald, world, random, x, z, 3, 10, 20, 8, 50);
		addOresNether(BlockManager.netherGold, world, random, x, z, 3, 10, 20, 8, 50);
		addOresNether(BlockManager.netherIron, world, random, x, z, 3, 10, 20, 8, 50);
		addOresNether(BlockManager.netherLapis, world, random, x, z, 3, 10, 20, 8, 50);
		addOresNether(BlockManager.netherRedstone, world, random, x, z, 3, 10, 20, 8, 50);
		addOresNether(BlockManager.netherRuby, world, random, x, z, 3, 10, 20, 8, 50);
		addOresNether(BlockManager.netherAmethyst, world, random, x, z, 3, 10, 20, 8, 20);
		addOresNether(BlockManager.netherAquamarine, world, random, x, z, 3, 10, 20, 8, 20);
		addOresNether(BlockManager.netherCitrine, world, random, x, z, 3, 10, 20, 8, 20);
		addOresNether(BlockManager.netherCobalt, world, random, x, z, 3, 10, 20, 8, 20);
		addOresNether(BlockManager.netherFireopalCrystal, world, random, x, z, 3, 10, 20, 8, 20);
		addOresNether(BlockManager.netherJet, world, random, x, z, 3, 10, 20, 8, 20);
		addOresNether(BlockManager.netherPeridon, world, random, x, z, 3, 10, 20, 8, 20);
		addOresNether(BlockManager.netherRoseQuartz, world, random, x, z, 3, 10, 20, 8, 20);
		addOresNether(BlockManager.netherSapphire, world, random, x, z, 3, 10, 20, 8, 20);
		addOresNether(BlockManager.netherSiam, world, random, x, z, 3, 10, 20, 8, 20);
		addOresNether(BlockManager.netherTopaz, world, random, x, z, 3, 10, 20, 8, 20);
	}
	
	
    /**
    *
    * This method adds our block to the world.
    * It randomizes the coordinates, and does that as many times, as defined in spawnChance.
    * Then it gives all the params to WorldGenMinable, which handles the replacing of the ores for us.
    *
    * @param block The block you want to spawn
    * @param world The world
    * @param random The Random
    * @param blockXPos the blockXpos of a chunk
    * @param blockZPos the blockZpos of a chunk
    * @param minVeinSize min vein
    * @param maxVeinSize max vein
    * @param chancesToSpawn the chance to spawn. Usually around 2
    * @param minY lowest point to spawn
    * @param maxY highest point to spawn
    */

   public void addOresOverworld(Block block, World world, Random random, int blockXPos, int blockZPos, int minVeinSize, int maxVeinSize, int chancesToSpawn, int minY, int maxY )
   {
       WorldGenMinable minable = new WorldGenMinable(block, (minVeinSize + random.nextInt(maxVeinSize - minVeinSize)), Blocks.stone);
       for(int i = 0; i < chancesToSpawn; i++)
       {
           int posX = blockXPos + random.nextInt(16);
           int posY = minY + random.nextInt(maxY - minY);
           int posZ = blockZPos + random.nextInt(16);
           minable.generate(world, random, posX, posY, posZ);
       }
   }
   
   
   public void addOresEnd(Block block, World world, Random random, int blockXPos, int blockZPos, int minVeinSize, int maxVeinSize, int chancesToSpawn, int minY, int maxY )
   {
       WorldGenMinable minable = new WorldGenMinable(block, (minVeinSize + random.nextInt(maxVeinSize - minVeinSize)), Blocks.end_stone);
       for(int i = 0; i < chancesToSpawn; i++)
       {
           int posX = blockXPos + random.nextInt(16);
           int posY = minY + random.nextInt(maxY - minY);
           int posZ = blockZPos + random.nextInt(16);
           minable.generate(world, random, posX, posY, posZ);
       }
   }
   
   public void addOresNether(Block block, World world, Random random, int blockXPos, int blockZPos, int minVeinSize, int maxVeinSize, int chancesToSpawn, int minY, int maxY )
   {
       WorldGenMinable minable = new WorldGenMinable(block, (minVeinSize + random.nextInt(maxVeinSize - minVeinSize)), Blocks.netherrack);
       for(int i = 0; i < chancesToSpawn; i++)
       {
           int posX = blockXPos + random.nextInt(16);
           int posY = minY + random.nextInt(maxY - minY);
           int posZ = blockZPos + random.nextInt(16);
           minable.generate(world, random, posX, posY, posZ);
       }
   }

}
