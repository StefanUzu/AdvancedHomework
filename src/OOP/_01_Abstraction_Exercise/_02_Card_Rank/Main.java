package OOP._01_Abstraction_Exercise._02_Card_Rank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        printRanks(input);

    }

    private static void printRanks(String input) {
        System.out.println(input + ":");
        for (int i = 0; i < 13; i++) {
            System.out.printf("Ordinal value: %d; Name value: %s%n",i , Rank.values()[i]);
        }
    }
}
