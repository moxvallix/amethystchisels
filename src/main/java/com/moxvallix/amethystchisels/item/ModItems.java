package com.moxvallix.amethystchisels.item;

import com.moxvallix.amethystchisels.Amethystchisels;
import com.moxvallix.amethystchisels.item.custom.AmethystChiselItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
  public static final Item AMETHYST_CHISEL = registerItem("amethyst_chisel",
    new AmethystChiselItem(ModToolMaterials.AMETHYST, 1, -2.8F, new FabricItemSettings().group(ItemGroup.TOOLS))
  );

  private static Item registerItem(String name, Item item) {
    return Registry.register(Registry.ITEM, new Identifier(Amethystchisels.MOD_ID, name), item);
  }

  public static void registerModItems() {
    Amethystchisels.LOGGER.info("Registering Mod Items for " + Amethystchisels.MOD_ID);
  }
}
