package vaper.ruben;

import net.fabricmc.api.ModInitializer;

import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import vaper.ruben.init.blockinit;
import vaper.ruben.init.iteminit;

public class Vaperruben implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
    public static final Logger LOGGER = LoggerFactory.getLogger("VaperRuben");
	public static final String MOD_ID = "vaper-ruben";
	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Loading...");
		iteminit.load();
		blockinit.load();
	}

	public static Identifier id(String path) {
		return Identifier.of(MOD_ID,path);
	}
}