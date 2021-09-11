package net.readf0x;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class HoePrismarine implements ToolMaterial {

    public static final PrismarineToolMaterial INSTANCE = new PrismarineToolMaterial();

    @Override
    public int getDurability() {
        return 500;
    }
    
    public float getMiningSpeedMultiplier() {
        return 5f;
    }

    public float getAttackDamage() {
        return 0f;
    }

    public int getMiningLevel() {
        return 1;
    }

    public int getEnchantability() {
        return 5;
    }

    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.PRISMARINE);
    }

}
