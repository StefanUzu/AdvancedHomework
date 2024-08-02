package restaurant;

import java.math.BigDecimal;

public class Soup extends Starter{
    String name; BigDecimal price; double grams;
    public Soup(String name, BigDecimal price, double grams) {
        super(name, price, grams);
    }
}
