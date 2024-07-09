package OOP._01_Abstraction_Exercise._05_Jedi_Galaxy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            int[] dimensions = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int[][] matrix = new int[dimensions[0]][dimensions[1]];
            fillMatrix(matrix);
            int starsCollected = 0;
            String command = scanner.nextLine();
            while (!command.equals("Let the Force be with you")) {
                int[] jediStart = Arrays.stream(command.split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();
                int[] evilStart = Arrays.stream(scanner.nextLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();
                evilActions( evilStart, matrix );
                starsCollected+= jediActions( jediStart, matrix );
                command = scanner.nextLine();
            }
        System.out.println(starsCollected);
    }

    private static int jediActions(int[] start, int[][] matrix ) {
        int starsCollected = 0;
        int row = start[0];
        int col = start[1];
        while (row >= 0 && col < matrix[1].length) {
            if (row < matrix.length &&  col >= 0 ) {
                starsCollected+= matrix[row][col];
            }
            row--;
            col++;
        }
        return starsCollected;
    }

    private static void fillMatrix(int[][] matrix) {
        int filler = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = filler++;
            }
        }
    }
    private static void evilActions(int[] start, int[][] matrix) {
        int row = start[0];
        int col = start[1];
        while (row >= 0 && col >= 0) {
            if ( row < matrix.length && col < matrix[0].length) {
                matrix[row][col] = 0;
            }
            row--;
            col--;
        }
    }
}
