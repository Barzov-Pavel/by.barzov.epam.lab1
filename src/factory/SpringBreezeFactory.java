package factory;

import dishes.Salad;
import dishes.Salads;
import ingredients.*;

import java.util.ArrayList;
import java.util.List;

public class SpringBreezeFactory implements SaladFactory {

    @Override
    public Salad create() {
        GetCalorieIngredient getCalorieIngredient = new CalorieIngredients();
        WeightedIngredient tomato = new WeightedIngredient(Ingredients.TOMATO, 300,
                getCalorieIngredient.getCalorieIngredient(Ingredients.TOMATO));
        WeightedIngredient crabSticks = new WeightedIngredient(Ingredients.CRAB_STICKS, 200,
                getCalorieIngredient.getCalorieIngredient(Ingredients.CRAB_STICKS));
        WeightedIngredient cheese = new WeightedIngredient(Ingredients.CHEESE, 150,
                getCalorieIngredient.getCalorieIngredient(Ingredients.CHEESE));
        WeightedIngredient garlic = new WeightedIngredient(Ingredients.GARLIC, 75,
                getCalorieIngredient.getCalorieIngredient(Ingredients.GARLIC));
        WeightedIngredient mayonnaise = new WeightedIngredient(Ingredients.MAYONNAISE, 100,
                getCalorieIngredient.getCalorieIngredient(Ingredients.MAYONNAISE));
        WeightedIngredient greens = new WeightedIngredient(Ingredients.GREENS, 20,
                getCalorieIngredient.getCalorieIngredient(Ingredients.GREENS));

        List<Ingredient> ingredientList = new ArrayList<>();
        ingredientList.add(tomato);
        ingredientList.add(crabSticks);
        ingredientList.add(cheese);
        ingredientList.add(garlic);
        ingredientList.add(mayonnaise);
        ingredientList.add(greens);

        Salad springBreeze = new Salad(Salads.SPRING_BREEZE, ingredientList);

        return springBreeze;
    }
}
