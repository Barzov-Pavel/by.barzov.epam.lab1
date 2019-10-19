package comparators;

import ingredients.Ingredient;

import java.util.Comparator;

public class CalorieComparator implements Comparator<Ingredient> {
    @Override
    public int compare(Ingredient o1, Ingredient o2) {
        return o1.getTotalCalories() - o2.getTotalCalories();
    }
}
