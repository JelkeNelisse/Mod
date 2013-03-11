package tutorial.generic;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.IArmorTextureProvider;
import net.minecraftforge.oredict.OreDictionary;

public class MinersHat extends ItemArmor implements IArmorTextureProvider
{
    public MinersHat(int par1, EnumArmorMaterial par2EnumArmorMaterial,
            int par3, int par4)
    {
        super(par1, par2EnumArmorMaterial, par3, par4);
    }

    @Override
    public String getArmorTextureFile(ItemStack itemstack)
    {
        if (itemstack.itemID == Generic.MinersHat.itemID)
        		{
            return "/tutorial/generic/png/minershat.png";
        }

        if (itemstack.itemID == Generic.CopperLegs.itemID)
        {
            return"/tutorial/generic/png/copperarmour2.png";
        }
        else
        {
            return "/tutorial/generic/png/copperarmour2.png";
        }
    }
    
    



    public String getTextureFile()
    {
        return "/tutorial/generic/png/armour.png";
    }
}