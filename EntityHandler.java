package com.soulariamod.handlers;

import java.awt.Color;
import java.util.Random;

import com.soulariamod.ModSoularia;

import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;

public class EntityHandler 
{
	public static void registerMonster(Class entityClass, String string)
	{
		int entityID = EntityRegistry.findGlobalUniqueEntityId();
		
		EntityRegistry.registerGlobalEntityID(entityClass, string, EntityRegistry.findGlobalUniqueEntityId(), new Color(247, 208, 200).getRGB(), new Color(118, 60, 169).getRGB());
		EntityRegistry.addSpawn(string, 1, 2, 5, EnumCreatureType.monster, BiomeGenBase.beach);
		EntityRegistry.registerModEntity(entityClass, string, entityID, ModSoularia.instance, 4, 1, true);
	}

}
