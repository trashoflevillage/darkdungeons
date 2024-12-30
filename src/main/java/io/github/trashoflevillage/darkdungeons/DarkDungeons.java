package io.github.trashoflevillage.darkdungeons;

import io.github.trashoflevillage.darkdungeons.blocks.ModBlocks;
import io.github.trashoflevillage.darkdungeons.entity.ModEntities;
import io.github.trashoflevillage.darkdungeons.entity.custom.EnchanterEntity;
import io.github.trashoflevillage.darkdungeons.items.ModItemGroups;
import io.github.trashoflevillage.darkdungeons.items.ModItems;
import io.github.trashoflevillage.darkdungeons.sounds.ModSounds;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DarkDungeons implements ModInitializer {
	public static final String MOD_ID = "darkdungeons";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		ModItems.registerModItems();
		ModItemGroups.registerItemGroups();
		ModBlocks.registerModBlocks();
		ModSounds.registerSounds();

		FabricDefaultAttributeRegistry.register(ModEntities.ENCHANTER, EnchanterEntity.createEnchanterAttributes());
	}
}