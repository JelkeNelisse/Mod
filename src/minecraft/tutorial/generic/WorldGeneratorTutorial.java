package tutorial.generic;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class WorldGeneratorTutorial implements IWorldGenerator
{
    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world,
            IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
    {
        switch (world.provider.dimensionId)
        {
            case -1:
                generateNether(world, random, chunkX * 16, chunkZ * 16);

            case 0 :
                generateSurface(world, random, chunkX * 16, chunkZ * 16);
        }
    }

    private void generateSurface(World world, Random random, int BlockX, int j)
    {
        for (int i = 0; i < 30; i++)
        {
            int Xcoord = BlockX + random.nextInt(16);
            int Zcoord = j + random.nextInt(16);
            int Ycoord = 20 + random.nextInt(30);
            (new WorldGenMinable(Generic.genericOre.blockID, 10)).generate(world, random, Xcoord, Ycoord, Zcoord);
            (new WorldGenMinable(Generic.CreepOre.blockID, 5)).generate(world, random, Xcoord, Ycoord, Zcoord);
        }
    }

    private void generateNether(World world, Random random, int i, int j)
    {
    }
}
