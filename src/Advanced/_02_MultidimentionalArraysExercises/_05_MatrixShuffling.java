package Advanced._02_MultidimentionalArraysExercises;

import java.util.Arrays;
import java.util.Scanner;

public class _05_MatrixShuffling {
    public static void  main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] size = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String[][] matrix = new String[size[0]][size[1]];
        fillMatrix(matrix, scanner);
        String[] commandInput = scanner.nextLine().split(" ");
        while (!commandInput[0].equals("END")){
            if (commandInput[0].equals("swap") && commandIsValid(commandInput)){
                swapElements(commandInput, matrix);
            } else {System.out.println("Invalid input!");}
            commandInput = scanner.nextLine().split(" ");
        }
    }

    private static boolean commandIsValid(String[] commandInput) {
        return commandInput.length != 5;
    }

    private static void swapElements(String[] commandInput, String[][] matrix) {
        int indexRow1 = Integer.parseInt(commandInput[1]);
        int indexRow2 = Integer.parseInt(commandInput[2]);
        int indexCol1 = Integer.parseInt(commandInput[3]);
        int indexCol2 = Integer.parseInt(commandInput[4]);
        String valueHolder;
        try {
            valueHolder = matrix[indexRow1][indexCol1];
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        matrix[indexRow1][indexCol1] = matrix[indexRow2][indexCol2];
        matrix[indexRow2][indexCol2] = valueHolder;

    }

    private static void fillMatrix(String[][] matrix, Scanner scanner) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col]= Arrays.toString(scanner.nextLine().split(" "));
            }
        }
    }
}
