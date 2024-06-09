package _02_MultidimentionalArraysExercises;

import java.util.Arrays;
import java.util.Scanner;

public class _05_MatrixShuffling {
    public static void  main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] size = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String[][] matrix = new String[size[0]][size[1]];
        fillMatrix(matrix, scanner);
        String commandInput = scanner.nextLine();
        while (!commandInput.equals("END")){

            commandInput = scanner.nextLine();
        }
    }
    private static void fillMatrix(String[][] matrix, Scanner scanner) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col]= Arrays.toString(scanner.nextLine().split(" "));
            }
        }
    }
}
