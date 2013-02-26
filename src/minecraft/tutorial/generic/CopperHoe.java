package tutorial.generic;

import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class CopperHoe extends ItemHoe
{
	
	
	public boolean getIsRepairable(ItemStack par1ItemStack, ItemStack par2ItemStack) {
	      return OreDictionary.getOreID("ingotCopper") == OreDictionary.getOreID(par2ItemStack) ? true : super.getIsRepairable(par1ItemStack, par2ItemStack);
	   }

	
    public CopperHoe(int par1, EnumToolMaterial par2EnumToolMaterial)
    {
        super(par1, par2EnumToolMaterial);
    }
    @Override
    public String getTextureFile()
    {
        return CommonProxy.Hoe_PNG;
    }
}