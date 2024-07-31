package OOP._02_Encapsulation_Exercise._04_Pizza_Calories;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String name;
    private Dough dough;
    private List<Topping> toppings;

     Pizza(String name, int numberOfToppings) {
        setToppings(numberOfToppings);
        setName(name);

    }

    private void setToppings(int numberOfToppings) {
        if (numberOfToppings >= 0 && numberOfToppings <= 10) {
            this.toppings = new ArrayList<>();
            return;
        }
        throw new IllegalArgumentException("Number of toppings should be in range [0..10].");
    }

    private void setName (String name) {
         if (isNameIsValid(name)){
             this.name = name;
             return;
         }
         throw new IllegalArgumentException("Pizza name should be between 1 and 15 symbols.");
    }

    private static boolean isNameIsValid(String name) {
         if (name.trim().isEmpty()) { return false;}
         if (name.length() > 15) { return  false;}
         return true;
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }
    public String getName() {
         return this.name;
    }

    public void addTopping(Topping topping) {
         toppings.add(topping);
    }

    public double getOverallCalories(Dough dough) {
         double doughCalories = dough.calculateCalories();
         double toppingsCalories = toppings.stream()
                 .mapToDouble(Topping::toppingCalories)
                 .sum();
         return 2 * doughCalories + 2 * toppingsCalories;
    }

    @Override
    public String toString() {
         return String.format("%s - %.2f",this.name ,getOverallCalories(dough) );
    }

}
