package OOP._02_Encapsulation_Exercise._03_Shopping_Spree;

public class Product {
    private String name;
    private double price;

    Product(String name, double price) {
        setName(name);
        setPrice(price);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Cost cannot be negative");
        }
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
