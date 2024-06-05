package _01_StacksAndQueues.Practice;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Simple_Calculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> stack = new ArrayDeque<>();
        int sum = 0;
        int holdThis = 0;
        String input = scanner.nextLine();
        String[] elements = input.split(" ");
        for (int i = elements.length-1;i>=0 ; i --){
            stack.add(elements[i]);
        }
        while(!stack.isEmpty()){
            switch (stack.peek()){
                case "+":
                    sum += holdThis;
                    stack.pop();
                    break;
                case "-":
                    sum -= holdThis;
                    stack.pop();
                    break;
                default:
                    holdThis= Integer.parseInt(stack.peek());
                    stack.pop();
            }
        }
        sum += holdThis;
        System.out.println(sum);
    }
}
