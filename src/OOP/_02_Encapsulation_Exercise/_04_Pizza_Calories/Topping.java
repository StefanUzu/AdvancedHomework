package OOP._02_Encapsulation_Exercise._04_Pizza_Calories;

public class Topping {
    private String toppingType;
    private double weight;

    Topping(String toppingType, double weight) {
        setToppingType(toppingType);
        setWeight(weight);
    }

    private void setToppingType(String toppingType) {
        this.toppingType = toppingType;
    }

    private void setWeight(double weight) {
        this.weight = weight;
    }
}
