package restaurant;

import java.math.BigDecimal;

public class Coffee extends HotBeverage{
    private final double COFFEE_MILLILITERS = 50;
    public final BigDecimal COFFEE_PRICE = BigDecimal.valueOf(3.50);
    double caffeine;

    public Coffee(String name, BigDecimal price, double milliliters) {
        super(name, price, milliliters);
    }

    public double getCaffeine() {
        return caffeine;
    }
}
