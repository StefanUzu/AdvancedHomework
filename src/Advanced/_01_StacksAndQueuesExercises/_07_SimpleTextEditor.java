package Advanced._01_StacksAndQueuesExercises;
import java.util.ArrayDeque;
import java.util.Scanner;
public class _07_SimpleTextEditor {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> stack = new ArrayDeque<>();
        int numberOfEntries = Integer.parseInt(scanner.nextLine());
        StringBuilder text = new StringBuilder();

        for (int i = 0; i < numberOfEntries; i++) {
            String[] command = scanner.nextLine().split(" ");
            switch (command[0]){
                case "1":
                    stack.push(text.toString());
                    text.append(command[1]);
                    break;
                case "2":
                    stack.push(text.toString());
                    text.delete(text.length() - Integer.parseInt(command[1]),text.length());
                    break;
                case "3":
                    System.out.println(text.charAt(Integer.parseInt(command[1])-1));
                    break;
                case "4":
                    while (!stack.isEmpty()){
                        text.delete(0, text.length());
                        text.append(stack.pop());
                        break;
                    }

            }
        }
    }

}
