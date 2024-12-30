package io.github.trashoflevillage.darkdungeons.client.entity.renderers;

import io.github.trashoflevillage.darkdungeons.DarkDungeons;
import io.github.trashoflevillage.darkdungeons.client.entity.ModModelLayers;
import io.github.trashoflevillage.darkdungeons.client.entity.models.EnchanterEntityModel;
import io.github.trashoflevillage.darkdungeons.entity.custom.EnchanterEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.feature.HeadFeatureRenderer;
import net.minecraft.client.render.entity.feature.HeldItemFeatureRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class EnchanterEntityRenderer<T extends EnchanterEntity> extends MobEntityRenderer<EnchanterEntity, EnchanterEntityModel<EnchanterEntity>> {
    public EnchanterEntityRenderer(EntityRendererFactory.Context context) {
        super(context, new EnchanterEntityModel<>(context.getPart(ModModelLayers.ENCHANTER)), 0.5F);
        this.addFeature(new HeadFeatureRenderer<EnchanterEntity, EnchanterEntityModel<EnchanterEntity>>(this, context.getModelLoader(), context.getHeldItemRenderer()));
        this.addFeature(
                new HeldItemFeatureRenderer<EnchanterEntity, EnchanterEntityModel<EnchanterEntity>>(this, context.getHeldItemRenderer()) {
                    public void render(
                            MatrixStack matrixStack,
                            VertexConsumerProvider vertexConsumerProvider,
                            int i,
                            EnchanterEntity EnchanterEntity,
                            float f,
                            float g,
                            float h,
                            float j,
                            float k,
                            float l
                    ) {
                        if (EnchanterEntity.isSpellcasting() || EnchanterEntity.isAttacking()) {
                            super.render(matrixStack, vertexConsumerProvider, i, EnchanterEntity, f, g, h, j, k, l);
                        }
                    }
                }
        );
    }

    @Override
    public Identifier getTexture(EnchanterEntity entity) {
        return Identifier.of(DarkDungeons.MOD_ID, "textures/entity/enchanter.png");
    }

    @Override
    protected void scale(EnchanterEntity entity, MatrixStack matrices, float amount) {
        super.scale(entity, matrices, amount);
        matrices.scale(0.9375F, 0.9375F, 0.9375F);
    }
}
