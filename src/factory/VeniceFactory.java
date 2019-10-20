package factory;

import dishes.*;
import ingredients.*;

import java.util.*;

public class VeniceFactory implements SaladFactory {

    @Override
    public Salad create() {
        GetCalorieIngredient getCalorieIngredient = new CalorieIngredients();
        WeightedIngredient smokedSausage = new WeightedIngredient(Ingredients.SMOKED_SAUSAGE, 100,
                getCalorieIngredient.getCalorieIngredient(Ingredients.SMOKED_SAUSAGE));
        WeightedIngredient cheese = new WeightedIngredient(Ingredients.CHEESE, 150,
                getCalorieIngredient.getCalorieIngredient(Ingredients.CHEESE));
        WeightedIngredient cucumber = new WeightedIngredient(Ingredients.CUCUMBER, 150,
                getCalorieIngredient.getCalorieIngredient(Ingredients.CUCUMBER));
        WeightedIngredient carrot = new WeightedIngredient(Ingredients.CARROT, 100,
                getCalorieIngredient.getCalorieIngredient(Ingredients.CARROT));
        WeightedIngredient cannedCorn = new WeightedIngredient(Ingredients.CANNED_CORN, 300,
                getCalorieIngredient.getCalorieIngredient(Ingredients.CANNED_CORN));
        WeightedIngredient mayonnaise = new WeightedIngredient(Ingredients.MAYONNAISE, 100,
                getCalorieIngredient.getCalorieIngredient(Ingredients.MAYONNAISE));

        List<Ingredient> ingredientList = new ArrayList<>();
        ingredientList.add(smokedSausage);
        ingredientList.add(cheese);
        ingredientList.add(cucumber);
        ingredientList.add(carrot);
        ingredientList.add(cannedCorn);
        ingredientList.add(mayonnaise);

        return new Salad(Salads.VENICE, ingredientList);
    }
}
