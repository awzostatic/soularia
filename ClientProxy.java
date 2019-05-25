package com.soulariamod.proxy;

import com.soulariamod.entity.EntitySoular;
import com.soulariamod.init.EntityDynamite;
import com.soulariamod.init.ItemMod;
import com.soulariamod.models.ModelSoular;
import com.soulariamod.render.EntityRender;
import com.sun.javafx.scene.control.behavior.KeyBinding;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent.KeyInputEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiIngameMenu;
import net.minecraft.client.renderer.entity.RenderSnowball;
import net.minecraftforge.common.MinecraftForge;

public class ClientProxy extends CommonProxy
{
    public static KeyBinding keyBinding;
	@Override
	public void registerRenders ()
	{
		RenderingRegistry.registerEntityRenderingHandler(EntitySoular.class, new EntityRender(new ModelSoular(), 0.6F));
        RenderingRegistry.registerEntityRenderingHandler(EntityDynamite.class, new RenderSnowball(ItemMod.dynamite));
        
    }
 
    public ClientProxy()
    {
    	
    }
 
    @SubscribeEvent
    public void onEvent(KeyInputEvent event)
    {
 
    }
 
    private void keyPressed()
    {
 
    }
 
}
