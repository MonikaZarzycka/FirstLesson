package Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Menu {
    public static void main(String[] args) {
        List<Ingredients> ingredientsOne = Arrays.asList(Ingredients.MOZZARELLA,
                Ingredients.TOMATO);
        List<Ingredients> ingredientsTwo = Arrays.asList(Ingredients.SALAMI, Ingredients.MOZZARELLA,
                Ingredients.MUSHROOMS);
        List<Ingredients> ingredientsThree = Arrays.asList(Ingredients.CELERY, Ingredients.MOZZARELLA,
                Ingredients.TOMATO);
        List<Ingredients> ingredientsFour = Arrays.asList(Ingredients.ONION, Ingredients.MOZZARELLA,
                Ingredients.TOMATO, Ingredients.MUSHROOMS);
        List<Ingredients> ingredientsFive = Arrays.asList(Ingredients.ONION, Ingredients.MOZZARELLA,
                Ingredients.TOMATO, Ingredients.CELERY);
        List<Ingredients> ingredientsSix = Arrays.asList(Ingredients.ONION, Ingredients.MOZZARELLA,
                Ingredients.TOMATO, Ingredients.PEPPERS);
        List<Ingredients> ingredientsSeven = Arrays.asList(Ingredients.ONION, Ingredients.MOZZARELLA,
                Ingredients.TOMATO, Ingredients.PEPPERS, Ingredients.MUSHROOMS);
        List<Ingredients> ingredientsEight = Arrays.asList(Ingredients.SALAMI, Ingredients.MOZZARELLA,
                Ingredients.TOMATO, Ingredients.PEPPERS);
        List<Ingredients> ingredientsNine = Arrays.asList(Ingredients.SALAMI, Ingredients.CELERY,
                Ingredients.TOMATO);
        List<Ingredients> ingredientsTen = Arrays.asList(Ingredients.MUSHROOMS, Ingredients.MOZZARELLA,
                Ingredients.TOMATO);

        Pizza pizzaOne = new Pizza(ingredientsOne, true, 450, "Margherita");
        Pizza pizzaTwo = new Pizza(ingredientsTwo, false, 580, "Home sweet home");
        Pizza pizzaThree = new Pizza(ingredientsThree, true, 500, "Celery");
        Pizza pizzaFour = new Pizza(ingredientsFour, true, 680, "Torino");
        Pizza pizzaFive = new Pizza(ingredientsFive, true, 750, "Old MacDonald Had a Farm");
        Pizza pizzaSix = new Pizza(ingredientsSix, true, 920, "Popular");
        Pizza pizzaSeven = new Pizza(ingredientsSeven, true, 899, "American");
        Pizza pizzaEight = new Pizza(ingredientsEight, false, 600, "Red");
        Pizza pizzaNine = new Pizza(ingredientsNine, false, 570, "Healthy");
        Pizza pizzaTen = new Pizza(ingredientsTen, true, 790, "European");

        List<Pizza> menu = Arrays.asList(pizzaOne, pizzaTwo, pizzaThree, pizzaFour, pizzaFive, pizzaSix, pizzaSeven,
                pizzaEight, pizzaNine, pizzaTen);

        System.out.println("List of vegan pizzas:");
        printVegan(menu);
        System.out.println();
        System.out.println("Pizza with allergens - celery: ");
        printContainsSeler(menu);
        System.out.println();
        System.out.println("We have pizzas with tomato and pepper: " + checkIsVeganAndContainsPomidorAndPapryka(menu));
        System.out.println();
        System.out.println("Whether all dishes contain mozzarella? " + doesContainsMozzarella(menu));
        System.out.println();
        getPizzaWithHighestCalories(menu);
        System.out.println();
        getPizzaWithLowestCalories(menu);


    }

    public static void printVegan(List<Pizza> menu) {
        Stream<Pizza> pizzaStream = menu.stream();
        pizzaStream.filter(pizza -> pizza.isVegan())
                .forEach(pizza -> System.out.println(pizza.getName()));
    }

    public static void printContainsSeler(List<Pizza> menu) {
        Stream<Pizza> pizzaStream = menu.stream();
        pizzaStream.filter(pizza -> pizza.getIngredients().contains(Ingredients.CELERY))
                .forEach(pizza -> System.out.println(pizza.getName()));
    }

    public static boolean checkIsVeganAndContainsPomidorAndPapryka(List<Pizza> menu) {
        Stream<Pizza> pizzaStream = menu.stream();
        return pizzaStream.anyMatch(pizza -> pizza.isVegan() && pizza.getIngredients().contains(Ingredients.TOMATO) && pizza.getIngredients().contains(Ingredients.PEPPERS));
    }

    public static boolean doesContainsMozzarella(List<Pizza> menu) {
        Stream<Pizza> pizzaStream = menu.stream();
        return pizzaStream.filter(pizza -> pizza.getIngredients().contains(Ingredients.MOZZARELLA))
                .count() == menu.size();
    }

    public static void getPizzaWithHighestCalories(List<Pizza> menu) {
        Pizza maxCalories = menu
                .stream()
                .max(Comparator.comparing(Pizza::getCalories))
                .orElseThrow();
        System.out.println("Pizza with highest calories is: " + maxCalories);
    }

    public static void getPizzaWithLowestCalories(List<Pizza> menu) {
        Pizza minCalories = menu
                .stream()
                .min(Comparator.comparing(Pizza::getCalories))
                .orElseThrow();
        System.out.println("Pizza with lowest calories is: " + minCalories);
    }
}