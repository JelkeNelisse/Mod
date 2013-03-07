package tutorial.generic;


import java.util.Map;

import cpw.mods.fml.client.registry.RenderingRegistry; 
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class RenderTutorial extends RenderLiving
{
public ModelTutorial model;

public RenderTutorial (ModelTutorial par1ModelBase, float par2)
{
super(par1ModelBase, par2);
model = ((ModelTutorial)mainModel);
}

public void addRenderer(Map map) 
{ 
  map.put(EntityTutorial.class, new RenderTutorial(new ModelTutorial(), 0.5F)); 
}


public void renderTutorial(EntityTutorial par1EntityTutorial, double par2, double par4, double par6, float par8, float par9)
{
    super.doRenderLiving(par1EntityTutorial, par2, par4, par6, par8, par9);
}

public void doRenderLiving(EntityLiving par1EntityLiving, double par2, double par4, double par6, float par8, float par9)
{
    this.renderTutorial((EntityTutorial)par1EntityLiving, par2, par4, par6, par8, par9);
}

/**
 * Actually renders the given argument. This is a synthetic bridge method, always casting down its argument and then
 * handing it off to a worker function which does the actual work. In all probabilty, the class Render is generic
 * (Render<T extends Entity) and this method has signature public void doRender(T entity, double d, double d1,
 * double d2, float f, float f1). But JAD is pre 1.5 so doesn't do that.
 */
public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9)
{
    this.renderTutorial((EntityTutorial)par1Entity, par2, par4, par6, par8, par9);
}
}