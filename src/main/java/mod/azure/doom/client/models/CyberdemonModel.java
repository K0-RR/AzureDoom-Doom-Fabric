package mod.azure.doom.client.models;

import com.google.common.collect.ImmutableList;

import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

/**
 * Cyberdemon - Batpixxler Created using Tabula 8.0.0
 */
public class CyberdemonModel<T extends Entity> extends EntityModel<T> {
	public ModelPart thighs;
	public ModelPart rLeg1_flat;
	public ModelPart lLeg1_flat;
	public ModelPart torso;
	public ModelPart leftPec;
	public ModelPart neck;
	public ModelPart lShoulder;
	public ModelPart rShoulder;
	public ModelPart rightPec;
	public ModelPart head;
	public ModelPart rHorn1;
	public ModelPart topJaw;
	public ModelPart chin;
	public ModelPart lHorn1;
	public ModelPart rHorn2;
	public ModelPart rHorn3;
	public ModelPart rHorn4;
	public ModelPart rHorn5;
	public ModelPart snout;
	public ModelPart topTeethL;
	public ModelPart topTeethR;
	public ModelPart lowJaw;
	public ModelPart rFang;
	public ModelPart lFang;
	public ModelPart lowTeeth;
	public ModelPart lHorn2;
	public ModelPart lHorn3;
	public ModelPart lHorn4;
	public ModelPart lHorn5;
	public ModelPart lArm;
	public ModelPart lArm2;
	public ModelPart gunBase;
	public ModelPart gunBarrel;
	public ModelPart gunrim;
	public ModelPart armWires;
	public ModelPart rArm1;
	public ModelPart rArm2;
	public ModelPart rLeg1;
	public ModelPart rLegP1;
	public ModelPart rLeg2;
	public ModelPart rLegP2;
	public ModelPart rLeg3;
	public ModelPart rLeg3_2;
	public ModelPart rFoot;
	public ModelPart lLeg1;
	public ModelPart lLeg2;
	public ModelPart lLeg3;
	public ModelPart lFoot;

