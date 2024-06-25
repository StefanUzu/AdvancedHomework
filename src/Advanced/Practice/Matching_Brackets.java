package Advanced.Practice;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Matching_Brackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> indexes = new ArrayDeque<>();
        String input = scanner.nextLine();
        char[] expression = input.toCharArray();
        for (int i = 0 ; i < expression.length ; i++){
            if (expression[i] == '('){
                indexes.push(i);
            }
            if (expression[i] == ')'){
                for (int j = indexes.pop() ; j <= i ; j ++ ){
                    System.out.print(expression[j]);
                }
                System.out.println();
            }
        }

    }
}
