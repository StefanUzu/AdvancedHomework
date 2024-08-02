package restaurant;

import java.math.BigDecimal;

public class HotBeverage extends Beverage{
    String name; BigDecimal price; double milliliters;
    public HotBeverage(String name, BigDecimal price, double milliliters) {
        super(name, price, milliliters);
    }
}
