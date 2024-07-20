package OOP._02_Encapsulation_Exercise._03_Shopping_Spree;

import java.util.ArrayList;
import java.util.List;

public class Person {
    String name;
    double money;
    List<Product> products;

    Person (String name, double money) {
    setName(name);
    setMoney(money);
    this.products = new ArrayList<>();
    }

    public void setName(String name) {
        if (name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;

    }

    public void setMoney(double money) {
        if ( money >= 0) {
        this.money = money;
        return;
        }
        throw new IllegalArgumentException("Money cannot be negative");
    }

    public void buyProduct (Product product) {
        if (money >= product.getPrice()) {
            products.add(product);
            System.out.println( name + " bought " + product.getName());
            money = money - product.getPrice();
            return;
        }
        System.out.printf("%s can't afford %s%n",this.name, product.getName());
    }

    public String getName() {
        return name;
    }


    public String toString() {
        return String.format("%s - %s", name, listToString(products));
    }

    private String listToString (List<Product> products) {
        StringBuilder result = new StringBuilder("Nothing Bought");
        if (products.isEmpty()) { return result.toString();}
        result = new StringBuilder();
        for (Product p : products) {
            result.append(", ").append(p.getName());
        }
        return result.delete(0,2).toString();
    }
}
