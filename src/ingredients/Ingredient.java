package ingredients;

public abstract class Ingredient {
    private Ingredients name;

    public Ingredient() {
    }

    public Ingredient(Ingredients name) {
        this.name = name;
    }

    public abstract int getTotalCalories();

    public Ingredients getName() {
        return name;
    }

    public void setName(Ingredients name) {
        this.name = name;
    }

    @Override
    public String toString() {
        String ingredient = "Наименование ингредиента: " + getName() + "\nКалорийность ингредиента: " + getTotalCalories();

        return ingredient;
    }
}
