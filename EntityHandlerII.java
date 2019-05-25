package com.soulariamod;

import java.util.Iterator;
import java.util.List;

import com.sun.org.apache.bcel.internal.generic.ATHROW;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.util.Direction;
import java.util.ArrayList;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.MathHelper;
import net.minecraftforge.client.event.RenderGameOverlayEvent;

public class EntityHandlerII
{
	@SideOnly(Side.CLIENT)
	@SubscribeEvent
	
	public void onRenderPre(RenderGameOverlayEvent.Pre event)
	{
		if(event.type == RenderGameOverlayEvent.ElementType.DEBUG)
		{
			Minecraft mc = Minecraft.getMinecraft();
			ScaledResolution scaled = new ScaledResolution(mc, mc.displayWidth, mc.displayHeight);
			int width = scaled.getScaledWidth();
			int height = scaled.getScaledHeight();
			event.setCanceled(true);
			int angle= MathHelper.floor_double((double) (Minecraft.getMinecraft().thePlayer.rotationYaw * 4.0F / 360.0F) +0.5D) &3;
			String direction = Direction.directions[angle];
			String var5 =EnumChatFormatting.DARK_GRAY + "   ";
			int x = (int) mc.thePlayer.posX;
			int y = (int) mc.thePlayer.posY;
			int z = (int) mc.thePlayer.posZ;
			String var4 =EnumChatFormatting.DARK_GRAY + " X : " + x + " Y : " + y + " Z : " + z;
			
			this.drawString(mc.fontRenderer, EnumChatFormatting.DARK_GRAY + mc.theWorld.getBiomeGenForCoords(MathHelper.floor_double(mc.thePlayer.posX), MathHelper.floor_double(mc.thePlayer.posZ)).biomeName + var5 + EnumChatFormatting.DARK_GRAY + direction, 8, 60, 16777215);
			this.drawString(mc.fontRenderer, var4, 8, 50, 16777215);
		}
	}	
	@SideOnly(Side.CLIENT)
	private void drawString(FontRenderer fontRenderer, String str, int x, int y, int color) 
	{
		fontRenderer.drawStringWithShadow(str, x, y, color);
	}

}
