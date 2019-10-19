package comparators;

import ingredients.Ingredient;

public class CalorieFilter implements Filter {
    private Integer calorieBottom;
    private Integer calorieUpper;

    public CalorieFilter(Integer calorieBottom, Integer calorieUpper) {
        this.calorieBottom = calorieBottom;
        this.calorieUpper = calorieUpper;
    }

    @Override
    public boolean check(Ingredient ingredient) {
        return ingredient.getTotalCalories() >= calorieBottom && ingredient.getTotalCalories() <= calorieUpper;
    }
}
