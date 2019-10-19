package factory;

import dishes.Salad;
import dishes.Salads;
import ingredients.*;

import java.util.ArrayList;
import java.util.List;

public class HedgehogFactory implements SaladFactory {
    @Override
    public Salad create() {
        GetCalorieIngredient getCalorieIngredient = new CalorieIngredients();
        WeightedIngredient smokedSausage = new WeightedIngredient(Ingredients.SMOKED_SAUSAGE, 100,
                getCalorieIngredient.getCalorieIngredient(Ingredients.SMOKED_SAUSAGE));
        WeightedIngredient cheese = new WeightedIngredient(Ingredients.CHEESE, 100,
                getCalorieIngredient.getCalorieIngredient(Ingredients.CHEESE));
        CountableIngredient eggs = new CountableIngredient(Ingredients.BOILED_EGG, 3,
                getCalorieIngredient.getCalorieIngredient(Ingredients.BOILED_EGG));
        WeightedIngredient cannedCorn = new WeightedIngredient(Ingredients.CANNED_CORN, 140,
                getCalorieIngredient.getCalorieIngredient(Ingredients.CANNED_CORN));
        WeightedIngredient garlic = new WeightedIngredient(Ingredients.GARLIC, 30,
                getCalorieIngredient.getCalorieIngredient(Ingredients.GARLIC));
        WeightedIngredient mayonnaise = new WeightedIngredient(Ingredients.MAYONNAISE, 100,
                getCalorieIngredient.getCalorieIngredient(Ingredients.MAYONNAISE));

        List<Ingredient> ingredientList = new ArrayList<>();
        ingredientList.add(smokedSausage);
        ingredientList.add(cheese);
        ingredientList.add(eggs);
        ingredientList.add(cannedCorn);
        ingredientList.add(garlic);
        ingredientList.add(mayonnaise);

        Salad hedgehog = new Salad(Salads.HEDGEHOG, ingredientList);

        return hedgehog;
    }
}
