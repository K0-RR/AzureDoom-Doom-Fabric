package mod.azure.doom.structures;

import mod.azure.doom.DoomMod;
import net.fabricmc.fabric.api.structure.v1.FabricStructureBuilder;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.chunk.StructureConfig;
import net.minecraft.world.gen.feature.DefaultFeatureConfig;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.StructureFeature;

public class DoomStructures {

	public static StructureFeature<DefaultFeatureConfig> MAYKR = new MaykrStructure(DefaultFeatureConfig.CODEC);

	public static StructureFeature<DefaultFeatureConfig> TITAN_SKULL = new TitanSkullStructure(DefaultFeatureConfig.CODEC);

	public static StructureFeature<DefaultFeatureConfig> PORTAL = new PortalStructure(DefaultFeatureConfig.CODEC);

	public static void setupAndRegisterStructureFeatures() {

		FabricStructureBuilder.create(new Identifier(DoomMod.MODID, "maykr"), MAYKR)
				.step(GenerationStep.Feature.SURFACE_STRUCTURES).defaultConfig(new StructureConfig(20, 11, 1234567890))
				.superflatFeature(MAYKR.configure(FeatureConfig.DEFAULT)).adjustsSurface().register();

		FabricStructureBuilder.create(new Identifier(DoomMod.MODID, "titan_skull"), TITAN_SKULL)
				.step(GenerationStep.Feature.SURFACE_STRUCTURES).defaultConfig(new StructureConfig(80, 20, 1234567890))
				.superflatFeature(TITAN_SKULL.configure(FeatureConfig.DEFAULT)).adjustsSurface().register();

		FabricStructureBuilder.create(new Identifier(DoomMod.MODID, "portal"), PORTAL)
				.step(GenerationStep.Feature.SURFACE_STRUCTURES).defaultConfig(new StructureConfig(80, 20, 1234567890))
				.superflatFeature(PORTAL.configure(FeatureConfig.DEFAULT)).adjustsSurface().register();
	}
}