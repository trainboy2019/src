package com.camp.world.gen;

import java.util.Random;

//import com.bedrockminer.tutorial.block.ModBlocks;
import com.camp.block.BlockManager;

import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import cpw.mods.fml.common.IWorldGenerator;

public class ModWorldGen implements IWorldGenerator {

	private WorldGenerator gen_tutorial_ore;	//Generates Tutorial Ore (used in Overworld)
	private WorldGenerator gen_multi_ore;		//Generates Multi Ore (used in Overworld)
	private WorldGenerator gen_cobblestone;		//Generates Cobblestone (used in End)
	private WorldGenerator gen_netherCoal;
	private WorldGenerator gen_netherDiamond;
	private WorldGenerator gen_netherEmerald;
	private WorldGenerator gen_netherGold;
	private WorldGenerator gen_netherIron;
	private WorldGenerator gen_netherLapis;
	private WorldGenerator gen_netherRedstone;
	private WorldGenerator gen_netherAmethyst;
	private WorldGenerator gen_netherAquamarine;
	private WorldGenerator gen_netherCitrine;
	private WorldGenerator gen_netherCobalt;
	private WorldGenerator gen_netherFireopalCrystal;
	private WorldGenerator gen_netherJet;
	private WorldGenerator gen_netherPeridon;
	private WorldGenerator gen_netherRoseQuartz;
	private WorldGenerator gen_netherSapphire;
	private WorldGenerator gen_netherSiam;
	private WorldGenerator gen_netherTopaz;
	private WorldGenerator gen_netherRuby;
	private WorldGenerator gen_endCoal;
	private WorldGenerator gen_endAmethyst;
	private WorldGenerator gen_endAquamarine;
	private WorldGenerator gen_endCitrine;
	private WorldGenerator gen_endCobalt;
	private WorldGenerator gen_endFireopalCrystal;
	private WorldGenerator gen_endJet;
	private WorldGenerator gen_endPeridon;
	private WorldGenerator gen_endRoseQuartz;
	private WorldGenerator gen_endSapphire;
	private WorldGenerator gen_endSiam;
	private WorldGenerator gen_endTopaz;
	private WorldGenerator gen_endDiamond;
	private WorldGenerator gen_endEmerald;
	private WorldGenerator gen_endGold;
	private WorldGenerator gen_endIron;
	private WorldGenerator gen_endLapis;
	private WorldGenerator gen_endQuartz;
	private WorldGenerator gen_endRedstone;
	private WorldGenerator gen_endRuby;
	private WorldGenerator gen_overworldQuartz;
	private WorldGenerator gen_overworldAmethyst;
	private WorldGenerator gen_overworldAquamarine;
	private WorldGenerator gen_overworldCitrine;
	private WorldGenerator gen_overworldCobalt;
	private WorldGenerator gen_overworldFireopalCrystal;
	private WorldGenerator gen_overworldJet;
	private WorldGenerator gen_overworldPeridon;
	private WorldGenerator gen_overworldRoseQuartz;
	private WorldGenerator gen_overworldSapphire;
	private WorldGenerator gen_overworldSiam;
	private WorldGenerator gen_overworldTopaz;

