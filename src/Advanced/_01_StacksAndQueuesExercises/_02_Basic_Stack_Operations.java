package Advanced._01_StacksAndQueuesExercises;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class _02_Basic_Stack_Operations {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        String input = scanner.nextLine();
        String[] parameters = input.split(" ");
        int toPushCount = Integer.parseInt(parameters[0]);
        int toPopCount = Integer.parseInt(parameters[1]);
        int toCheck = Integer.parseInt(parameters[2]);
        int[] numbersLine = Arrays.stream(scanner.nextLine().split(" +")).mapToInt(Integer::parseInt).toArray();

        //Arrays.stream(scanner.nextLine().split(" +")).mapToInt(Integer::parseInt).forEach(stack::push);
        for (int i = 0; i < toPushCount || i < numbersLine.length; i++) {
            stack.push(numbersLine[i]);
        }
        for (int i = 0; i < toPopCount && !stack.isEmpty(); i++) {
            stack.pop();
        }
        if (stack.isEmpty()){
            System.out.println(0);
            return;
        }
        int smallest = stack.peek();
        while (!stack.isEmpty()) {
            if (toCheck == stack.peek()) {
                System.out.println("true");
                return;
            } else {
                if (smallest > stack.peek()){
                    smallest = stack.peek();
                }
                stack.pop();
            }
        }
        System.out.println(smallest);
    }
}
