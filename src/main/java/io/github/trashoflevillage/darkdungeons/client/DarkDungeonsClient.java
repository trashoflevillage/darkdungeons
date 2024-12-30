package io.github.trashoflevillage.darkdungeons.client;

import io.github.trashoflevillage.darkdungeons.client.entity.ModModelLayers;
import io.github.trashoflevillage.darkdungeons.client.entity.models.EnchanterEntityModel;
import io.github.trashoflevillage.darkdungeons.client.entity.renderers.EnchanterEntityRenderer;
import io.github.trashoflevillage.darkdungeons.entity.ModEntities;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.block.Block;
import net.minecraft.client.render.RenderLayer;

public class DarkDungeonsClient implements ClientModInitializer {
	private static final Block[] blocksWithTransparency = new Block[] {

	};

	@Override
	public void onInitializeClient() {
		for (Block i : blocksWithTransparency)
			BlockRenderLayerMap.INSTANCE.putBlock(i, RenderLayer.getCutout());

		registerEntityRenderersAndModelLayers();

		registerParticles();
	}

	private void registerParticles() {

	}

	private void registerEntityRenderersAndModelLayers() {
		EntityRendererRegistry.register(ModEntities.ENCHANTER, EnchanterEntityRenderer::new);
		EntityModelLayerRegistry.registerModelLayer(ModModelLayers.ENCHANTER, EnchanterEntityModel::getTexturedModelData);
	}
}