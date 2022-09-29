package me.purplepineapple.bijoux;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Bijoux implements ModInitializer {
	public static final String MOD_ID = "bijoux";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Bijoux is initializing");
	}
}
