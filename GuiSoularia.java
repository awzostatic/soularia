package com.soulariamod.hud;

import com.soulariamod.ModSoularia;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.util.Direction;
import net.minecraft.util.MathHelper;

public class GuiSoularia extends Gui
{
	String text = "Soularia V1";
	String direction1 = "Direction :";
	String fps1 = "FPS :";
	public GuiSoularia(Minecraft mc)
	{
		ScaledResolution scaled = new ScaledResolution(mc, mc.displayWidth, mc.displayHeight);
		int width = scaled.getScaledWidth();
		int height = scaled.getScaledHeight();
		int angle= MathHelper.floor_double((double) (Minecraft.getMinecraft().thePlayer.rotationYaw * 4.0F / 360.0F) +0.5D) &3;
		String direction = Direction.directions[angle];
		String var5 = "   ";
		
		drawString(mc.fontRenderer, text, width / 13, (height / 18) - 1, Integer.parseInt("555555", 16));
		drawString(mc.fontRenderer, direction, width / 5, (height / 10) - 1, Integer.parseInt("555555", 16));
		drawString(mc.fontRenderer, direction1, width / 13, (height / 10) - 1, Integer.parseInt("555555", 16));
		drawString(mc.fontRenderer, fps1, width / 13, (height / 7) - 1, Integer.parseInt("555555", 16));
		drawString(mc.fontRenderer, mc.debug.split(", ", 2)[0], width / 5, (height / 7) - 1, Integer.parseInt("555555", 16));
		
		
	}
	
}
