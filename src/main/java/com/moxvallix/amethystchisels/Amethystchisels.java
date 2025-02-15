package com.moxvallix.amethystchisels;

import com.moxvallix.amethystchisels.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Amethystchisels implements ModInitializer {
  public static final String MOD_ID = "amethystchisels";
  public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

  @Override
  public void onInitialize() {
    ModItems.registerModItems();
  }
}
