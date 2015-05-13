package com.camp.main;
 
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Achievement;
import net.minecraft.world.WorldType;
import net.minecraftforge.common.AchievementPage;

import com.camp.biome.BiomeRegistry;
import com.camp.biome.WorldTypeTest;
import com.camp.block.BlockManager;
//import com.camp.creativeTabs.CreativeTabManager;
import com.camp.creativetabs.CreativeTabsManager;
import com.camp.entity.EntityManager;
import com.camp.item.ItemManager;
import com.camp.lib.StringLibrary;
import com.camp.recipie.RecipieManager;
import com.camp.world.gen.OrangeWorldGenerator;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
 
@Mod(modid = StringLibrary.MODID, name = StringLibrary.name, version = StringLibrary.version)
 
public class MainRegistry {    
	 
    @SidedProxy(clientSide = "com.camp.main.ClientProxy", serverSide = "com.camp.main.ServerProxy")
 
    public static ClientProxy proxy;
    
    @Instance(StringLibrary.MODID)
	public static MainRegistry instance;
    
    
    public static Achievement achievementJoe;
 
    /**
    * Loads before
    * @param PreEvent
    */
    @EventHandler
    public static void PreLoad(FMLPreInitializationEvent PreEvent) {
    	CreativeTabsManager.mainRegistry();
        BlockManager.mainRegistry();
        ItemManager.mainRegistry();
        RecipieManager.mainRegistry();
        EntityManager.mainRegistry();
        proxy.registerRenderThings();
        //proxy.registerTileEntities();
       // CreativeTabManager.mainRegistry();
        GameRegistry.registerWorldGenerator(new OrangeWorldGenerator(), 10);
        BiomeRegistry.MainRegistry();
        
    }
 
    /**
    * Loads during
    * @param Event
    */
   // @EventHandler
    public void init(FMLInitializationEvent e) {  
    	//GameRegistry.registerWorldGenerator(new ModWorldGen(), 0);
    	achievementJoe = new Achievement("achievement.joe", "joe", 0, 0, new ItemStack(ItemManager.godBlade), (Achievement)null).initIndependentStat().registerStat();
    	
    	AchievementPage.registerAchievementPage(new AchievementPage("Random Achievements", new Achievement[]{achievementJoe}));
 
    }   
 
    /**
    * Loads after
    * @param PostEvent
    */
    @EventHandler
    public static void PostLoad(FMLPostInitializationEvent PostEvent) {
    	WorldType TEST = new WorldTypeTest(3, "test");
 
    }
 
}