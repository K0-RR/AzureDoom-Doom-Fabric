package mod.azure.doom.util;

import mod.azure.doom.DoomMod;
import mod.azure.doom.block.BarrelBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class DoomBlocks {

	public static final Block BARREL_BLOCK = new BarrelBlock(
			FabricBlockSettings.of(Material.METAL).sounds(BlockSoundGroup.METAL).nonOpaque());

	public static void init() {
		Registry.register(Registry.BLOCK, new Identifier(DoomMod.MODID, "barrel"), DoomBlocks.BARREL_BLOCK);
		Registry.register(Registry.ITEM, new Identifier(DoomMod.MODID, "barrel"),
				new BlockItem(DoomBlocks.BARREL_BLOCK, new Item.Settings().group(DoomMod.DoomItemGroup)));
	}
}