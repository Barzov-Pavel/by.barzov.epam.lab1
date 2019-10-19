package dishes;

import comparators.CalorieFilter;
import comparators.CalorieComparator;
import ingredients.Ingredient;

import java.util.Collections;
import java.util.List;

public class Salad extends Dish {
    private Salads name;

    public Salad(Salads name, List<Ingredient> ingredientList) {
        super(ingredientList);
        this.name = name;
    }

    @Override
    public void showIngredientsByCalories(int lowerCalories, int upperCalories) {
        CalorieFilter calorieFilter = new CalorieFilter(lowerCalories, upperCalories);
        for (Ingredient ingredient : ingredientList) {
            if (calorieFilter.check(ingredient)) {
                System.out.println(ingredient);
            }
        }
    }

    @Override
    public int getDishTotalCalories() {
        int dishTotalCalories = 0;
        for (Ingredient ingredient : ingredientList) {
            dishTotalCalories += ingredient.getTotalCalories();
        }
        return dishTotalCalories;
    }

    @Override
    public void sortIngredientsByCalories() {
        Collections.sort(ingredientList, new CalorieComparator());
    }

    @Override
    public String toString() {
        String saladIngredient = "\nНазвание салата: \n" + getName();

        return saladIngredient;
    }

    public Salads getName() {
        return name;
    }

    public void setName(Salads name) {
        this.name = name;
    }
}
