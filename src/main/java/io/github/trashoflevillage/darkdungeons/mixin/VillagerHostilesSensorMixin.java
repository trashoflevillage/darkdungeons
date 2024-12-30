package io.github.trashoflevillage.darkdungeons.mixin;

import com.google.common.collect.ImmutableMap;
import io.github.trashoflevillage.darkdungeons.entity.ModEntities;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.brain.sensor.VillagerHostilesSensor;
import net.minecraft.server.MinecraftServer;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(VillagerHostilesSensor.class)
public class VillagerHostilesSensorMixin {
	@Shadow
	@Final
	@Mutable
	private static ImmutableMap<EntityType<?>, Float> SQUARED_DISTANCES_FOR_DANGER;

	static {
		SQUARED_DISTANCES_FOR_DANGER = ImmutableMap.<EntityType<?>, Float>builder()
				.putAll(SQUARED_DISTANCES_FOR_DANGER.entrySet())
				.put(ModEntities.ENCHANTER, 3.0F)
				.build();
	}
}
