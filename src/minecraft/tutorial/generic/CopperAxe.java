package tutorial.generic;



import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.item.ItemSpade;
import net.minecraftforge.oredict.OreDictionary;




public class CopperAxe extends ItemAxe{
	
	
	public boolean getIsRepairable(ItemStack par1ItemStack, ItemStack par2ItemStack) {
	      return OreDictionary.getOreID("ingotCopper") == OreDictionary.getOreID(par2ItemStack) ? true : super.getIsRepairable(par1ItemStack, par2ItemStack);
	   }


	
	
	
	public CopperAxe(int par1, EnumToolMaterial par2EnumToolMaterial)
    {
        super(par1, par2EnumToolMaterial);
    }
    @Override
    public String getTextureFile()
    {
        return CommonProxy.Axe_PNG;
    }
}