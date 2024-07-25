package vaper.ruben.list;


import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class FoodList {
    public static final FoodComponent Example_food = new FoodComponent.Builder()
            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 300, 0), 1.0F)
            .saturationModifier(0.3F)
            .alwaysEdible()
            .build();
}
