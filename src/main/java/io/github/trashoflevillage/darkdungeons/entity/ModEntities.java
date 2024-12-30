package io.github.trashoflevillage.darkdungeons.entity;

import io.github.trashoflevillage.darkdungeons.DarkDungeons;
import io.github.trashoflevillage.darkdungeons.entity.custom.EnchanterEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.ItemActionResult;

import java.util.HashMap;

public class ModEntities {
    public static final EntityType<EnchanterEntity> ENCHANTER = Registry.register(Registries.ENTITY_TYPE,
            Identifier.of(DarkDungeons.MOD_ID, "enchanter"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, EnchanterEntity::new)
                    .dimensions(EntityDimensions.fixed(0.6f, 1.95f))
                    .build());
}