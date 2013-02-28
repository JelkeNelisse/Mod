package tutorial.generic.client;

import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraftforge.client.MinecraftForgeClient;
import tutorial.generic.CommonProxy;

public class ClientProxy extends CommonProxy
{
    @Override
    public void registerRenderers()
    {
        MinecraftForgeClient.preloadTexture(ITEMS_PNG);
        MinecraftForgeClient.preloadTexture(BLOCK_PNG);
        MinecraftForgeClient.preloadTexture(GenericItem_PNG);
        MinecraftForgeClient.preloadTexture(GenericOres_PNG);
        MinecraftForgeClient.preloadTexture(Pickaxe_PNG);
        MinecraftForgeClient.preloadTexture(Axe_PNG);
        MinecraftForgeClient.preloadTexture(Sword_PNG);
        MinecraftForgeClient.preloadTexture(Hoe_PNG);
        MinecraftForgeClient.preloadTexture(Shovel_PNG);
        MinecraftForgeClient.preloadTexture(paxel_PNG);
        MinecraftForgeClient.preloadTexture(Gshovel_PNG);
        MinecraftForgeClient.preloadTexture(Creep_PNG);
        MinecraftForgeClient.preloadTexture(copperblock_PNG);
        MinecraftForgeClient.preloadTexture(battleaxe_PNG);
    }
    public int addArmor(String Armor)
    {
        return RenderingRegistry.addNewArmourRendererPrefix(Armor);
    }
}