	public CyberdemonModel(float modelSize, boolean smallArmsIn) {
		this.textureWidth = 100;
		this.textureHeight = 200;
		this.lHorn2 = new ModelPart(this, 24, 173);
		this.lHorn2.setPivot(0.0F, 5.9F, 0.0F);
		this.lHorn2.addCuboid(-2.5F, 0.0F, -2.5F, 5.0F, 7.0F, 5.0F, 0.0F, 0.0F, 0.0F);
		this.setRotateAngle(lHorn2, -0.4098033003787853F, 0.0F, 0.0F);
		this.lLeg2 = new ModelPart(this, 28, 46);
		this.lLeg2.setPivot(0.0F, 13.5F, -3.0F);
		this.lLeg2.addCuboid(-3.0F, 0.0F, -0.5F, 6.0F, 13.0F, 5.0F, 0.5F, 0.0F, 0.5F);
		this.setRotateAngle(lLeg2, 1.092750655326294F, 0.0F, 0.0F);
		this.rHorn1 = new ModelPart(this, 0, 173);
		this.rHorn1.setPivot(-5.0F, -5.0F, 0.0F);
		this.rHorn1.addCuboid(-3.0F, 0.0F, -3.0F, 6.0F, 7.0F, 6.0F, 0.0F, 0.0F, 0.0F);
		this.setRotateAngle(rHorn1, -0.2275909337942703F, 0.0F, 1.3658947098950176F);
		this.lArm = new ModelPart(this, 28, 94);
		this.lArm.setPivot(2.5F, 6.0F, 0.0F);
		this.lArm.addCuboid(-3.0F, 0.0F, -3.0F, 6.0F, 10.0F, 6.0F, 0.5F, 0.0F, 0.5F);
		this.rFang = new ModelPart(this, 0, 25);
		this.rFang.setPivot(1.5F, 0.3F, -2.3F);
		this.rFang.addCuboid(0.0F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
		this.setRotateAngle(rFang, -0.956091342937205F, 0.0F, 0.0F);
		this.lLeg1_flat = new ModelPart(this, 0, 46);
		this.lLeg1_flat.setPivot(4.5F, -7.7F, 1.4F);
		this.lLeg1_flat.addCuboid(-3.5F, 0.0F, -3.5F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
		this.rLeg2 = new ModelPart(this, 42, 64);
		this.rLeg2.setPivot(0.0F, 13.5F, -3.0F);
		this.rLeg2.addCuboid(-2.5F, 0.0F, -0.5F, 5.0F, 11.0F, 5.0F, 0.5F, 0.0F, 0.5F);
		this.setRotateAngle(rLeg2, 1.092750655326294F, 0.0F, 0.0F);
		this.topJaw = new ModelPart(this, 52, 137);
		this.topJaw.setPivot(0.0F, 0.0F, -7.9F);
		this.topJaw.addCuboid(-5.0F, -5.0F, -3.0F, 10.0F, 5.0F, 3.0F, 0.0F, 0.0F, 0.0F);
		this.lFang = new ModelPart(this, 0, 25);
		this.lFang.setPivot(-2.5F, 0.3F, -2.3F);
		this.lFang.addCuboid(0.0F, 0.0F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
		this.setRotateAngle(lFang, -0.956091342937205F, 0.0F, 0.0F);
		this.rArm2 = new ModelPart(this, 0, 114);
		this.rArm2.setPivot(0.0F, 9.0F, 3.0F);
		this.rArm2.addCuboid(-3.0F, 0.0F, -6.0F, 6.0F, 15.0F, 6.0F, 0.5F, 0.0F, 0.5F);
		this.setRotateAngle(rArm2, -0.27314400463445304F, 0.0F, -0.13665927909957545F);
		this.rHorn5 = new ModelPart(this, 72, 173);
		this.rHorn5.setPivot(0.0F, 6.0F, 0.0F);
		this.rHorn5.addCuboid(-1.0F, 0.0F, -1.0F, 2.0F, 7.0F, 2.0F, 0.0F, 0.0F, 0.0F);
		this.setRotateAngle(rHorn5, -0.591841146688116F, 0.0F, 0.0911061832922575F);
		this.torso = new ModelPart(this, 0, 0);
		this.torso.setPivot(0.0F, -1.0F, 2.3F);
		this.torso.addCuboid(-9.5F, -13.0F, -12.0F, 19.0F, 12.0F, 12.0F, 0.0F, 0.0F, 0.0F);
		this.setRotateAngle(torso, 0.04555309164612875F, 0.0F, 0.0F);
		this.lHorn5 = new ModelPart(this, 72, 173);
		this.lHorn5.setPivot(0.0F, 6.0F, 0.0F);
		this.lHorn5.addCuboid(-1.0F, 0.0F, -1.0F, 2.0F, 7.0F, 2.0F, 0.0F, 0.0F, 0.0F);
		this.setRotateAngle(lHorn5, -0.591841146688116F, 0.0F, -0.0911061832922575F);
		this.lArm2 = new ModelPart(this, 52, 94);
		this.lArm2.setPivot(0.0F, 9.0F, 3.0F);
		this.lArm2.addCuboid(-3.0F, 0.0F, -6.0F, 6.0F, 6.0F, 6.0F, 0.5F, 0.0F, 0.5F);
		this.setRotateAngle(lArm2, -0.27314400463445304F, 0.0F, 0.13665927909957545F);
		this.gunrim = new ModelPart(this, 26, 128);
		this.gunrim.mirror = true;
		this.gunrim.setPivot(0.5F, 11.5F, 0.0F);
		this.gunrim.addCuboid(-1.5F, 0.0F, -1.5F, 3.0F, 1.0F, 3.0F, 0.5F, 0.0F, 0.5F);
		this.lLeg3 = new ModelPart(this, 50, 47);
		this.lLeg3.setPivot(0.0F, 13.0F, 4.5F);
		this.lLeg3.addCuboid(-2.5F, 0.0F, -4.0F, 5.0F, 11.0F, 4.0F, 0.5F, 0.0F, 0.5F);
		this.setRotateAngle(lLeg3, -0.9105382388075086F, 0.0F, 0.0F);
		this.rightPec = new ModelPart(this, 52, 124);
		this.rightPec.mirror = true;
		this.rightPec.setPivot(-5.1F, -7.7F, -10.0F);
		this.rightPec.addCuboid(-5.0F, -5.0F, -3.0F, 10.0F, 10.0F, 3.0F, 0.0F, 0.0F, 0.0F);
		this.setRotateAngle(rightPec, 0.0F, 0.0F, -0.08726646259971647F);
		this.snout = new ModelPart(this, 52, 145);
		this.snout.setPivot(0.0F, -5.0F, -3.0F);
		this.snout.addCuboid(-4.5F, 0.0F, 0.0F, 9.0F, 2.0F, 4.0F, 0.0F, 0.0F, 0.0F);
		this.setRotateAngle(snout, 0.5462880092689061F, 0.0F, 0.0F);
		this.rLeg1_flat = new ModelPart(this, 0, 67);
		this.rLeg1_flat.setPivot(-4.5F, -5.1F, 0.0F);
		this.rLeg1_flat.addCuboid(-3.5F, 0.0F, -3.5F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
		this.lHorn3 = new ModelPart(this, 44, 173);
		this.lHorn3.setPivot(0.0F, 5.7F, 0.0F);
		this.lHorn3.addCuboid(-2.0F, 0.0F, -2.0F, 4.0F, 7.0F, 4.0F, 0.0F, 0.0F, 0.0F);
		this.setRotateAngle(lHorn3, -0.45535640450848164F, 0.0F, -0.13665927909957545F);
		this.rFoot = new ModelPart(this, 36, 84);
		this.rFoot.setPivot(0.0F, 9.0F, -2.0F);
		this.rFoot.addCuboid(-3.0F, 0.0F, -3.0F, 6.0F, 4.0F, 5.0F, 0.5F, 0.0F, 0.5F);
		this.setRotateAngle(rFoot, 0.2275909337942703F, 0.0F, 0.0F);
		this.rLeg3_2 = new ModelPart(this, 20, 88);
		this.rLeg3_2.setPivot(0.0F, 7.0F, -2.0F);
		this.rLeg3_2.addCuboid(-2.5F, 0.0F, -1.5F, 5.0F, 3.0F, 3.0F, 0.5F, 0.0F, 0.5F);
		this.topTeethR = new ModelPart(this, 0, 169);
		this.topTeethR.setPivot(-0.2F, -0.1F, -2.4F);
		this.topTeethR.addCuboid(-4.0F, 0.0F, 0.0F, 4.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
		this.rArm1 = new ModelPart(this, 28, 94);
		this.rArm1.mirror = true;
		this.rArm1.setPivot(-2.5F, 6.0F, 0.0F);
		this.rArm1.addCuboid(-3.0F, 0.0F, -3.0F, 6.0F, 10.0F, 6.0F, 0.5F, 0.0F, 0.5F);
		this.rHorn4 = new ModelPart(this, 60, 173);
		this.rHorn4.setPivot(0.0F, 5.7F, 0.0F);
		this.rHorn4.addCuboid(-1.5F, 0.0F, -1.5F, 3.0F, 7.0F, 3.0F, 0.0F, 0.0F, 0.0F);
		this.setRotateAngle(rHorn4, -0.6373942508178124F, 0.0F, 0.0911061832922575F);
		this.lShoulder = new ModelPart(this, 0, 99);
		this.lShoulder.setPivot(8.7F, -12.0F, -6.0F);
		this.lShoulder.addCuboid(-1.0F, -2.0F, -4.0F, 7.0F, 8.0F, 7.0F, 0.5F, 0.0F, 0.5F);
		this.setRotateAngle(lShoulder, -0.0F, 0.0F, -0.13665927909957545F);
		this.topTeethL = new ModelPart(this, 0, 169);
		this.topTeethL.mirror = true;
		this.topTeethL.setPivot(0.2F, -0.1F, -2.4F);
		this.topTeethL.addCuboid(0.0F, 0.0F, 0.0F, 4.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
		this.armWires = new ModelPart(this, 0, 135);
		this.armWires.setPivot(-6.0F, 0.0F, 2.0F);
		this.armWires.addCuboid(-5.0F, 0.0F, -4.0F, 5.0F, 14.0F, 4.0F, 0.5F, 0.0F, 0.5F);
		this.setRotateAngle(armWires, 0.0F, 0.0F, -0.0911061832922575F);
		this.lowTeeth = new ModelPart(this, 13, 169);
		this.lowTeeth.setPivot(0.0F, -0.7F, -2.8F);
		this.lowTeeth.addCuboid(-4.0F, 0.0F, 0.0F, 8.0F, 1.0F, 3.0F, 0.0F, 0.0F, 0.0F);
		this.neck = new ModelPart(this, 18, 132);
		this.neck.setPivot(0.0F, -11.9F, -4.0F);
		this.neck.addCuboid(-4.5F, -8.0F, -4.0F, 9.0F, 8.0F, 8.0F, 0.0F, 0.0F, 0.0F);
		this.setRotateAngle(neck, 0.27314400463445304F, 0.0F, 0.0F);
		this.head = new ModelPart(this, 7, 148);
		this.head.setPivot(0.0F, -6.0F, 1.3F);
		this.head.addCuboid(-7.5F, -10.0F, -8.0F, 15.0F, 10.0F, 11.0F, 0.0F, 0.0F, 0.0F);
		this.setRotateAngle(head, -0.27314400463445304F, 0.006283185556850939F, 0.0F);
		this.lHorn4 = new ModelPart(this, 60, 173);
		this.lHorn4.setPivot(0.0F, 5.7F, 0.0F);
		this.lHorn4.addCuboid(-1.5F, 0.0F, -1.5F, 3.0F, 7.0F, 3.0F, 0.0F, 0.0F, 0.0F);
		this.setRotateAngle(lHorn4, -0.6373942508178124F, 0.0F, -0.0911061832922575F);
		this.rHorn2 = new ModelPart(this, 24, 173);
		this.rHorn2.setPivot(0.0F, 5.9F, 0.0F);
		this.rHorn2.addCuboid(-2.5F, 0.0F, -2.5F, 5.0F, 7.0F, 5.0F, 0.0F, 0.0F, 0.0F);
		this.setRotateAngle(rHorn2, -0.4098033003787853F, 0.0F, 0.0F);
		this.gunBarrel = new ModelPart(this, 54, 106);
		this.gunBarrel.setPivot(-0.5F, 9.0F, 0.0F);
		this.gunBarrel.addCuboid(-2.0F, 0.0F, -2.5F, 5.0F, 12.0F, 5.0F, 0.5F, 0.0F, 0.5F);
		this.rShoulder = new ModelPart(this, 0, 99);
		this.rShoulder.mirror = true;
		this.rShoulder.setPivot(-8.7F, -12.0F, -6.0F);
		this.rShoulder.addCuboid(-6.0F, -2.0F, -4.0F, 7.0F, 8.0F, 7.0F, 0.5F, 0.0F, 0.5F);
		this.setRotateAngle(rShoulder, 0.0F, 0.0F, 0.13665927909957545F);
		this.leftPec = new ModelPart(this, 52, 124);
		this.leftPec.setPivot(5.1F, -7.7F, -10.0F);
		this.leftPec.addCuboid(-5.0F, -5.0F, -3.0F, 10.0F, 10.0F, 3.0F, 0.0F, 0.0F, 0.0F);
		this.setRotateAngle(leftPec, 0.0F, 0.0F, 0.08726646259971647F);
		this.rHorn3 = new ModelPart(this, 44, 173);
		this.rHorn3.setPivot(0.0F, 5.7F, 0.0F);
		this.rHorn3.addCuboid(-2.0F, 0.0F, -2.0F, 4.0F, 7.0F, 4.0F, 0.0F, 0.0F, 0.0F);
		this.setRotateAngle(rHorn3, -0.45535640450848164F, 0.0F, 0.13665927909957545F);
		this.gunBase = new ModelPart(this, 24, 110);
		this.gunBase.setPivot(0.0F, 5.0F, -3.0F);
		this.gunBase.addCuboid(-3.5F, 0.0F, -4.0F, 7.0F, 9.0F, 8.0F, 0.5F, 0.0F, 0.5F);
		this.rLeg1 = new ModelPart(this, 0, 67);
		this.rLeg1.setPivot(0.0F, 0.0F, 0.0F);
		this.rLeg1.addCuboid(-3.5F, 0.0F, -3.5F, 7.0F, 14.0F, 7.0F, 0.5F, 0.0F, 0.5F);
		this.setRotateAngle(rLeg1, -0.43022365395869955F, 0.0F, 0.0F);
		this.rLegP2 = new ModelPart(this, 28, 64);
		this.rLegP2.setPivot(3.0F, 0.5F, 0.0F);
		this.rLegP2.addCuboid(0.0F, 0.0F, -3.0F, 1.0F, 14.0F, 6.0F, 0.5F, 0.0F, 0.5F);
		this.lHorn1 = new ModelPart(this, 0, 173);
		this.lHorn1.setPivot(5.0F, -5.0F, 0.0F);
		this.lHorn1.addCuboid(-3.0F, 0.0F, -3.0F, 6.0F, 7.0F, 6.0F, 0.0F, 0.0F, 0.0F);
		this.setRotateAngle(lHorn1, -0.2275909337942703F, 0.0F, -1.3658947098950176F);
		this.chin = new ModelPart(this, 52, 162);
		this.chin.setPivot(0.0F, -0.1F, -8.0F);
		this.chin.addCuboid(-5.0F, 0.0F, -0.2F, 10.0F, 3.0F, 7.0F, 0.0F, 0.0F, 0.0F);
		this.setRotateAngle(chin, 0.13665927909957545F, 0.0F, 0.0F);
		this.lLeg1 = new ModelPart(this, 0, 46);
		this.lLeg1.setPivot(0.0F, 0.0F, 0.0F);
		this.lLeg1.addCuboid(-3.5F, 0.0F, -3.5F, 7.0F, 14.0F, 7.0F, 0.5F, 0.0F, 0.5F);
		this.setRotateAngle(lLeg1, -0.43022365395869955F, 0.0F, 0.0F);
		this.rLeg3 = new ModelPart(this, 0, 88);
		this.rLeg3.setPivot(0.0F, 11.0F, 4.5F);
		this.rLeg3.addCuboid(-3.0F, 0.0F, -4.0F, 6.0F, 7.0F, 4.0F, 0.5F, 0.0F, 0.5F);
		this.setRotateAngle(rLeg3, -0.9105382388075086F, 0.0F, 0.0F);
		this.lFoot = new ModelPart(this, 48, 36);
		this.lFoot.setPivot(0.0F, 10.0F, -2.0F);
		this.lFoot.addCuboid(-3.0F, 0.0F, -3.0F, 6.0F, 4.0F, 5.0F, 0.5F, 0.0F, 0.5F);
		this.setRotateAngle(lFoot, 0.2275909337942703F, 0.0F, 0.0F);
		this.thighs = new ModelPart(this, 0, 24);
		this.thighs.setPivot(0.0F, -14.0F, 3.5F);
		this.thighs.addCuboid(-7.0F, -2.0F, -8.0F, 14.0F, 12.0F, 10.0F, 0.25F, 0.25F, 0.25F);
		this.lowJaw = new ModelPart(this, 52, 151);
		this.lowJaw.setPivot(0.0F, 0.0F, 0.4F);
		this.lowJaw.addCuboid(-4.5F, 0.0F, -3.0F, 9.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
		this.setRotateAngle(lowJaw, -0.2275909337942703F, 0.0F, 0.0F);
		this.rLegP1 = new ModelPart(this, 28, 64);
		this.rLegP1.setPivot(-4.0F, 0.5F, 0.0F);
		this.rLegP1.addCuboid(0.0F, 0.0F, -3.0F, 1.0F, 14.0F, 6.0F, 0.5F, 0.0F, 0.5F);
		this.lHorn1.addChild(this.lHorn2);
		this.lLeg1.addChild(this.lLeg2);
		this.head.addChild(this.rHorn1);
		this.lShoulder.addChild(this.lArm);
		this.lowJaw.addChild(this.rFang);
		this.rLeg1.addChild(this.rLeg2);
		this.head.addChild(this.topJaw);
		this.lowJaw.addChild(this.lFang);
		this.rArm1.addChild(this.rArm2);
		this.rHorn4.addChild(this.rHorn5);
		this.thighs.addChild(this.torso);
		this.lHorn4.addChild(this.lHorn5);
		this.lArm.addChild(this.lArm2);
		this.gunBarrel.addChild(this.gunrim);
		this.lLeg2.addChild(this.lLeg3);
		this.torso.addChild(this.rightPec);
		this.topJaw.addChild(this.snout);
		this.lHorn2.addChild(this.lHorn3);
		this.rLeg3.addChild(this.rFoot);
		this.rLeg3.addChild(this.rLeg3_2);
		this.topJaw.addChild(this.topTeethR);
		this.rShoulder.addChild(this.rArm1);
		this.rHorn3.addChild(this.rHorn4);
		this.torso.addChild(this.lShoulder);
		this.topJaw.addChild(this.topTeethL);
		this.rShoulder.addChild(this.armWires);
		this.lowJaw.addChild(this.lowTeeth);
		this.torso.addChild(this.neck);
		this.neck.addChild(this.head);
		this.lHorn3.addChild(this.lHorn4);
		this.rHorn1.addChild(this.rHorn2);
		this.gunBase.addChild(this.gunBarrel);
		this.torso.addChild(this.rShoulder);
		this.torso.addChild(this.leftPec);
		this.rHorn2.addChild(this.rHorn3);
		this.lArm2.addChild(this.gunBase);
		this.rLeg1_flat.addChild(this.rLeg1);
		this.rLeg1.addChild(this.rLegP2);
		this.head.addChild(this.lHorn1);
		this.head.addChild(this.chin);
		this.lLeg1_flat.addChild(this.lLeg1);
		this.rLeg2.addChild(this.rLeg3);
		this.lLeg3.addChild(this.lFoot);
		this.chin.addChild(this.lowJaw);
		this.rLeg1.addChild(this.rLegP1);
	}

	@Override
	public void render(MatrixStack matrixStackIn, VertexConsumer bufferIn, int packedLightIn, int packedOverlayIn,
			float red, float green, float blue, float alpha) {
		ImmutableList.of(this.thighs, this.rLeg1_flat, this.lLeg1_flat).forEach((ModelPart) -> {
			ModelPart.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
		});
	}

	public void setRotateAngle(ModelPart ModelPart, float x, float y, float z) {
		ModelPart.pitch = x;
		ModelPart.yaw = y;
		ModelPart.roll = z;
	}

	@Override
	public void setAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.rShoulder.pitch = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount / 1.0F;
		this.lShoulder.pitch = MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * 1.4F * limbSwingAmount / 1.0F;
		this.rLeg1_flat.pitch = MathHelper.cos(limbSwing * 0.6662F) * 1.0F * limbSwingAmount / 1.0F;
		this.lLeg1_flat.pitch = MathHelper.cos(limbSwing * -0.6662F + (float) Math.PI) * 1.0F * limbSwingAmount / 1.0F;
	}
}