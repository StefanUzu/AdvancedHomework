package animals;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Scanner scanner = new Scanner(System.in);
        String animalInput = "";
        List<Animal> animals = new ArrayList<>();
        while (true) {
            animalInput = scanner.nextLine();
            if (animalInput.equals("Beast!")) break;
            String input = scanner.nextLine();
            String name = input.split(" ")[0];
            int age = Integer.parseInt(input.split(" ")[1]);
            String gender = input.split(" ")[2];

            Class<?> clazz = Class.forName("animals." + animalInput );

            Constructor<?> constructor = clazz.getDeclaredConstructor(String.class, int.class, String.class);
            Object object = constructor.newInstance(name,age,gender);
            if (!name.isEmpty() && !name.isBlank() && age >= 0 && (gender.equals("Male") || gender.equals("Female") )) {
                animals.add((Animal) object);

            }
       }
        animals.forEach(animal -> System.out.println(animal.toString()));
    }
}
