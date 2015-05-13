package com.camp.entity;

import net.minecraft.entity.EntityList;
import cpw.mods.fml.common.registry.EntityRegistry;

public class EntityManager {
 
    public static void mainRegistry() {
        registerEntity();
    }
 
    public static void registerEntity(){
        createEntity(CustomEntityMob.class, "CustomEntityMob", 0x00FF00, 0xFF0000);
        createEntity(Joe.class, "Bob", 0xF6FF00, 0x00FFA2);
        createEntity(TechnoCreeper.class, "TechnoCreeper", 0, 0x00FBFF);
        //createEntity(Pal.class, "Pal", 0xFFFB00, 0);
    }
 
    public static void createEntity(Class entityClass, String entityName, int solidColor, int spotColor) {
        int entityId = EntityRegistry.findGlobalUniqueEntityId();
        EntityRegistry.registerGlobalEntityID(entityClass, entityName, entityId);
        EntityList.entityEggs.put(Integer.valueOf(entityId), new EntityList.EntityEggInfo(entityId, solidColor, spotColor));
    }
 
}