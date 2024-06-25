package Advanced._02_MultidimentionalArraysExercises;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class _04_MaximalSum {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] size = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[][] matrix = new int[size[0]][size[1]];
        fillMatrix(matrix, scanner);
        int[] result = maximalSum(matrix);
        System.out.println("Sum = " + result[0]);
        printMaxMatrix(matrix, result[1], result[2]);
    }

    private static void printMaxMatrix(int[][] matrix, int row, int col) {
        for (int i = row; i < row + 3; i++) {
            for (int j = col; j < col +3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

    private static int[] maximalSum(int[][] matrix) {
        int[] maximalSum = { 0 , 0 , 0};
        int currentSum = 0;
        for (int row = 0; row < matrix.length - 2; row++) {
            for (int col = 0; col < matrix[row].length - 2; col++) {
                currentSum = squareSum(matrix, row, col);
                if (currentSum > maximalSum[0]) {
                    maximalSum[0] = currentSum;
                    maximalSum[1] = row;
                    maximalSum[2] = col;
                }
            }

        }
        return maximalSum;
    }

    private static int squareSum(int[][] matrix, int row, int col) {
        int sum = 0;
        for (int i = row; i < row + 3; i++) {
            for (int j = col; j < col + 3; j++) {
                sum+= matrix[i][j];
            }
        }
        return sum;
    }

    private static void fillMatrix(int[][] matrix, Scanner scanner) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col]=scanner.nextInt();
            }
        }
    }
}
