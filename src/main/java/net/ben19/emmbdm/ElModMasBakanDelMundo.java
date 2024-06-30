package net.ben19.emmbdm;

import net.ben19.emmbdm.block.ModBlocks;
import net.ben19.emmbdm.item.ModItemGroups;
import net.ben19.emmbdm.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ElModMasBakanDelMundo implements ModInitializer {
	public static final String MOD_ID = "ben19_emmbdm";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		LOGGER.info("Hello Fabric world!");
		ModItemGroups.RegisterItemGroups();
		ModBlocks.RegisterModBlocks();

	}
}