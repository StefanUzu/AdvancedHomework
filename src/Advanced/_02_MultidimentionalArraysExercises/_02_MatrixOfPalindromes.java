package Advanced._02_MultidimentionalArraysExercises;

import java.util.Arrays;
import java.util.Scanner;

public class _02_MatrixOfPalindromes {
    public static void main(String[] args){
        Scanner scanner =  new Scanner(System.in);
        int[] size = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer :: parseInt).toArray();
        String[][] matrix = new String[size[0]][size[1]];
        FillMatrix(matrix,size);
        printMatrix(matrix,size);

    }
    public static void printMatrix(String[][] matrix, int[] size){
        for (int row = 0; row < size[0]; row++) {
            for (int col = 0; col < size[1]; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    public static void FillMatrix(String[][] matrix, int[] size){
        for (int col = 0; col < size[1]; col++) {
            for (int row = 0; row < size[0]; row++) {
                char firstLetter = (char) (97 + row);
                char secondLetter = (char) (97 + row + col);
                matrix[row][col] = String.format("%c%c%c", firstLetter, secondLetter, firstLetter);
            }
            System.out.println();
        }
    }


}
