package OOP._02_Encapsulation_Exercise._04_Pizza_Calories;

public class Topping {
    private String toppingType;
    private double weight;

    Topping(String toppingType, double weight) {
        setToppingType(toppingType);
        setWeight(weight, toppingType);
    }

    private void setToppingType(String toppingType) {
        try { Topping_Modifiers.valueOf(toppingType);
            this.toppingType = toppingType;
        } catch (Exception e) {
            throw new IllegalArgumentException(String.format("Cannot place %s on top of your pizza." , toppingType));
        }

    }

    private void setWeight(double weight, String toppingType) {
        if (weight >= 1 && weight <= 50) {
            this.weight = weight;
            return;
        }
        throw new IllegalArgumentException(String.format("%s weight should be in the range [1..50].",toppingType));
    }

    public double toppingCalories() {
        double toppingMod = Topping_Modifiers.valueOf(this.toppingType).getToppingModifiers();
        return this.weight * toppingMod;
    }
}
