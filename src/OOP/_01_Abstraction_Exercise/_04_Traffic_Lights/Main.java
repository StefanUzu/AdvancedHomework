package OOP._01_Abstraction_Exercise._04_Traffic_Lights;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Lights[] lights = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(light -> Lights.valueOf(light))
                .toArray(Lights[]::new);
        int changeCount = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= changeCount; i++) {
            for (int j = 0; j < lights.length; j++) {
                System.out.print(Lights.values()[(lights[j].ordinal() + i)%3] + " " );
            }
            System.out.println();
        }
    }
}
