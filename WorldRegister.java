package com.soulariamod.world;

import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.registry.GameRegistry;

public class WorldRegister 
{
   public static void MainRegistry()
   
   {
	   registerWorldGen(new WorldGenMinerais(), 0);
	   
   }
   
   public static void registerWorldGen(IWorldGenerator iGenerator, int probability)
   {
	   GameRegistry.registerWorldGenerator(iGenerator, probability);
   }
}
