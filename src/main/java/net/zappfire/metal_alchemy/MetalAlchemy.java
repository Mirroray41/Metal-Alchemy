package net.zappfire.metal_alchemy;

import net.fabricmc.api.ModInitializer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class MetalAlchemy implements ModInitializer {
    public static final Logger LOGGER = LogManager.getLogger("metal-alchemy");
    @Override

    public void onInitialize() {

        LOGGER.info("Metal Alchemy has initialized!");
    }
}
