package mod.azure.doom.client.render.projectiles;

import mod.azure.doom.client.GeoProjectilesRenderer;
import mod.azure.doom.client.models.projectiles.EnergyModel;
import mod.azure.doom.entity.projectiles.EnergyCellEntity;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;

public class EnergyCellRender extends GeoProjectilesRenderer<EnergyCellEntity> {

	public EnergyCellRender(EntityRenderDispatcher renderManagerIn) {
		super(renderManagerIn, new EnergyModel());
	}

	protected int getBlockLightLevel(EnergyCellEntity entityIn, BlockPos partialTicks) {
		return 15;
	}

	@Override
	public RenderLayer getRenderType(EnergyCellEntity animatable, float partialTicks, MatrixStack stack,
			VertexConsumerProvider renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
			Identifier textureLocation) {
		return RenderLayer.getEntityTranslucent(getTextureLocation(animatable));
	}

	@Override
	public void renderEarly(EnergyCellEntity animatable, MatrixStack stackIn, float ticks,
			VertexConsumerProvider renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
			int packedOverlayIn, float red, float green, float blue, float partialTicks) {
		super.renderEarly(animatable, stackIn, ticks, renderTypeBuffer, vertexBuilder, packedLightIn, packedOverlayIn,
				red, green, blue, partialTicks);
		stackIn.scale(animatable.age > 2 ? 1.0F : 0.0F, animatable.age > 2 ? 1.0F : 0.0F,
				animatable.age > 2 ? 1.0F : 0.0F);
	}

}