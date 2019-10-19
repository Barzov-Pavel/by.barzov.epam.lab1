package ingredients;

public class WeightedIngredient extends Ingredient {
    private int weight;
    private int caloriesPer100Grams;

    public WeightedIngredient(Ingredients name, int weight, int caloriesPer100Grams) {
        super(name);
        this.weight = weight;
        this.caloriesPer100Grams = caloriesPer100Grams;
    }

    @Override
    public int getTotalCalories() {
        return weight / 100 * getCaloriesPer100Grams();
    }

    public int getCaloriesPer100Grams() {
        return caloriesPer100Grams;
    }

    public void setCaloriesPer100Grams(int caloriesPer100Grams) {
        if (caloriesPer100Grams > 0) {
            this.caloriesPer100Grams = caloriesPer100Grams;
        } else {
            System.out.println("Калории не могут быть отрицательным числом!");
        }
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight > 0) {
            this.weight = weight;
        } else {
            System.out.println("Вес не может быть отрицательным числом!");
        }
    }
}
