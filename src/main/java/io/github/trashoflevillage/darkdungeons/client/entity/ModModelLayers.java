package io.github.trashoflevillage.darkdungeons.client.entity;

import io.github.trashoflevillage.darkdungeons.DarkDungeons;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

public class ModModelLayers {
    public static final EntityModelLayer ENCHANTER = registerMain("enchanter");

    private static EntityModelLayer registerMain(String id) {
        return new EntityModelLayer(Identifier.of(DarkDungeons.MOD_ID, id), "main");
    }
}
