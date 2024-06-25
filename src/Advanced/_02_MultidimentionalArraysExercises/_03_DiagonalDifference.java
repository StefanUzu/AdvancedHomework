package Advanced._02_MultidimentionalArraysExercises;

import java.util.Arrays;
import java.util.Scanner;

public class _03_DiagonalDifference {
    public static void  main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[][] matrix = new int[size][size];
        fillMatrix (matrix, scanner);
        System.out.println(Math.abs(firstDiagonal(matrix) - secondDiagonal(matrix)));
    }

    private static int firstDiagonal(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum+= matrix[i][i];
        }
        return sum;
    }
    private static int secondDiagonal(int[][] matrix) {
        int sum = 0;
        for (int i = matrix.length - 1; i >= 0; i--) {
            sum+= matrix[i][matrix.length-1 - i];
        }
        return sum;
    }
    private static void fillMatrix(int[][] matrix, Scanner scanner) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                matrix[row][col] = scanner.nextInt();
            }
        }
    }
}
