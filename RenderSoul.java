package com.soulariamod.init;

import com.soulariamod.entity.EntitySoular;
import com.soulariamod.models.ModelSoular;
import com.soulariamod.render.EntityRender;

import cpw.mods.fml.client.registry.RenderingRegistry;

public class RenderSoul
{
    public static void init()
    {
        RenderingRegistry.registerEntityRenderingHandler(EntitySoular.class, new EntityRender(new ModelSoular(), 0.5F));
    }
}