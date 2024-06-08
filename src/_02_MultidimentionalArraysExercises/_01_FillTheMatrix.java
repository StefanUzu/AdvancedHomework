package _02_MultidimentionalArraysExercises;

import java.util.Scanner;

public class _01_FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] command = scanner.nextLine().split(", ");
        int size = Integer.parseInt(command[0]);
        int[][] matrix = new int[size][size];
        switch (command[1]){
            case "A":
                    patternA(matrix,size);
                    printMatrix(matrix, size);
                    break;
            case "B":
                    patternB(matrix,size);
                    printMatrix(matrix, size);
                    break;
        }
    }
    public static void patternA(int[][] matrix, int size){
        int value = 1;
        for (int col = 0 ; col < size; col++) {
            for (int row = 0; row < size; row++) {
                matrix[row][col] = value;
                value++;
            }
        }
    }
    public static void patternB(int[][] matrix, int size){
        int value = 1;
        for (int col = 0; col < size; col++) {
            for (int row = 0; row < size; row++) {
                matrix[row][col] = value;
                value++;
            }
            col++;
            if (col==size) break;
            for (int row = size-1; row >= 0; row--) {
                matrix[row][col] = value;
                value++;
            }

        }
    }

    public static void printMatrix(int[][] matrix, int size){
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
