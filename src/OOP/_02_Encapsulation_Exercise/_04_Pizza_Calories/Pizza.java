package OOP._02_Encapsulation_Exercise._04_Pizza_Calories;

import java.util.List;

public class Pizza {
    private String name;
    private Dough dough;
    private List<Topping> toppings;

     Pizza(String name, int numberOfToppings) {

    }

    private void setToppings(int numberOfToppings) {

    }

    private void setName (String name) {
         this.name = name;
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

    public double getOverallCalories() {
         return 100.01;
    }
}
