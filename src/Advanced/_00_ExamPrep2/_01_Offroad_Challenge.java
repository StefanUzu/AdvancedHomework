package Advanced._00_ExamPrep2;

import java.util.ArrayDeque;
import java.util.Scanner;

public class _01_Offroad_Challenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        ArrayDeque<Integer> initialFuel = new ArrayDeque<>();
        for (int i = 0; i < input.length; i++) {
            initialFuel.push(Integer.parseInt(input[i]));
        }

        ArrayDeque<Integer> additionalConsumption = new ArrayDeque<>();
        input = scanner.nextLine().split(" ");
        for (int i = 0; i < input.length; i++) {
            additionalConsumption.offer(Integer.parseInt(input[i]));

        }
        ArrayDeque<Integer> quantities = new ArrayDeque<>();
        input = scanner.nextLine().split(" ");
        for (int i = 0; i < input.length; i++) {
            quantities.offer(Integer.parseInt(input[i]));

        }
        int counter = 0;
        while (!initialFuel.isEmpty() && !additionalConsumption.isEmpty() && !quantities.isEmpty()){
            if (initialFuel.pop() - additionalConsumption.poll() >= quantities.peek()){
                counter++;
                System.out.println("John has reached: Altitude " + counter);
                quantities.poll();
            } else {
                System.out.println("John did not reach: Altitude " + (counter + 1));
                System.out.println("John failed to reach the top.");
                break;
            }
        }
        if ( quantities.isEmpty()){
            System.out.println("John has reached all the altitudes and managed to reach the top!");
        } else {
            System.out.print("Reached altitudes: ");
            for (int i = 1; i <= counter; i++) {
                System.out.print("Altitude " + i);
                if ( i <counter ) System.out.print(", ");
            }
        }

    }
}