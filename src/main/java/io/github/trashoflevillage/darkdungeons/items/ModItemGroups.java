package io.github.trashoflevillage.darkdungeons.items;

import io.github.trashoflevillage.darkdungeons.DarkDungeons;
import io.github.trashoflevillage.darkdungeons.blocks.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup FESTIVITIES_GROUP = Registry.register(Registries.ITEM_GROUP, Identifier.of(DarkDungeons.MOD_ID, "darkdungeons"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.darkdungeons"))
                    .icon(() -> new ItemStack(ModBlocks.CHECKERBOARD_BLOCK))
                    .entries(((displayContext, entries) -> {
                        entries.add(ModBlocks.CHECKERBOARD_BLOCK);
                        entries.add(ModItems.ENCHANTER_SPAWN_EGG);
                    }))
                    .build()
    );

    public static void registerItemGroups() {
        addItemsToItemGroup(ItemGroups.BUILDING_BLOCKS,
                ModBlocks.CHECKERBOARD_BLOCK
        );

        addItemsToItemGroup(ItemGroups.SPAWN_EGGS,
                ModItems.ENCHANTER_SPAWN_EGG
        );
    }

    private static void addItemsToItemGroup(RegistryKey<ItemGroup> group, ItemConvertible... items) {
        ItemGroupEvents.modifyEntriesEvent(group).register(content -> {
            for (ItemConvertible i : items)
                content.add(i);
        });
    }
}
