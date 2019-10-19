package ingredients;

import java.util.HashMap;

public class CalorieIngredients implements GetCalorieIngredient {
    private static HashMap<Ingredients, Integer> calorieIngredients = new HashMap<>();

    @Override
    public int getCalorieIngredient(Ingredients ingredients) {
        return calorieIngredients.get(ingredients);
    }

    public static void setCalorieIngredients() {
        calorieIngredients.put(Ingredients.BOILED_EGG, 88);
        calorieIngredients.put(Ingredients.CABBAGE, 27);
        calorieIngredients.put(Ingredients.CANNED_CORN, 58);
        calorieIngredients.put(Ingredients.CARROT, 32);
        calorieIngredients.put(Ingredients.CHEESE, 356);
        calorieIngredients.put(Ingredients.CRAB_STICKS, 73);
        calorieIngredients.put(Ingredients.CUCUMBER, 15);
        calorieIngredients.put(Ingredients.GARLIC, 149);
        calorieIngredients.put(Ingredients.GREENS, 36);
        calorieIngredients.put(Ingredients.MAYONNAISE, 680);
        calorieIngredients.put(Ingredients.PARSLEY, 47);
        calorieIngredients.put(Ingredients.SALT, 0);
        calorieIngredients.put(Ingredients.SMOKED_SAUSAGE, 507);
        calorieIngredients.put(Ingredients.TOMATO, 24);
    }
}
