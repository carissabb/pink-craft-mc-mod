package com.example.examplemod.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.PlayerModel;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.player.PlayerRenderer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.model.geom.EntityModelSet;
import net.minecraft.resources.ResourceLocation;

public class CustomSkinLayer extends RenderLayer<AbstractClientPlayer, PlayerModel<AbstractClientPlayer>> {

    private static final ResourceLocation CUSTOM_SKIN = new ResourceLocation("examplemod", "textures/entity/carissa_7_skin.png");
    private final PlayerModel<AbstractClientPlayer> steveModel;

    public CustomSkinLayer(PlayerRenderer renderer) {
        super(renderer);
        EntityModelSet models = Minecraft.getInstance().getEntityModels();
        this.steveModel = new PlayerModel<>(models.bakeLayer(ModelLayers.PLAYER), false); 
    }

    @Override
    public void render(PoseStack poseStack, MultiBufferSource buffer, int packedLight,
                       AbstractClientPlayer player, float limbSwing, float limbSwingAmount,
                       float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {

        if (!player.getUUID().equals(Minecraft.getInstance().player.getUUID())) return;

        this.getParentModel().copyPropertiesTo(steveModel);
        steveModel.setupAnim(player, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
        steveModel.setAllVisible(true);

        var vertexBuilder = buffer.getBuffer(RenderType.entityCutoutNoCull(CUSTOM_SKIN));
        steveModel.renderToBuffer(poseStack, vertexBuilder, packedLight, OverlayTexture.NO_OVERLAY, 1f, 1f, 1f, 1f);
    }
}
