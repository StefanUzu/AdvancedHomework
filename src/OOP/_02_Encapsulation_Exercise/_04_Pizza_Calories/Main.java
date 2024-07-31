package OOP._02_Encapsulation_Exercise._04_Pizza_Calories;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputPizza = scanner.nextLine();
        String pizzaName = inputPizza.split(" ")[1];
        int numberOfToppings = Integer.parseInt(inputPizza.split(" ")[2]);


        String inputDough = scanner.nextLine();
        String doughType = inputDough.split(" ")[1];
        String doughBakingTech = inputDough.split(" ")[2];
        double doughWeight = Double.parseDouble(inputDough.split(" ")[3]);

        Pizza pizza = new Pizza(pizzaName, numberOfToppings);
        Dough dough = new Dough(doughType, doughBakingTech, doughWeight);
        pizza.setDough(dough);

        String inputTopping = scanner.nextLine();
        while (!inputTopping.equals("END")) {
            String topping = inputTopping.split(" ")[1];
            double weight = Double.parseDouble(inputTopping.split(" ")[2]);
            Topping pizzaTopping = new Topping(topping, weight);
            pizza.addTopping(pizzaTopping);
            inputTopping = scanner.nextLine();
        }

        System.out.println(pizza);

    }
}
