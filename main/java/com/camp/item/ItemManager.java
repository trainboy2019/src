package com.camp.item;
 
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemSeeds;
import net.minecraftforge.common.util.EnumHelper;

import com.camp.block.BlockManager;
import com.camp.creativetabs.CreativeTabsManager;
import com.camp.lib.StringLibrary;
import com.camp.main.MainRegistry;
import com.camp.item.ItemLogBlocks;

import cpw.mods.fml.common.registry.GameRegistry;
 
public class ItemManager{
 
    public static void mainRegistry(){
        initializeItem();
        registerItem();
    }
  
    public static Item customItem;
    public static Item customShovel;
    public static Item itemTreePitch;
    public static Item lightningHammer;
    public static Item grenade;
    public static Item cherry;
    public static Item itemLogBlocks;
    public static Item itemLeafBlocks;
    public static Item godBlade;
    public static Item tutorial_item;
    public static Item amethystGem;
    public static Item aquamarineGem;
    public static Item citrineGem;
    public static Item cobaltGem;
    public static Item fireopalCrystal;
    public static Item jetGem;
    public static Item peridonGem;
    public static Item roseCrystal;
    public static Item sapphireGem;
    public static Item siamGem;
    public static Item topazGem;
    public static Item customSeeds;
    public static Item customItemCrops;
    public static Item customSword;
    public static Item customHoe;
    public static Item customAxe;
    public static Item customPickaxe;
    public static ArmorMaterial godArmor = EnumHelper.addArmorMaterial("GodArmor", 66, new int[]{6, 16, 12, 6}, 20);
    public static Item customHelmet = new CustomArmor(godArmor, MainRegistry.proxy.addArmor("CustomHelmet"), 0);
    public static Item customChestplate = new CustomArmor(godArmor, MainRegistry.proxy.addArmor("CustomChestplate"), 1);
    public static Item customLeggings = new CustomArmor(godArmor, MainRegistry.proxy.addArmor("CustomLeggings"), 2);
    public static Item customBoots = new CustomArmor(godArmor, MainRegistry.proxy.addArmor("CustomBoots"), 3);
    //public static ArmorMaterial godArmor = EnumHelper.addArmorMaterial("GodArmor", 66, new int[]{6, 16, 12, 6}, 20);
    public static ToolMaterial Red = EnumHelper.addToolMaterial("Red", 4, 1750, 8.0F, 5, 30);
    public static ToolMaterial God = EnumHelper.addToolMaterial("God", 5, 638189, 20.0F, 999999995, 999999999);

 
    public static void initializeItem() {
    	customItem = new CustomItem(4,4.0f,false);
    	cherry = new Cherry(2, 20, true).setCreativeTab(CreativeTabs.tabMisc).setUnlocalizedName("Cherry");
        //@Override
        customSeeds = new ItemSeeds(BlockManager.customBlockCrops, Blocks.packed_ice).setCreativeTab(CreativeTabsManager.tabItem).setUnlocalizedName("CustomSeeds").setTextureName(StringLibrary.MODID + ":custom_seeds");
        /*@Override
        protected boolean canPlaceBlockOn(Block parBlock)
        {
            return parBlock == Blocks.farmland;
        }*/
        
        grenade = new ItemGrenade().setUnlocalizedName("Grenade").setCreativeTab(CreativeTabs.tabCombat);//.setTextureName(StringLibrary.MODID + ":grenade");
        itemLogBlocks = new ItemLogBlocks(BlockManager.blockLog).setUnlocalizedName("ItemLogBlocks").setCreativeTab(CreativeTabsManager.tabItem);
        itemLeafBlocks = new ItemLeafBlocks(BlockManager.blockLeaf).setUnlocalizedName("ItemLeafBlocks").setCreativeTab(CreativeTabsManager.tabItem);
        customItemCrops = new Item().setCreativeTab(CreativeTabsManager.tabItem).setUnlocalizedName("CustomItemCrops").setTextureName(StringLibrary.MODID + ":custom_item_crops");
        itemTreePitch = new NCItems().setUnlocalizedName("TreePitch").setCreativeTab(CreativeTabsManager.tabItem);
        tutorial_item = new Item().setCreativeTab(CreativeTabsManager.tabItem).setUnlocalizedName("tutorial_item").setTextureName(StringLibrary.MODID + ":ruby");
        amethystGem = new Item().setCreativeTab(CreativeTabsManager.tabItem).setUnlocalizedName("amethystGem").setTextureName(StringLibrary.MODID + ":amethystGem");
        aquamarineGem = new Item().setCreativeTab(CreativeTabsManager.tabItem).setUnlocalizedName("aquamarineGem").setTextureName(StringLibrary.MODID + ":aquamarineGem");
        citrineGem = new Item().setCreativeTab(CreativeTabsManager.tabItem).setUnlocalizedName("citrineGem").setTextureName(StringLibrary.MODID + ":citrineGem");
        cobaltGem = new Item().setCreativeTab(CreativeTabsManager.tabItem).setUnlocalizedName("cobaltGem").setTextureName(StringLibrary.MODID + ":cobaltGem");
        fireopalCrystal = new Item().setCreativeTab(CreativeTabsManager.tabItem).setUnlocalizedName("fireopalCrystal").setTextureName(StringLibrary.MODID + ":fireopalCrystal");
        jetGem = new Item().setCreativeTab(CreativeTabsManager.tabItem).setUnlocalizedName("jetGem").setTextureName(StringLibrary.MODID + ":jetGem");
        peridonGem = new Item().setCreativeTab(CreativeTabsManager.tabItem).setUnlocalizedName("peridonGem").setTextureName(StringLibrary.MODID + ":peridonGem");
        roseCrystal = new Item().setCreativeTab(CreativeTabsManager.tabItem).setUnlocalizedName("roseCrystal").setTextureName(StringLibrary.MODID + ":roseCrystal");
        sapphireGem = new Item().setCreativeTab(CreativeTabsManager.tabItem).setUnlocalizedName("sapphireGem").setTextureName(StringLibrary.MODID + ":sapphireGem");
        siamGem = new Item().setCreativeTab(CreativeTabsManager.tabItem).setUnlocalizedName("siamGem").setTextureName(StringLibrary.MODID + ":siamGem");
        topazGem = new Item().setCreativeTab(CreativeTabsManager.tabItem).setUnlocalizedName("topazGem").setTextureName(StringLibrary.MODID + ":topazGem");
        customSword = new CustomSword(Red).setUnlocalizedName("CustomSword").setCreativeTab(CreativeTabs.tabCombat);//.setTextureName(StringLibrary.MODID + ":custom_sword");
        customHoe = new CustomHoe(Red).setUnlocalizedName("CustomHoe").setCreativeTab(CreativeTabs.tabTools);//.setTextureName(StringLibrary.MODID + ":custom_hoe");
        customPickaxe = new CustomPickaxe(Red).setUnlocalizedName("CustomPickaxe").setCreativeTab(CreativeTabs.tabTools);//.setTextureName(StringLibrary.MODID + ":custom_pickaxe");
        customAxe = new CustomAxe(Red).setUnlocalizedName("CustomAxe").setCreativeTab(CreativeTabs.tabTools);//.setTextureName(StringLibrary.MODID + ":custom_axe");
        customShovel = new CustomPickaxe(Red).setUnlocalizedName("CustomShovel").setCreativeTab(CreativeTabs.tabTools).setTextureName("cm:custom_shovel");
        customHelmet = new CustomArmor(godArmor, MainRegistry.proxy.addArmor("CustomHelmet"), 0).setUnlocalizedName("CustomHelmet").setCreativeTab(CreativeTabs.tabCombat).setTextureName(StringLibrary.MODID + ":custom_helmet");
        customChestplate = new CustomArmor(godArmor, MainRegistry.proxy.addArmor("CustomHelmet"), 1).setUnlocalizedName("CustomChestplate").setCreativeTab(CreativeTabs.tabCombat).setTextureName(StringLibrary.MODID + ":custom_chestplate");
        customLeggings = new CustomArmor(godArmor, MainRegistry.proxy.addArmor("CustomHelmet"), 2).setUnlocalizedName("CustomLeggings").setCreativeTab(CreativeTabs.tabCombat).setTextureName(StringLibrary.MODID + ":custom_leggings");
        customBoots = new CustomArmor(godArmor, MainRegistry.proxy.addArmor("CustomHelmet"), 3).setUnlocalizedName("CustomBoots").setCreativeTab(CreativeTabs.tabCombat).setTextureName(StringLibrary.MODID + ":custom_boots");
        lightningHammer = new LightningHammer().setCreativeTab(CreativeTabsManager.tabItem).setUnlocalizedName("LightningHammer");//.setTextureName(StringLibrary.MODID + ":lightning_hammer");
        godBlade = new GodBlade("godBlade", God).setCreativeTab(CreativeTabsManager.tabItem).setUnlocalizedName("GodBlade");//.setTextureName(StringLibrary.MODID + ":god_blade");
    }
 
