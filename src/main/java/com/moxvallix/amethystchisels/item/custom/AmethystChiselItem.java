package com.moxvallix.amethystchisels.item.custom;

import com.moxvallix.amethystchisels.block.ModBlockTags;
import net.minecraft.block.BlockState;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.ItemStack;
import net.minecraft.item.MiningToolItem;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.nbt.NbtList;

public class AmethystChiselItem extends MiningToolItem {
  public AmethystChiselItem(ToolMaterial material, float attackDamage, float attackSpeed, Settings settings) {
    super(attackDamage, attackSpeed, material, ModBlockTags.AMETHYST_CHISEL_MINEABLE, settings);
  }

  @Override
  public float getMiningSpeedMultiplier(ItemStack stack, BlockState state) {
    final int silkLevel = EnchantmentHelper.getLevel(Enchantments.SILK_TOUCH, stack);
    if (silkLevel > 0 && state.isIn(ModBlockTags.AMETHYST_CHISEL_SILK_TOUCH_MINEABLE)) {
      return this.miningSpeed;
    }

    if (state.isIn(ModBlockTags.AMETHYST_CHISEL_NOT_MINEABLE)) {
      return 0.0F;
    }

    return state.isIn(ModBlockTags.AMETHYST_CHISEL_MINEABLE) ? this.miningSpeed : 1.0F;
  }
}
