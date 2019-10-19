package ingredients;

public class CountableIngredient extends Ingredient {
    private int count;
    private int caloriesPer1Piece;

    public CountableIngredient(Ingredients name, int count, int caloriesPer1Piece) {
        super(name);
        this.count = count;
        this.caloriesPer1Piece = caloriesPer1Piece;
    }

    @Override
    public int getTotalCalories() {
        return count * getCaloriesPer1Piece();
    }

    public int getCaloriesPer1Piece() {
        return caloriesPer1Piece;
    }

    public void setCaloriesPer1Piece(int caloriesPer1Piece) {
        if (caloriesPer1Piece > 0) {
            this.caloriesPer1Piece = caloriesPer1Piece;
        } else {
            System.out.println("Калории не могут быть отрицательным числом!");
        }
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        if (count > 0) {
            this.count = count;
        } else {
            System.out.println("Количество ингредиента не может быть отрицательным числом!");
        }
    }
}
