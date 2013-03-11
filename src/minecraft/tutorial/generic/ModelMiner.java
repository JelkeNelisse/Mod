package tutorial.generic;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelMiner extends ModelBase
{
  //fields
    ModelRenderer LegRight;
    ModelRenderer toplegleft;
    ModelRenderer body;
    ModelRenderer armright;
    ModelRenderer armleft;
    ModelRenderer head;
    ModelRenderer neck;
    ModelRenderer midlegleft;
    ModelRenderer bottomlegleft;
    ModelRenderer bottomhat;
    ModelRenderer tophat;
  
  public ModelMiner()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      LegRight = new ModelRenderer(this, 52, 0);
      LegRight.addBox(-1F, 0F, -1F, 3, 12, 3);
      LegRight.setRotationPoint(4F, 12F, 1F);
      LegRight.setTextureSize(64, 32);
      LegRight.mirror = true;
      setRotation(LegRight, 0F, 0F, 0F);
      toplegleft = new ModelRenderer(this, 40, 0);
      toplegleft.addBox(0F, 0F, 0F, 3, 6, 3);
      toplegleft.setRotationPoint(-4F, 12F, 0F);
      toplegleft.setTextureSize(64, 32);
      toplegleft.mirror = true;
      setRotation(toplegleft, 0.2602503F, 0F, 0F);
      body = new ModelRenderer(this, 13, 20);
      body.addBox(-5F, -5F, 0F, 10, 9, 3);
      body.setRotationPoint(1F, 9F, 0F);
      body.setTextureSize(64, 32);
      body.mirror = true;
      setRotation(body, 0.2602503F, 0F, 0F);
      armright = new ModelRenderer(this, 40, 22);
      armright.addBox(0F, 0F, 0F, 3, 7, 3);
      armright.setRotationPoint(6F, 4F, -2F);
      armright.setTextureSize(64, 32);
      armright.mirror = true;
      setRotation(armright, 0F, 0F, 0F);
      armleft = new ModelRenderer(this, 52, 22);
      armleft.addBox(-3F, 0F, 0F, 3, 7, 3);
      armleft.setRotationPoint(-4F, 4F, -2F);
      armleft.setTextureSize(64, 32);
      armleft.mirror = true;
      setRotation(armleft, 0F, 0F, 0F);
      head = new ModelRenderer(this, 18, 8);
      head.addBox(-3F, -6F, 0F, 6, 6, 5);
      head.setRotationPoint(1F, 3F, -3F);
      head.setTextureSize(64, 32);
      head.mirror = true;
      setRotation(head, -0.1487144F, 0F, 0.1661127F);
      neck = new ModelRenderer(this, 40, 10);
      neck.addBox(0F, 0F, 0F, 2, 1, 1);
      neck.setRotationPoint(0F, 3F, -2F);
      neck.setTextureSize(64, 32);
      neck.mirror = true;
      setRotation(neck, 0F, 0F, 0F);
      midlegleft = new ModelRenderer(this, 48, 9);
      midlegleft.addBox(0F, 0F, 0F, 1, 4, 1);
      midlegleft.setRotationPoint(-3F, 17F, 3F);
      midlegleft.setTextureSize(64, 32);
      midlegleft.mirror = true;
      setRotation(midlegleft, 0.2974289F, 0F, 0F);
      bottomlegleft = new ModelRenderer(this, 40, 14);
      bottomlegleft.addBox(0F, 0F, 0F, 3, 3, 3);
      bottomlegleft.setRotationPoint(-4F, 21F, 3F);
      bottomlegleft.setTextureSize(64, 32);
      bottomlegleft.mirror = true;
      setRotation(bottomlegleft, 0.3717861F, 0F, 0F);
      bottomhat = new ModelRenderer(this, 16, 0);
      bottomhat.addBox(0F, 0F, 0F, 7, 1, 5);
      bottomhat.setRotationPoint(-1.5F, -4F, -2F);
      bottomhat.setTextureSize(64, 32);
      bottomhat.mirror = true;
      setRotation(bottomhat, -0.1487195F, 0F, 0.1661204F);
      tophat = new ModelRenderer(this, 0, 9);
      tophat.addBox(0F, 0F, 0F, 5, 3, 4);
      tophat.setRotationPoint(0F, -6F, -1F);
      tophat.setTextureSize(64, 32);
      tophat.mirror = true;
      setRotation(tophat, -0.1487195F, 0F, 0.1661204F);
  }
  
  public void render(Entity par1Entity, float par2, float par3, float par4, float par5, float par6, float par7)
  {
    super.render(par1Entity, par2, par3, par4, par5, par6, par7);
    setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
    LegRight.render(par7);
    toplegleft.render(par7);
    body.render(par7);
    armright.render(par7);
    armleft.render(par7);
    head.render(par7);
    neck.render(par7);
    midlegleft.render(par7);
    bottomlegleft.render(par7);
    bottomhat.render(par7);
    tophat.render(par7);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity)
  {
	    super.setRotationAngles(par1, par2, par3, par4, par5, par6, par7Entity);
	    float var8 = MathHelper.sin(this.onGround * (float)Math.PI);
	    float var9 = MathHelper.sin((1.0F - (1.0F - this.onGround) * (1.0F - this.onGround)) * (float)Math.PI);
	    this.LegRight.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
	    this.LegRight.rotateAngleY = 0.0F;
	    
  }

}
