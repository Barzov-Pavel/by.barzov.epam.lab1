import dishes.Dish;
import dishes.Salad;
import factory.*;
import ingredients.CalorieIngredients;
import ingredients.Ingredient;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Chief {
    private String name;
    private List<Dish> saladList = new ArrayList<>();

    static {
        CalorieIngredients.setCalorieIngredients();
    }

    public Chief(String name) {
        this.name = name;
    }

    {
        SaladFactory hedgehogFactory = new HedgehogFactory();
        SaladFactory springBreezeFactory = new SpringBreezeFactory();
        SaladFactory tendernessFactory = new TendernessFactory();
        SaladFactory veniceFactory = new VeniceFactory();

        Salad hedgehog = hedgehogFactory.create();
        Salad springBreeze = springBreezeFactory.create();
        Salad tenderness = tendernessFactory.create();
        Salad venice = veniceFactory.create();

        saladList.add(hedgehog);
        saladList.add(springBreeze);
        saladList.add(tenderness);
        saladList.add(venice);
    }

    public void showIngredientsForCalories(Scanner scanner) {
        int lowerCalories = -1;
        int upperCalories = -1;
        boolean checkInput = false;

        try {
            while (!checkInput) {
                System.out.println("Введите нижнюю границу калорийности:");
                lowerCalories = scanner.nextInt();
                if (lowerCalories >= 0) {
                    checkInput = true;
                }
            }

        } catch (InputMismatchException e) {
            System.out.println("Не верный ввод!");
            scanner.next();

            return;
        }

        checkInput = false;
        try {
            while (!checkInput) {
                System.out.println("Введите верхнюю границу калорийности:");
                upperCalories = scanner.nextInt();
                if (upperCalories >= lowerCalories) {
                    checkInput = true;
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Не верный ввод!");
            scanner.next();

            return;
        }

        for (Dish salad : saladList) {
            System.out.println(salad);
            salad.showIngredientsByCalories(lowerCalories, upperCalories);
        }
    }

    public void showOptions() {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;

        System.out.println("Привет! Меня зовут " + name + ".");
        System.out.println("Что вы хотите сделать?");

        while (choice != 0) {
            System.out.println("\nВыберите одну из опций:");
            System.out.println("1. Показать рецепт");
            System.out.println("2. Сортировать салаты по калориям");
            System.out.println("3. Показать ингредиенты в заданной калорийности");
            System.out.println("0. Выход");

            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Неверная опция!");
                scanner.next();
                choice = -1;
            }

            switch (choice) {
                case 1:
                    for (Dish salad : saladList) {
                        System.out.println(salad);
                        salad.showRecipe();
                    }
                    break;

                case 2:
                    for (Dish salad : saladList) {
                        salad.sortIngredientsByCalories();
                    }
                    for (Dish salad : saladList) {
                        System.out.println(salad);
                        for (Ingredient ingredient : salad.getIngredientList()) {
                            System.out.println(ingredient);
                        }
                    }
                    break;

                case 3:
                    showIngredientsForCalories(scanner);
                    break;

                case 0:
                    System.exit(0);
                    break;

                default:
                    break;
            }
        }
        scanner.close();
    }
}
