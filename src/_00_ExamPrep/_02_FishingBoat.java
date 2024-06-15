package _00_ExamPrep;

import java.util.Arrays;
import java.util.Scanner;

import static jdk.internal.icu.lang.UCharacter.getDirection;

public class _02_FishingBoat {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        String[][] map = new String[size][size];
        int[] currentPosition = (fillMatrix(map, scanner));
        String input = scanner.nextLine();
        while (!input.equals("collect the neta")){
            int[] direction = getDirection(input);
            String event = getEvent(map , currentPosition, direction);
            resolveEvent(map)
            input = scanner.nextLine();
        }
    }

    private static String getEvent(String[][] map, int[] currentPosition, int[] direction) {
        String event;
        event = map[currentPosition[0]+direction[0]][currentPosition[1]+direction[1]];
        return event;
    }

    private static int[] getDirection(String input) {
        int[] direction = {0,0};
        switch (input){
            case "up":
                direction[1] = -1;
                break;
            case "down":
                direction[1] = 1;
                break;
            case "left":
                direction[0] = -1;
                break;
            case "right":
                direction[0] = 1;
                break;
        }
        return direction;
    }

    private static int[] fillMatrix(String[][] matrix, Scanner scanner) {
        int[] start= {0 , 0};
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col]= Arrays.toString(scanner.nextLine().split(" "));
                if (matrix[row][col].equals("s")) {
                    start[0] = row;
                    start[1] = col;
                }
                }
            }
        return start;
        }
}

