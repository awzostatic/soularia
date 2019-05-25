package com.soulariamod.hud;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.client.Minecraft;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent.ElementType;

public class RenderGUIHandler 
{
    @SubscribeEvent
    public void onRenderGui(RenderGameOverlayEvent.Post event)
    {
    	if (event.type != ElementType.EXPERIENCE) return;
    	new GuiSoularia(Minecraft.getMinecraft());
    }
}
