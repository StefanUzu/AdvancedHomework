package Advanced._01_StacksAndQueuesExercises;

import java.util.Scanner;

public class _06_RecursiveFibonacci {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        System.out.println(findNthFibonacci(n));
    }
    public static int findNthFibonacci(int n) {
        int[] fib = new int[n + 1];
        fib[0] = 1;
        fib[1] = 1;
        for (int i = 2; i <= n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib[n];
    }
}
