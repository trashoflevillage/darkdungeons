package io.github.trashoflevillage.darkdungeons.util;

import io.github.trashoflevillage.darkdungeons.DarkDungeons;
import net.minecraft.loot.LootTable;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModLootTables {
    private static RegistryKey<LootTable> of(String id) {
        return RegistryKey.of(RegistryKeys.LOOT_TABLE, Identifier.of(DarkDungeons.MOD_ID, id));
    }
}
