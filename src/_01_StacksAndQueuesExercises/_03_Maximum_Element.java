package _01_StacksAndQueuesExercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class _03_Maximum_Element {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        ArrayDeque<Integer> helpStack = new ArrayDeque<>();
        int maxValue=0;
        int commandCount= Integer.parseInt(input);
        for (int i = 0; i < commandCount; i++) {
            input = scanner.nextLine();
            String[] command = input.split(" ");

            switch (command[0]){
                case "1":
                    stack.push(Integer.parseInt(command[1]));
                    break;
                case "2":
                    stack.pop();
                    break;
                case "3":
                    helpStack = stack.clone();
                    if (!helpStack.isEmpty()) {
                        maxValue = helpStack.peek();
                    }
                    while (!helpStack.isEmpty()){
                        if (helpStack.peek()>maxValue){
                            maxValue = helpStack.peek();
                        }
                        helpStack.pop();
                    }
                    System.out.println(maxValue);
                    break;

            }
        }
    }
}
