package tutorial.generic;


import static net.minecraftforge.client.IItemRenderer.ItemRenderType.EQUIPPED;
import static net.minecraftforge.client.IItemRenderer.ItemRendererHelper.BLOCK_3D;

import java.util.Map;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.client.registry.RenderingRegistry; 
import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.tileentity.TileEntitySkullRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.MinecraftForgeClient;

public class RenderBoomer extends RenderLiving
{
public ModelBoomer model;

public RenderBoomer (ModelBoomer par1ModelBase, float par2)
{
super(par1ModelBase, par2);
model = ((ModelBoomer)mainModel);
}

public void addRenderer(Map map) 
{ 
	
  map.put(EntityBoomer.class, new RenderBoomer(new ModelBoomer(), 0.5F)); 
}

public void renderBoomer(EntityBoomer par1EntityBoomer, double par2, double par4, double par6, float par8, float par9)
{
    super.doRenderLiving(par1EntityBoomer, par2, par4, par6, par8, par9);
}

public void doRenderLiving(EntityLiving par1EntityLiving, double par2, double par4, double par6, float par8, float par9)
{
    this.renderBoomer((EntityBoomer)par1EntityLiving, par2, par4, par6, par8, par9);
}

public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9)
{
    this.renderBoomer((EntityBoomer)par1Entity, par2, par4, par6, par8, par9);
}
}