	public ModWorldGen() {
		this.gen_tutorial_ore = new WorldGenMinable(BlockManager.tutorial_ore, 15);
		//this.gen_multi_ore = new WorldGenSingleMinable(ModBlocks.multi_ore);
		this.gen_cobblestone = new WorldGenMinable(Blocks.cobblestone, 16, Blocks.end_stone);
		this.gen_endCoal = new WorldGenMinable(BlockManager.endCoal, 15);
		this.gen_endDiamond = new WorldGenMinable(BlockManager.endDiamond, 15);
		this.gen_endEmerald = new WorldGenMinable(BlockManager.endEmerald, 15);
		this.gen_endGold = new WorldGenMinable(BlockManager.endGold, 15);
		this.gen_endIron = new WorldGenMinable(BlockManager.endIron, 15);
		this.gen_endLapis = new WorldGenMinable(BlockManager.endLapis, 15);
		this.gen_endQuartz = new WorldGenMinable(BlockManager.endQuartz, 15);
		this.gen_endRedstone = new WorldGenMinable(BlockManager.endRedstone, 15);
		this.gen_endAmethyst = new WorldGenMinable(BlockManager.endAmethyst, 15);
		this.gen_endAquamarine = new WorldGenMinable(BlockManager.endAquamarine, 15);
		this.gen_endCitrine = new WorldGenMinable(BlockManager.endCitrine, 15);
		this.gen_endCobalt = new WorldGenMinable(BlockManager.endCobalt, 15);
		this.gen_endFireopalCrystal = new WorldGenMinable(BlockManager.endFireopalCrystal, 15);
		this.gen_endJet = new WorldGenMinable(BlockManager.endJet, 15);
		this.gen_endPeridon = new WorldGenMinable(BlockManager.endPeridon, 15);
		this.gen_endRoseQuartz = new WorldGenMinable(BlockManager.endRoseQuartz, 15);
		this.gen_endSapphire = new WorldGenMinable(BlockManager.endSapphire, 15);
		this.gen_endSiam = new WorldGenMinable(BlockManager.endSiam, 15);
		this.gen_endTopaz = new WorldGenMinable(BlockManager.endTopaz, 15);
		this.gen_endRuby = new WorldGenMinable(BlockManager.endRuby, 15);
		this.gen_netherCoal = new WorldGenMinable(BlockManager.netherCoal, 15);
		this.gen_netherDiamond = new WorldGenMinable(BlockManager.netherDiamond, 15);
		this.gen_netherEmerald = new WorldGenMinable(BlockManager.netherEmerald, 15);
		this.gen_netherGold = new WorldGenMinable(BlockManager.netherGold, 15);
		this.gen_netherAmethyst = new WorldGenMinable(BlockManager.netherAmethyst, 15);
		this.gen_netherAquamarine = new WorldGenMinable(BlockManager.netherAquamarine, 15);
		this.gen_netherCitrine = new WorldGenMinable(BlockManager.netherCitrine, 15);
		this.gen_netherCobalt = new WorldGenMinable(BlockManager.netherCobalt, 15);
		this.gen_netherFireopalCrystal = new WorldGenMinable(BlockManager.netherFireopalCrystal, 15);
		this.gen_netherJet = new WorldGenMinable(BlockManager.netherJet, 15);
		this.gen_netherPeridon = new WorldGenMinable(BlockManager.netherPeridon, 15);
		this.gen_netherRoseQuartz = new WorldGenMinable(BlockManager.netherRoseQuartz, 15);
		this.gen_netherSapphire = new WorldGenMinable(BlockManager.netherSapphire, 15);
		this.gen_netherSiam = new WorldGenMinable(BlockManager.netherSiam, 15);
		this.gen_netherTopaz = new WorldGenMinable(BlockManager.netherTopaz, 15);
		this.gen_netherIron = new WorldGenMinable(BlockManager.netherIron, 15);
		this.gen_netherLapis = new WorldGenMinable(BlockManager.netherLapis, 15);
		this.gen_netherRedstone = new WorldGenMinable(BlockManager.netherRedstone, 15);
		this.gen_netherRuby = new WorldGenMinable(BlockManager.netherRuby, 15);
		this.gen_overworldQuartz = new WorldGenMinable(BlockManager.overworldQuartz, 15);
		this.gen_overworldAmethyst = new WorldGenMinable(BlockManager.overworldAmethyst, 15);
		this.gen_overworldAquamarine = new WorldGenMinable(BlockManager.overworldAquamarine, 15);
		this.gen_overworldCitrine = new WorldGenMinable(BlockManager.overworldCitrine, 15);
		this.gen_overworldCobalt = new WorldGenMinable(BlockManager.overworldCobalt, 15);
		this.gen_overworldFireopalCrystal = new WorldGenMinable(BlockManager.overworldFireopalCrystal, 15);
		this.gen_overworldJet = new WorldGenMinable(BlockManager.overworldJet, 15);
		this.gen_overworldPeridon = new WorldGenMinable(BlockManager.overworldPeridon, 15);
		this.gen_overworldRoseQuartz = new WorldGenMinable(BlockManager.overworldRoseQuartz, 15);
		this.gen_overworldSapphire = new WorldGenMinable(BlockManager.overworldSapphire, 15);
		this.gen_overworldSiam = new WorldGenMinable(BlockManager.overworldSiam, 15);
		this.gen_overworldTopaz = new WorldGenMinable(BlockManager.overworldTopaz, 15);
	}

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch (world.provider.dimensionId) {
		case 0: //Overworld
			this.runGenerator(this.gen_tutorial_ore, world, random, chunkX * 16, chunkZ * 16, 35, 0, 64);
			this.runGenerator(this.gen_overworldAmethyst, world, random, chunkX * 16, chunkZ * 16, 35, 0, 64);
			this.runGenerator(this.gen_overworldAquamarine, world, random, chunkX * 16, chunkZ * 16, 35, 0, 64);
			this.runGenerator(this.gen_overworldCitrine, world, random, chunkX * 16, chunkZ * 16, 35, 0, 64);
			this.runGenerator(this.gen_overworldCobalt, world, random, chunkX * 16, chunkZ * 16, 35, 0, 64);
			this.runGenerator(this.gen_overworldFireopalCrystal, world, random, chunkX * 16, chunkZ * 16, 35, 0, 64);
			this.runGenerator(this.gen_overworldJet, world, random, chunkX * 16, chunkZ * 16, 35, 0, 64);
			this.runGenerator(this.gen_overworldPeridon, world, random, chunkX * 16, chunkZ * 16, 35, 0, 64);
			this.runGenerator(this.gen_overworldRoseQuartz, world, random, chunkX * 16, chunkZ * 16, 35, 0, 64);
			this.runGenerator(this.gen_overworldSapphire, world, random, chunkX * 16, chunkZ * 16, 35, 0, 64);
			this.runGenerator(this.gen_overworldSiam, world, random, chunkX * 16, chunkZ * 16, 35, 0, 64);
			this.runGenerator(this.gen_overworldTopaz, world, random, chunkX * 16, chunkZ * 16, 35, 0, 64);
			//this.runGenerator(this.gen_multi_ore, world, random, chunkX * 16, chunkZ * 16, 10, 0, 16);
			break;
		case -1: //Nether

			break;
		case 1: //End
			this.runGenerator(this.gen_cobblestone, world, random, chunkX * 16, chunkZ * 16, 10, 0, 80);
			break;
		}
	}

	private void runGenerator(WorldGenerator generator, World world, Random rand, int chunk_X, int chunk_Z, int chancesToSpawn, int minHeight, int maxHeight) {
    	if (minHeight < 0 || maxHeight > 256 || minHeight > maxHeight)
    		throw new IllegalArgumentException("Illegal Height Arguments for WorldGenerator");

    	int heightDiff = maxHeight - minHeight;
    	for (int i = 0; i < chancesToSpawn; i ++) {
    		int x = chunk_X + rand.nextInt(16);
    		int y = minHeight + rand.nextInt(heightDiff);
    		int z = chunk_Z + rand.nextInt(16);
    		generator.generate(world, rand, x, y, z);
    	}
    }
}