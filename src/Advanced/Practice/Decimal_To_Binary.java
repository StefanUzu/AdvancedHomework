package Advanced.Practice;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Decimal_To_Binary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> stack = new ArrayDeque<>();
        int input = Integer.parseInt(scanner.nextLine());
        if (input == 0){
            System.out.println(0);
            return;
        }
        while (input>0){
            if (input%2==0){
                stack.push("0");
                input = input / 2;
            } else {
                stack.push("1");
                input = input / 2;
            }
        }
        while(!stack.isEmpty()){
            System.out.print(stack.pop());
        }
    }
}
