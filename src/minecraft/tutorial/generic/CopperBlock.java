package tutorial.generic;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class CopperBlock extends Block
{
    public CopperBlock(int id, int texture, Material material)
    {
        super(id, texture, material);
        setHardness(4.0F); // 33% harder than diamond
        setStepSound(Block.soundStoneFootstep);
        setBlockName("CopperBlock");
        setCreativeTab(CreativeTabs.tabBlock);
    }

    @Override
    public String getTextureFile()
    {
        return CommonProxy.copperblock_PNG;
    }
}
