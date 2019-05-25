package com.soulariamod.init;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

public class RenderDynamite extends Render
{
   private Item dynamite;
   private int RenderDynamite;
   private static final String __OBFID = "CL_00001008";

   public RenderDynamite(Item dynamite, int RenderDynamite)
   {
       this.dynamite = dynamite;
       this.RenderDynamite = RenderDynamite;
   }

   public RenderDynamite(Item dynamite)
   {
       this(dynamite, 0);
   }

   @Override
   public void doRender(Entity dynamite, double x, double y, double z, float dynamite1, float RenderDynamite)
   {
       // TODO Auto-generated method stub

   }

   @Override
   protected ResourceLocation getEntityTexture(Entity dynamite)
   {
       // TODO Auto-generated method stub
       return null;
   }
}