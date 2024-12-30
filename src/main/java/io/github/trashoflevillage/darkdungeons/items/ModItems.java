package io.github.trashoflevillage.darkdungeons.items;

import io.github.trashoflevillage.darkdungeons.DarkDungeons;
import io.github.trashoflevillage.darkdungeons.entity.ModEntities;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item ENCHANTER_SPAWN_EGG = registerItem("enchanter_spawn_egg",
            new SpawnEggItem(ModEntities.ENCHANTER, 0x561226, 0x4aedd1, new Item.Settings()));

    public static void registerModItems() {
        DarkDungeons.LOGGER.info("Registering items for " + DarkDungeons.MOD_ID + ".");
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(DarkDungeons.MOD_ID, name), item);
    }
}