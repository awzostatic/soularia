package com.soulariamod.render;

import com.soulariamod.CheminSoularia;
import com.soulariamod.entity.EntitySoular;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;

public class EntityRender extends RenderLiving
{


	private ResourceLocation texture = new ResourceLocation(CheminSoularia.MOD_ID + ":textures/mobs/mobsoular.png");
    
    public EntityRender(ModelBase p_i1262_1_, float p_i1262_2_)
    {
        super(p_i1262_1_, p_i1262_2_);
    }
    
    protected ResourceLocation getEntityTexture(EntityLiving living)
    {
        return this.getEntityTexture((EntitySoular) living);
    }

    @Override
    protected ResourceLocation getEntityTexture(Entity p_110775_1_)
    {
        return texture;
    }   
}
