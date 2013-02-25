package tutorial.generic;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class GenericItem extends Item
{
    public GenericItem(int id)
    {
        super(id);
        // Constructor Configuration
        maxStackSize = 64;
        setCreativeTab(CreativeTabs.tabMisc);
        setIconIndex(0);
        setItemName("genericItem");
    }
    @Override
    public String getTextureFile()
    {
        return CommonProxy.BLOCK_PNG;
    }
}