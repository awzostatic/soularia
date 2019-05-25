package com.soulariamod.init;

import com.soulariamod.CheminSoularia;
import com.soulariamod.ModSoularia;
import com.soulariamod.init.blocks.BlockClassic;
import com.soulariamod.item.BlockEchelle;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class BlockMod 
{
	public static Block mineraisruby;
	public static Block mineraiscobalt;
	public static Block mineraisjade;
	public static Block mineraisenfer;
	public static Block mineraissoularium;
	public static Block blockruby;
	public static Block blockcobalt;
	public static Block blockjade;
	public static Block blockenfer;
	public static Block blocksoularium;
	public static Block blocksupreme;
	public static Block renforcedobsidian;
	public static Block renforcedcobblestone;
	public static Block echelleruby;
	
	public static void init()
	{
		mineraisruby = new BlockClassic(Material.rock).setBlockName("mineraisruby").setCreativeTab(ModSoularia.tabSoularia).setBlockTextureName(CheminSoularia.MOD_ID + ":mineraisruby").setHardness(15.0F).setResistance(50.0F);
		renforcedobsidian = new BlockClassic(Material.rock).setBlockName("renforcedobsidian").setCreativeTab(ModSoularia.tabSoularia).setBlockTextureName(CheminSoularia.MOD_ID + ":renforcedobsidian").setHardness(50.0F).setResistance(7500.0F);
		renforcedcobblestone = new BlockClassic(Material.rock).setBlockName("renforcedcobblestone").setCreativeTab(ModSoularia.tabSoularia).setBlockTextureName(CheminSoularia.MOD_ID + ":renforcedcobblestone").setHardness(15.0F).setResistance(60.0F);
		mineraiscobalt = new BlockClassic(Material.rock).setBlockName("mineraiscobalt").setCreativeTab(ModSoularia.tabSoularia).setBlockTextureName(CheminSoularia.MOD_ID + ":mineraiscobalt").setHardness(15.0F).setResistance(50.0F);
		mineraisjade = new BlockClassic(Material.rock).setBlockName("mineraisjade").setCreativeTab(ModSoularia.tabSoularia).setBlockTextureName(CheminSoularia.MOD_ID + ":mineraisjade").setHardness(15.0F).setResistance(50.0F);
		mineraisenfer = new BlockClassic(Material.rock).setBlockName("mineraisenfer").setCreativeTab(ModSoularia.tabSoularia).setBlockTextureName(CheminSoularia.MOD_ID + ":mineraisenfer").setHardness(15.0F).setResistance(50.0F);
		mineraissoularium = new BlockClassic(Material.rock).setBlockName("mineraissoularium").setCreativeTab(ModSoularia.tabSoularia).setBlockTextureName(CheminSoularia.MOD_ID + ":mineraissoularium").setHardness(15.0F).setResistance(50.0F);
		blockruby = new BlockClassic(Material.rock).setBlockName("blockruby").setCreativeTab(ModSoularia.tabSoularia).setBlockTextureName(CheminSoularia.MOD_ID + ":blockruby").setHardness(15.0F).setResistance(50.0F);
		blockcobalt = new BlockClassic(Material.rock).setBlockName("blockcobalt").setCreativeTab(ModSoularia.tabSoularia).setBlockTextureName(CheminSoularia.MOD_ID + ":blockcobalt").setHardness(15.0F).setResistance(50.0F);
		blockjade = new BlockClassic(Material.rock).setBlockName("blockjade").setCreativeTab(ModSoularia.tabSoularia).setBlockTextureName(CheminSoularia.MOD_ID + ":blockjade").setHardness(15.0F).setResistance(50.0F);
		blockenfer = new BlockClassic(Material.rock).setBlockName("blockenfer").setCreativeTab(ModSoularia.tabSoularia).setBlockTextureName(CheminSoularia.MOD_ID + ":blockenfer").setHardness(15.0F).setResistance(50.0F);
		blocksoularium = new BlockClassic(Material.rock).setBlockName("blocksoularium").setCreativeTab(ModSoularia.tabSoularia).setBlockTextureName(CheminSoularia.MOD_ID + ":blocksoularium").setHardness(15.0F).setResistance(50.0F);
		blocksupreme = new BlockClassic(Material.rock).setBlockName("blocksupreme").setCreativeTab(ModSoularia.tabSoularia).setBlockTextureName(CheminSoularia.MOD_ID + ":blocksupreme").setHardness(15.0F).setResistance(50.0F);
		echelleruby = new BlockEchelle().setBlockName("echelleruby").setCreativeTab(ModSoularia.tabSoularia).setBlockTextureName(CheminSoularia.MOD_ID + ":blocksupreme");
		
	}
	
	public static void register()
	{
		GameRegistry.registerBlock(mineraisruby, mineraisruby.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(mineraiscobalt, mineraiscobalt.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(mineraisjade, mineraisjade.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(mineraisenfer, mineraisenfer.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(mineraissoularium, mineraissoularium.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockruby, blockruby.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockcobalt, blockcobalt.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockjade, blockjade.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockenfer, blockenfer.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blocksoularium, blocksoularium.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blocksupreme, blocksupreme.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(renforcedobsidian, renforcedobsidian.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(renforcedcobblestone, renforcedcobblestone.getUnlocalizedName().substring(5));
		GameRegistry.addRecipe(new ItemStack(BlockMod.blockruby, 1), new Object[]{"===", "===", "===", '=', ItemMod.item_ruby});
		GameRegistry.addRecipe(new ItemStack(BlockMod.blockcobalt, 1), new Object[]{"===", "===", "===", '=', ItemMod.item_cobalt});
		GameRegistry.addRecipe(new ItemStack(BlockMod.blockjade, 1), new Object[]{"===", "===", "===", '=', ItemMod.item_jade});
		GameRegistry.addRecipe(new ItemStack(BlockMod.blockenfer, 1), new Object[]{"===", "===", "===", '=', ItemMod.item_enfer});
		GameRegistry.addRecipe(new ItemStack(BlockMod.blocksoularium, 1), new Object[]{"===", "===", "===", '=', ItemMod.item_soularium});
		GameRegistry.addRecipe(new ItemStack(BlockMod.blocksupreme, 1), new Object[]{"===", "===", "===", '=', ItemMod.item_supreme});
		GameRegistry.addRecipe(new ItemStack(BlockMod.renforcedobsidian, 1), new Object[]{"   ", "===", "   ", '=', Blocks.obsidian});
		GameRegistry.addRecipe(new ItemStack(BlockMod.renforcedcobblestone, 1), new Object[]{"   ", "===", "   ", '=', Blocks.cobblestone});
		GameRegistry.addSmelting(BlockMod.mineraisruby, new ItemStack(ItemMod.item_ruby, 1), 1.0F);
		GameRegistry.addSmelting(BlockMod.mineraiscobalt, new ItemStack(ItemMod.item_cobalt, 1), 1.0F);
		GameRegistry.addSmelting(BlockMod.mineraisjade, new ItemStack(ItemMod.item_jade, 1), 1.0F);
		GameRegistry.addSmelting(BlockMod.mineraisenfer, new ItemStack(ItemMod.item_enfer, 1), 1.0F);
		GameRegistry.addSmelting(BlockMod.mineraissoularium, new ItemStack(ItemMod.item_fragmentsoularium, 1), 1.0F);
		}

}
