package io.github.trashoflevillage.darkdungeons.items;

import io.github.trashoflevillage.darkdungeons.DarkDungeons;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.DyedColorComponent;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.random.Random;

import java.util.Arrays;

public class ModItems {
    public static void registerModItems() {
        DarkDungeons.LOGGER.info("Registering items for " + DarkDungeons.MOD_ID + ".");
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(DarkDungeons.MOD_ID, name), item);
    }
}