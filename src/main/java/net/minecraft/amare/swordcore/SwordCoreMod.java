package net.minecraft.amare.swordcore;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.amare.swordcore.blocksword.KeyBlock;
import net.minecraft.amare.swordcore.itemsword.HanDao;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class SwordCoreMod implements ModInitializer {

	public static final ItemGroup SWORD_GROUP = FabricItemGroupBuilder.build(new Identifier("swordcore", "sword_group"),
			() -> new ItemStack(SwordCoreMod.HAN_DAO));

	public static final HanDao HAN_DAO = new HanDao();
	public static final KeyBlock KEY_BLOCK = new KeyBlock();

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		Registry.register(Registry.ITEM, new Identifier("swordcore", "han_dao"), HAN_DAO);
		Registry.register(Registry.ITEM, new Identifier("swordcore", "key_block"),
		new BlockItem(KEY_BLOCK, new Item.Settings().group(SwordCoreMod.SWORD_GROUP).fireproof().rarity(Rarity.EPIC)));
		Registry.register(Registry.BLOCK, new Identifier("swordcore", "key_block"), KEY_BLOCK);


	}
}