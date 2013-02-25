package tutorial.generic;

import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;

public class GlassShovel extends ItemSpade
{
    public GlassShovel(int par1, EnumToolMaterial par2EnumToolMaterial)
    {
        super(par1, par2EnumToolMaterial);
    }
    
    
    @Override
    public String getTextureFile()
    {
        return CommonProxy.Gshovel_PNG;
    }
}