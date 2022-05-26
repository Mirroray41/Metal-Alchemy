package net.zappfire.metal_alchemy;

import net.fabricmc.api.ModInitializer;

import net.zappfire.metal_alchemy.block.ModBlocks;
import net.zappfire.metal_alchemy.item.ModItems;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class MetalAlchemy implements ModInitializer {
    public static final String MOD_ID = "metal-alchemy";
    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);
    @Override

    public void onInitialize() {

        ModItems.registerModItems();
        ModBlocks.registerModBlocks();

    }
}
