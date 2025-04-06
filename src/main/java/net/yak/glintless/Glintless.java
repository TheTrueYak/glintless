package net.yak.glintless;

import net.fabricmc.api.ModInitializer;

import net.minecraft.item.Item;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Glintless implements ModInitializer {
	public static final String MOD_ID = "glintless";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static final TagKey<Item> NO_GLINT = TagKey.of(Registry.ITEM_KEY, Identifier.of(MOD_ID, "no_glint"));

	@Override
	public void onInitialize() {

		LOGGER.info("no glint for you!!! muahahahahahhh");
	}
}