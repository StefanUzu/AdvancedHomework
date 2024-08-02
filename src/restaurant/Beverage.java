package restaurant;

import java.math.BigDecimal;

public class Beverage extends Product{
    String name;
    BigDecimal price;
    double milliliters;

    public Beverage(String name, BigDecimal price, double milliliters) {
        super(name, price);
        this.milliliters = milliliters;
    }

    public double getMilliliters() {
        return milliliters;
    }
}
