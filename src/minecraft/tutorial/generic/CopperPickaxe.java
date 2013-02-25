package tutorial.generic;

import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;

public class CopperPickaxe extends ItemPickaxe
{
    public CopperPickaxe(int par1, EnumToolMaterial par2EnumToolMaterial)
    {
        super(par1, par2EnumToolMaterial);
    }
    
	public boolean getIsRepairable(ItemStack par1ItemStack, ItemStack par2ItemStack) {
	      return Generic.genericItem.itemID == par2ItemStack.itemID ? true : super.getIsRepairable(par1ItemStack, par2ItemStack);
	   }

	

    @Override
    public String getTextureFile()
    {
        return CommonProxy.Pickaxe_PNG;
    }
}
