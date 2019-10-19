package dishes;

import java.util.*;

import ingredients.Ingredient;

public abstract class Dish {
    protected List<Ingredient> ingredientList;

    public Dish(List<Ingredient> ingredientList) {
        this.ingredientList = ingredientList;
    }

    public void showRecipe() {
        System.out.println("Список ингредиентов: ");
        for (Ingredient ingredient : ingredientList) {
            System.out.println(ingredient.getName());
        }
    }

    public abstract void showIngredientsByCalories(int lowerCalories, int upperCalories);

    public abstract int getDishTotalCalories();

    public abstract void sortIngredientsByCalories();

    public List<Ingredient> getIngredientList() {
        return ingredientList;
    }

    public void setIngredientList(List<Ingredient> ingredientList) {
        this.ingredientList = ingredientList;
    }
}
