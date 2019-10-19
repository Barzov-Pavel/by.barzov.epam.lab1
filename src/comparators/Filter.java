package comparators;

import ingredients.Ingredient;

public interface Filter {
    boolean check(Ingredient ingredient);
}
