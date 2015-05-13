package com.camp.biome;

import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;

public class BiomeRegistry {
	
	public static void MainRegistry(){
		initializeBiome();
		registerBiome();
	}
		public static BiomeGenBase biomeTest;
		
		public static void initializeBiome(){
			biomeTest = new BiomeGenTest(137, true).setBiomeName("Test").setTemperatureRainfall(20F, 20F);
		}
		
		public static void registerBiome(){
			BiomeDictionary.registerBiomeType(biomeTest, Type.MAGICAL);
			BiomeManager.addSpawnBiome(biomeTest);
			
		}

}
