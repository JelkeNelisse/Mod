package tutorial.generic.client;

import java.io.File;

import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraft.client.Minecraft;
import net.minecraft.src.ModLoader;
import net.minecraftforge.client.MinecraftForgeClient;
import tutorial.generic.CommonProxy;
import tutorial.generic.EntityTutorial;
import tutorial.generic.ModelTutorial;
import tutorial.generic.RenderTutorial;

public class ClientProxy extends CommonProxy
{
    @Override
    public void registerRenderers()
    {

    	Minecraft mc = ModLoader.getMinecraftInstance();
    	
    	mc.installResource("sound3/mob/goblin/hurt.ogg", new File (mc.mcDataDir, "resources/tutorial/goblin/hurt.ogg"));
     	mc.installResource("sound3/mob/goblin/say.ogg", new File (mc.mcDataDir, "resources/tutorial/goblin/say.ogg"));
     	mc.installResource("sound3/mob/goblin/death.ogg", new File (mc.mcDataDir, "resources/tutorial/goblin/death.ogg"));
     	mc.installResource("sound3/mob/goblin/step.ogg", new File (mc.mcDataDir, "resources/tutorial/goblin/step.ogg"));
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
        MinecraftForgeClient.preloadTexture(rottenapple_PNG);
             }
<<<<<<< HEAD
   
    
    public static void registerRenderInformation() 
=======
    @Override
    public  void registerRenderInformation() 
>>>>>>> Goblin Finally Fixed
    { 
    MinecraftForgeClient.preloadTexture("/tutorial/generic/png/goblin.png"); 
    RenderingRegistry.instance().registerEntityRenderingHandler(EntityTutorial.class, new RenderTutorial(new ModelTutorial(), 0.3F)); //Register the rendering for your entities. 
    } 
   

    
    public int addArmor(String Armor)
    {
        return RenderingRegistry.addNewArmourRendererPrefix(Armor);
    }
    
    

}
