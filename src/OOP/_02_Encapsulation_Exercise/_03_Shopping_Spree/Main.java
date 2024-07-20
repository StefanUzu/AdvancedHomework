package OOP._02_Encapsulation_Exercise._03_Shopping_Spree;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> people = new ArrayList<>();
        List<Product> products = new ArrayList<>();

        String input = scanner.nextLine();
        for (String personInfo : input.split(";")) {
            String name = personInfo.split("=")[0];
            double money = Double.parseDouble(personInfo.split("=")[1]);
            Person person = new Person(name, money);
            people.add(person);
        }

        input = scanner.nextLine();
        for (String productInfo : input.split(";")) {
            String name = productInfo.split("=")[0];
            double cost = Double.parseDouble(productInfo.split("=")[1]);
            Product product = new Product(name, cost);
            products.add(product);
        }

        input = scanner.nextLine();
        while (!input.equals("END")) {
            String buyer = input.split(" ")[0];
            String bought = input.split(" ")[1];

            Person person = people.stream()
                    .filter(p -> p.getName()
                    .equals(buyer)).findFirst()
                    .get();
            Product product = products.stream()
                    .filter(p -> p.getName()
                    .equals(bought)).findFirst()
                    .get();

            person.buyProduct(product);

            input = scanner.nextLine();
        }
        for (Person person : people) {
            System.out.println(person.toString());
        }

    }
}
