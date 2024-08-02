package Interface_Person;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);
       String input = scanner.nextLine();

        List<Birthable> birthables = new ArrayList<>();
       while (!input.equals("End")) {
           String typePerson = input.split(" ")[0];

           switch (typePerson) {
               case "Citizen":
                   String name = input.split(" ")[1];
                   int age = Integer.parseInt(input.split(" ")[2]);
                   String id = input.split(" ")[3];
                   String birthDate = input.split(" ")[4];

                   Birthable citizen = new Citizen(name, age, id, birthDate);
                   birthables.add(citizen);
                   break;

               case "Pet":
                   String namePet = input.split(" ")[1];
                   String birthDatePet = input.split(" ")[4];

                   Birthable pet = new Pet(namePet, birthDatePet);
                   birthables.add(pet);
                   break;
           }
           input = scanner.nextLine();
       }
       String yearOfBirth = scanner.nextLine();
       birthables.stream()
               .filter(birthable -> birthable.getBirthDate().endsWith(yearOfBirth))
               .forEach(birthable -> System.out.println(birthable.getBirthDate()));

    }

}
