package com.rweg613.habibi_mod;

import com.rweg613.habibi_mod.init.ItemInit;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("habibi_mod")
public class HabibiMod {
	
	public static final String MOD_ID = "habibi_mod";
	
	public static final CreativeModeTab HABIBI_TAB = new CreativeModeTab(MOD_ID) {
		@Override
		@OnlyIn(Dist.CLIENT)
		public ItemStack makeIcon() {
			return new ItemStack(ItemInit.OIL_CONTRACT.get());
		}
	};
	
	public HabibiMod() {
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		
		ItemInit.ITEMS.register(bus);
		
		MinecraftForge.EVENT_BUS.register(this);
	}
}
