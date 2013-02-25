package tutorial.generic;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockOre;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.block.material.Material;

public class CreepOre extends BlockOre
{
    public CreepOre(int id, int texture, Material material)
    {
        super(id, texture);
        setHardness(4.0F); // 33% harder than diamond
        setStepSound(Block.soundStoneFootstep);
        setBlockName("CreepOre");
        setCreativeTab(CreativeTabs.tabBlock);
    }

    @Override
    public String getTextureFile()
    {
        return CommonProxy.Creep_PNG;
    }
    public int idDropped(int par1, Random random, int zero) {
        return Item.gunpowder.itemID;
}

}
