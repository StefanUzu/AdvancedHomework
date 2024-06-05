package _01_StacksAndQueuesExercises;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class _04_BasicQueueOperations {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] commands = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer :: parseInt).toArray();
        int[] elements = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer :: parseInt).toArray();

        ArrayDeque<Integer> queue = new ArrayDeque<>();

        for (int i = 0; i < commands[0] ; i++) {
            queue.add(elements[i]);
        }

        for (int i = 0; i < commands[1] && !queue.isEmpty(); i++) {
            queue.poll();
        }
        boolean isPresent = false;
        int lowestElement=0;
        while (!queue.isEmpty()){
            lowestElement = queue.peek();
            if (commands[2] == queue.poll()){
                isPresent = true;
                System.out.println(isPresent);
                return;
            }
        }
        System.out.println(lowestElement);
    }
}
