package com.moxvallix.amethystchisels.block;

import com.moxvallix.amethystchisels.Amethystchisels;
import net.minecraft.block.Block;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlockTags {
  public static final TagKey<Block> AMETHYST_CHISEL_MINEABLE = TagKey.of(
    Registry.BLOCK_KEY,
    new Identifier(Amethystchisels.MOD_ID, "chisel_mineable")
  );

  public static final TagKey<Block> AMETHYST_CHISEL_NOT_MINEABLE = TagKey.of(
    Registry.BLOCK_KEY,
    new Identifier(Amethystchisels.MOD_ID, "chisel_not_mineable")
  );

  public static final TagKey<Block> AMETHYST_CHISEL_SILK_TOUCH_MINEABLE = TagKey.of(
    Registry.BLOCK_KEY,
    new Identifier(Amethystchisels.MOD_ID, "chisel_silk_touch_mineable")
  );
}