    public static void registerItem(){
    	GameRegistry.registerItem(cherry, cherry.getUnlocalizedName());
        GameRegistry.registerItem(customItem, customItem.getUnlocalizedName());
        GameRegistry.registerItem(customSeeds, customSeeds.getUnlocalizedName());
        GameRegistry.registerItem(customSword, customSword.getUnlocalizedName());
        GameRegistry.registerItem(customAxe, customAxe.getUnlocalizedName());
        GameRegistry.registerItem(itemTreePitch, "TreePitch");
        GameRegistry.registerItem(tutorial_item = new Item().setUnlocalizedName("tutorial_item").setCreativeTab(CreativeTabsManager.tabItem).setTextureName(StringLibrary.MODID + ":tutorial_item"), "tutorial_item");
        GameRegistry.registerItem(amethystGem = new Item().setUnlocalizedName("amethystGem").setCreativeTab(CreativeTabsManager.tabItem).setTextureName(StringLibrary.MODID + ":amethystGem"), "amethystGem");
        GameRegistry.registerItem(aquamarineGem = new Item().setUnlocalizedName("aquamarineGem").setCreativeTab(CreativeTabsManager.tabItem).setTextureName(StringLibrary.MODID + ":aquamarineGem"), "aquamarineGem");
        GameRegistry.registerItem(citrineGem = new Item().setUnlocalizedName("citrineGem").setCreativeTab(CreativeTabsManager.tabItem).setTextureName(StringLibrary.MODID + ":citrineGem"), "citrineGem");
        GameRegistry.registerItem(cobaltGem = new Item().setUnlocalizedName("cobaltGem").setCreativeTab(CreativeTabsManager.tabItem).setTextureName(StringLibrary.MODID + ":cobaltGem"), "cobaltGem");
        GameRegistry.registerItem(fireopalCrystal = new Item().setUnlocalizedName("fireopalCrystal").setCreativeTab(CreativeTabsManager.tabItem).setTextureName(StringLibrary.MODID + ":fireopalCrystal"), "fireopalCrystal");
        GameRegistry.registerItem(jetGem = new Item().setUnlocalizedName("jetGem").setCreativeTab(CreativeTabsManager.tabItem).setTextureName(StringLibrary.MODID + ":jetGem"), "jetGem");
        GameRegistry.registerItem(peridonGem = new Item().setUnlocalizedName("peridonGem").setCreativeTab(CreativeTabsManager.tabItem).setTextureName(StringLibrary.MODID + ":peridonGem"), "peridonGem");
        GameRegistry.registerItem(roseCrystal = new Item().setUnlocalizedName("roseCrystal").setCreativeTab(CreativeTabsManager.tabItem).setTextureName(StringLibrary.MODID + ":roseCrystal"), "roseCrystal");
        GameRegistry.registerItem(sapphireGem = new Item().setUnlocalizedName("sapphireGem").setCreativeTab(CreativeTabsManager.tabItem).setTextureName(StringLibrary.MODID + ":sapphireGem"), "sapphireGem");
        GameRegistry.registerItem(siamGem = new Item().setUnlocalizedName("siamGem").setCreativeTab(CreativeTabsManager.tabItem).setTextureName(StringLibrary.MODID + ":siamGem"), "siamGem");
        GameRegistry.registerItem(topazGem = new Item().setUnlocalizedName("topazGem").setCreativeTab(CreativeTabsManager.tabItem).setTextureName(StringLibrary.MODID + ":topazGem"), "topazGem");
        //GameRegistry.registerItem(tutorial_item, tutorial_item.getUnlocalizedName());
        GameRegistry.registerItem(customItemCrops, customItemCrops.getUnlocalizedName());
        GameRegistry.registerItem(customHoe, customHoe.getUnlocalizedName());
        GameRegistry.registerItem(customShovel, customShovel.getUnlocalizedName());
        GameRegistry.registerItem(customPickaxe, customPickaxe.getUnlocalizedName());
        GameRegistry.registerItem(lightningHammer, lightningHammer.getUnlocalizedName());
        GameRegistry.registerItem(customHelmet, customHelmet.getUnlocalizedName());
        GameRegistry.registerItem(customChestplate, customChestplate.getUnlocalizedName());
        GameRegistry.registerItem(customLeggings, customLeggings.getUnlocalizedName());
        GameRegistry.registerItem(customBoots, customBoots.getUnlocalizedName());
        GameRegistry.registerItem(grenade, grenade.getUnlocalizedName());
        GameRegistry.registerItem(godBlade, godBlade.getUnlocalizedName());
    }
    
}
 