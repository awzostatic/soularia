package com.soulariamod.world;

import java.util.Random;

import com.soulariamod.init.BlockMod;

import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

public class WorldGenMinerais implements IWorldGenerator
{
	{
		
	}
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator,
			IChunkProvider chunkProvider) 
	{
		switch(world.provider.dimensionId)
		{
		case 0:
			GenerateOverWorld(world, chunkX = 16, chunkZ = 16, random);
		}
	}
	private void addOre(Block block, Block blockSpawn, Random random, World world, int posX, int posZ, int minY, int maxY, int minV, int maxV, int spawnChance)
	{
		for(int i = 0; i < spawnChance; i++)
		{
			int chunkSize = 16;
			int Xpos = posX + random.nextInt(chunkSize);
			int Ypos = minY + random.nextInt(maxY - minY);
			int Zpos = posZ + random.nextInt(chunkSize);
			
			new WorldGenMinable(block, maxV).generate(world, random, Xpos, Ypos, Zpos);
		}
	}
	private void GenerateOverWorld(World world, int i, int j, Random random) 
	{
		addOre(BlockMod.mineraisruby, Blocks.stone, random, world, i, j, 0, 11, 2, 5, 5);
		addOre(BlockMod.mineraiscobalt, Blocks.stone, random, world, i, j, 0, 11, 2, 5, 4);
		addOre(BlockMod.mineraisjade, Blocks.stone, random, world, i, j, 0, 11, 2, 5, 3);
		addOre(BlockMod.mineraisenfer, Blocks.stone, random, world, i, j, 0, 11, 2, 5, 2);
		addOre(BlockMod.mineraissoularium, Blocks.stone, random, world, i, j, 0, 11, 2, 5, 1);
		
	}
}
