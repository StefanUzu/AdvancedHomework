package _01_StacksAndQueuesExercises;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class _05_BalancedParentheses {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        char[] input = scanner.nextLine().toCharArray();
        ArrayDeque<Character> deque = new ArrayDeque<>();
        for (int i = 0; i < input.length; i++) {
            if (deque.isEmpty()){
                if (!isOpener(input[i])) {
                    System.out.println("NO");
                    return;
                }
            }
            if (isOpener(input[i])){
                deque.push(input[i]);
                continue;
            }
            switch (input[i]){
                case ']':
                    if (deque.peek() == '['){
                        deque.pop();
                        break;
                    } else {
                        System.out.println("NO");
                        return;
                    }
                case ')':
                    if (deque.peek() == '('){
                        deque.pop();
                        break;
                    } else {
                        System.out.println("NO");
                        return;
                    }
                case '}':
                    if (deque.peek() == '{' ){
                        deque.pop();
                        break;
                    } else {
                        System.out.println("NO");
                        return;
                    }
            }

        }
        if (deque.isEmpty()){
            System.out.println("YES");
        }
    }

    public static boolean isOpener(char bracket){
        if (bracket == '(' || bracket == '[' || bracket == '{') return true;
        else return false;
    }
}
