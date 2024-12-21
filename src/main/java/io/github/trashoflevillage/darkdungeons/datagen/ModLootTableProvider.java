package io.github.trashoflevillage.darkdungeons.datagen;

import io.github.trashoflevillage.darkdungeons.blocks.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        Block[] blocksThatDropThemselves = new Block[] {
                ModBlocks.CHECKERBOARD_BLOCK
        };
        for (Block i : blocksThatDropThemselves) addDrop(i);
    }
}
