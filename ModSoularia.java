package com.soulariamod;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.soulariamod.entity.EntitySoular;
import com.soulariamod.hud.RenderGUIHandler;
import com.soulariamod.init.BlockMod;
import com.soulariamod.init.EntityDynamite;
import com.soulariamod.init.EntityMod;
import com.soulariamod.init.ItemMod;
import com.soulariamod.proxy.CommonProxy;
import com.soulariamod.world.WorldRegister;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;

@Mod(modid = CheminSoularia.MOD_ID, name = CheminSoularia.MOD_NAME, version = CheminSoularia.VERSION)

public class ModSoularia 
{
	@Instance(CheminSoularia.MOD_ID)
	public static ModSoularia instance;
	
	@SidedProxy(clientSide = CheminSoularia.CLIENT_PROXY, serverSide = CheminSoularia.SERVER_PROXY)
	public static CommonProxy proxy;
	
	public static CreativeTabs tabSoularia = new CreativeTabs("tabSoularia")
	{
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem()
			{
				return ItemMod.item_enfer;
			}
	};
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		ItemMod.init();
		ItemMod.register();
		BlockMod.init();
		BlockMod.register();
		WorldRegister.MainRegistry();
		
	}
	@EventHandler
	public void Init(FMLInitializationEvent event)
	{
		proxy.registerRenders();
		EntityMod.init();
		EntityRegistry.registerModEntity(EntityDynamite.class, "EntityDynamite", 420, ModSoularia.instance, 32, 20, false);		
	}
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		MinecraftForge.EVENT_BUS.register(new RenderGUIHandler());
		MinecraftForge.EVENT_BUS.register(new EntityHandlerII());
	}
}
