package com.soulariamod.item;

import java.util.Set;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;

public class ItemMultiToolP extends ItemPickaxe {

	public ItemMultiToolP(ToolMaterial p_i45347_1_) {
		super(p_i45347_1_);
	}
	
	private static Set<Block> effectiveAgainst = Sets.newHashSet(new Block[]
	{
		Blocks.stone, Blocks.grass, Blocks.sand, Blocks.gravel, Blocks.clay, Blocks.dirt, Blocks.sandstone, Blocks.obsidian			
    });
	
	@Override
	public Set<String> getToolClasses(ItemStack stack)
	{
		return ImmutableSet.of("pickaxe", "spade", "axe", "hoe");
	}

	@Override
	public boolean canHarvestBlock(Block block, ItemStack stack)
	{
		
		return effectiveAgainst.contains(block) ? true : super.canHarvestBlock (block, stack);
	}
	
	@Override
	public float func_150893_a(ItemStack stack, Block block)
	{
		return effectiveAgainst.contains(block) ? this.efficiencyOnProperMaterial : super.func_150893_a(stack, block);
	}
}
