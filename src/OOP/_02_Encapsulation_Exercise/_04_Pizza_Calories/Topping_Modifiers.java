package OOP._02_Encapsulation_Exercise._04_Pizza_Calories;

public enum Topping_Modifiers {
    Meat(1.2), Veggies(0.8), Cheese(1.1), Sauce(0.9);
    private final double toppingModifier;

    Topping_Modifiers(double toppingModifier) {
        this.toppingModifier = toppingModifier;
    }

    public double getToppingModifiers() {
        return toppingModifier;
    }
}
