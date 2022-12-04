package com.rweg613.habibi_mod.init;

import com.google.common.base.Supplier;
import com.rweg613.habibi_mod.HabibiMod;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, HabibiMod.MOD_ID);
	
	public static final RegistryObject<Item> OIL_CONTRACT = register("oil_contract", () -> new Item(new Item.Properties().tab(HabibiMod.HABIBI_TAB)));
	
	private static <T extends Item> RegistryObject<T> register(final String name, final Supplier<T> item) {
		return ITEMS.register(name, item);
	}
}
