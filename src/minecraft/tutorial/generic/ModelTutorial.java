package tutorial.generic;


import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelTutorial extends ModelBase
{
  //fields
    ModelRenderer LegRight;
    ModelRenderer LegLeft;
    ModelRenderer Body;
    ModelRenderer Head;
    ModelRenderer ArmLeft;
    ModelRenderer ArmRight;
    ModelRenderer Nose;
  
  public ModelTutorial()
  {
    textureWidth = 32;
    textureHeight = 32;
    
      LegRight = new ModelRenderer(this, 0, 9);
      LegRight.addBox(-1F, 0F, -1F, 3, 6, 3);
      LegRight.setRotationPoint(1F, 18F, 0F);
      LegRight.setTextureSize(32, 32);
      LegRight.mirror = true;
      setRotation(LegRight, 0F, 0F, 0F);
      LegLeft = new ModelRenderer(this, 0, 0);
      LegLeft.addBox(-2F, 0F, -1F, 3, 6, 3);
      LegLeft.setRotationPoint(-1F, 18F, 0F);
      LegLeft.setTextureSize(32, 32);
      LegLeft.mirror = true;
      setRotation(LegLeft, 0F, 0F, 0F);
      Body = new ModelRenderer(this, 12, 0);
      Body.addBox(-3F, -3F, -1F, 6, 6, 4);
      Body.setRotationPoint(0F, 15F, 0F);
      Body.setTextureSize(32, 32);
      Body.mirror = true;
      setRotation(Body, 0F, 0F, 0F);
      Head = new ModelRenderer(this, 6, 18);
      Head.addBox(-4F, -8F, -1F, 7, 8, 6);
      Head.setRotationPoint(0.5F, 12F, -1F);
      Head.setTextureSize(32, 32);
      Head.mirror = true;
      setRotation(Head, 0F, 0F, 0F);
      ArmLeft = new ModelRenderer(this, 22, 10);
      ArmLeft.addBox(-3F, 0F, 0F, 3, 5, 2);
      ArmLeft.setRotationPoint(-3F, 12F, 0F);
      ArmLeft.setTextureSize(32, 32);
      ArmLeft.mirror = true;
      setRotation(ArmLeft, 0F, 0F, 0F);
      ArmRight = new ModelRenderer(this, 12, 10);
      ArmRight.addBox(0F, 0F, 0F, 3, 5, 2);
      ArmRight.setRotationPoint(3F, 12F, 0F);
      ArmRight.setTextureSize(32, 32);
      ArmRight.mirror = true;
      setRotation(ArmRight, 0F, 0F, 0F);
      Nose = new ModelRenderer(this, 0, 18);
      Nose.addBox(0F, 0F, 0F, 2, 1, 1);
      Nose.setRotationPoint(-1F, 8F, -3F);
      Nose.setTextureSize(32, 32);
      Nose.mirror = true;
      setRotation(Nose, 0F, 0F, 0F);
  }
  
  
  public void render(Entity par1Entity, float par2, float par3, float par4, float par5, float par6, float par7)
  {
    super.render(par1Entity, par2, par3, par4, par5, par6, par7);
    setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
    LegRight.render(par7);
    LegLeft.render(par7);
    Body.render(par7);
    Head.render(par7);
    ArmLeft.render(par7);
    ArmRight.render(par7);
    Nose.render(par7);
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
    this.ArmRight.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 2.0F * par2 * 0.5F;
    this.ArmLeft.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 2.0F * par2 * 0.5F;
    this.ArmRight.rotateAngleZ = 0.0F;
    this.ArmLeft.rotateAngleZ = 0.0F;
    this.LegRight.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
    this.LegLeft.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
    this.LegRight.rotateAngleY = 0.0F;
    this.LegLeft.rotateAngleY = 0.0F;
  }
}