package net.salamandemon.modaniversario.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

import java.util.function.Supplier;

public class ModFoodProperties {
    public static final FoodProperties BOLODECENOURACOMCHOCOLATE = new FoodProperties.Builder().nutrition(3).saturationModifier(.25f)
            .effect(() -> new MobEffectInstance(MobEffects.HEALTH_BOOST, 400), 0.35f).build();

    public static final FoodProperties CRACK = new FoodProperties.Builder().nutrition(2).saturationModifier(.25f)
            .alwaysEdible().effect(() -> new MobEffectInstance(MobEffects.DARKNESS, 400), 1)
            .effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 400), 1).
            effect(() -> new MobEffectInstance(MobEffects.HUNGER, 400), 1).build();
}
