package factory;

import dishes.*;
import ingredients.*;

import java.util.*;

public class TendernessFactory implements SaladFactory {

    @Override
    public Salad create() {
        GetCalorieIngredient getCalorieIngredient = new CalorieIngredients();
        WeightedIngredient cabbage = new WeightedIngredient(Ingredients.CABBAGE, 300,
                getCalorieIngredient.getCalorieIngredient(Ingredients.CABBAGE));
        WeightedIngredient smokedSausage = new WeightedIngredient(Ingredients.SMOKED_SAUSAGE, 200,
                getCalorieIngredient.getCalorieIngredient(Ingredients.SMOKED_SAUSAGE));
        WeightedIngredient garlic = new WeightedIngredient(Ingredients.GARLIC, 100,
                getCalorieIngredient.getCalorieIngredient(Ingredients.GARLIC));
        WeightedIngredient parsley = new WeightedIngredient(Ingredients.PARSLEY, 10,
                getCalorieIngredient.getCalorieIngredient(Ingredients.PARSLEY));
        WeightedIngredient mayonnaise = new WeightedIngredient(Ingredients.MAYONNAISE, 100,
                getCalorieIngredient.getCalorieIngredient(Ingredients.MAYONNAISE));
        WeightedIngredient salt = new WeightedIngredient(Ingredients.SALT, 5,
                getCalorieIngredient.getCalorieIngredient(Ingredients.SALT));

        List<Ingredient> ingredientList = new ArrayList<>();
        ingredientList.add(cabbage);
        ingredientList.add(smokedSausage);
        ingredientList.add(garlic);
        ingredientList.add(parsley);
        ingredientList.add(mayonnaise);
        ingredientList.add(salt);

        Salad tenderness = new Salad(Salads.TENDERNESS, ingredientList);

        return tenderness;
    }
}
