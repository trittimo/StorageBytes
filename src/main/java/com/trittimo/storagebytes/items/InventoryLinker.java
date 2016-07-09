package com.trittimo.storagebytes.items;

import java.io.Console;

import com.trittimo.storagebytes.util.Constants;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class InventoryLinker extends Item {
	
	public InventoryLinker() {
		this.setUnlocalizedName(Constants.Items.LINKER_NAME);
		this.setRegistryName(Constants.Items.LINKER_NAME);
		this.setMaxStackSize(1);
		this.setCreativeTab(CreativeTabs.TOOLS);
		
		GameRegistry.register(this);
	}
	
	@Override
	public EnumActionResult onItemUseFirst(ItemStack stack, EntityPlayer player, World world, BlockPos pos,
			EnumFacing side, float hitX, float hitY, float hitZ, EnumHand hand) {
		
		return EnumActionResult.SUCCESS;
	}
}
