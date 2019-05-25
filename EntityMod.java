package com.soulariamod.init;

import com.soulariamod.entity.EntitySoular;
import com.soulariamod.handlers.EntityHandler;

public class EntityMod 
{
	public static void init()
	{
		EntityHandler.registerMonster(EntitySoular.class, "Soular");
	}


}
