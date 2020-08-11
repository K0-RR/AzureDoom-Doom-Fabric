package mod.azure.doom.client;

import mod.azure.doom.util.DoomItems;
import nerdhub.cardinal.components.api.event.ItemComponentCallbackV2;
import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.model.json.ModelTransformation.Mode;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.Direction;
import top.theillusivec4.curios.api.CuriosComponent;
import top.theillusivec4.curios.api.type.component.IRenderableCurio;

public class Clientnit implements ClientModInitializer {

	@Override
	public void onInitializeClient() {
		ItemComponentCallbackV2.event(DoomItems.SOULCUBE).register(((item, itemStack,
				componentContainer) -> componentContainer.put(CuriosComponent.ITEM_RENDER, new IRenderableCurio() {
					@Override
					public void render(String identifier, int index, MatrixStack matrixStack,
							VertexConsumerProvider vertexConsumerProvider, int light, LivingEntity livingEntity,
							float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks,
							float netHeadYaw, float headPitch) {
						IRenderableCurio.RenderHelper.translateIfSneaking(matrixStack, livingEntity);
						IRenderableCurio.RenderHelper.rotateIfSneaking(matrixStack, livingEntity);
						matrixStack.scale(0.35F, 0.35F, 0.35F);
						matrixStack.translate(0.0F, 0.5F, -0.4F);
						matrixStack.multiply(Direction.DOWN.getRotationQuaternion());
						MinecraftClient.getInstance().getItemRenderer().renderItem(itemStack, Mode.NONE, light,
								OverlayTexture.DEFAULT_UV, matrixStack, vertexConsumerProvider);
					}
				})));
	}

}