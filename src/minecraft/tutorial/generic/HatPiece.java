package tutorial.generic;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class HatPiece extends Item
{
    public HatPiece(int id)
    {
        super(id);
        // Constructor Configuration
        maxStackSize = 64;
        setCreativeTab(CreativeTabs.tabMisc);
        setIconIndex(0);
        setItemName("HatPiece");
    }
    @Override
    public String getTextureFile()
    {
        return CommonProxy.hatpiece_PNG;
    }
}