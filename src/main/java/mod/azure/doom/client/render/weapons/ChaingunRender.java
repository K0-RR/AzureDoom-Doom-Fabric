package mod.azure.doom.client.render.weapons;

import mod.azure.doom.client.models.weapons.ChaingunModel;
import mod.azure.doom.item.weapons.Chaingun;
import software.bernie.geckolib3.renderer.geo.GeoItemRenderer;

public class ChaingunRender extends GeoItemRenderer<Chaingun> {
	public ChaingunRender() {
		super(new ChaingunModel());
	}
}