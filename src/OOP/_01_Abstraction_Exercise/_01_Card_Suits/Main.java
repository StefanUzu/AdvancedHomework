package OOP._01_Abstraction_Exercise._01_Card_Suits;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(input + ":");
        for (int i = 0; i < 4; i++) {
            System.out.printf("Ordinal value: %d; Name value: %s%n", i, CardSuits.values()[i]);
        }
    }
}
