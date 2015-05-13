package com.camp.main;
 
import net.minecraft.client.renderer.entity.RenderSnowball;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;

import com.camp.block.BlockManager;
import com.camp.entity.CustomEntityMob;
import com.camp.entity.EntityGrenade;
import com.camp.entity.Joe;
import com.camp.entity.Pal;
import com.camp.entity.TechnoCreeper;
import com.camp.item.ItemManager;
import com.camp.model.ModelJoe;
import com.camp.model.ModelPal;
import com.camp.model.ModelTechnoCreeper;
import com.camp.model.cbc32801Ninja;
import com.camp.render.ItemRendererSapphireChest;
import com.camp.render.RenderJoe;
import com.camp.render.RenderPal;
import com.camp.render.RenderTechnoCreeper;
import com.camp.render.Rendercbc32801Ninja;

import cpw.mods.fml.client.registry.RenderingRegistry;
 
public class ClientProxy extends ServerProxy {
	
	//public void init(FMLInitializationEvent e) {
	   // GameRegistry.registerWorldGenerator(new ModWorldGen(), 0);
	//}
 
    public void registerRenderThings() {
    	MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockManager.sapphireChest), new ItemRendererSapphireChest());

    	RenderingRegistry.registerEntityRenderingHandler(EntityGrenade.class, new RenderSnowball(ItemManager.grenade));
    	RenderingRegistry.registerEntityRenderingHandler(TechnoCreeper.class, new RenderTechnoCreeper(new ModelTechnoCreeper(), 0));
    	//RenderingRegistry.registerEntityRenderingHandler(CustomEntityMob.class, new Rendercbc32801Ninja(new cbc32801Ninja(), 0));
    	//RenderingRegistry.registerEntityRenderingHandler(CustomEntityMob.class, new Rendercbc32);
    	RenderingRegistry.registerEntityRenderingHandler(Joe.class, new RenderJoe(new ModelJoe(), 0));
    	RenderingRegistry.registerEntityRenderingHandler(Pal.class, new RenderPal(new ModelPal(), 0));
    	RenderingRegistry.registerEntityRenderingHandler(CustomEntityMob.class, new Rendercbc32801Ninja(new cbc32801Ninja(), 0));
    	
    	//ClientRegistry.bindTileEntitySpecialRenderer(TileEntityTutChest.class, new TutChestRenderer());
		//MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(), new ItemRenderTutChest());
 
    }
 
    public int addArmor(String armor) {
        return RenderingRegistry.addNewArmourRendererPrefix(armor);
    }
 
}