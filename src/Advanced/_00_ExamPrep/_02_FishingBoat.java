package Advanced._00_ExamPrep;

import java.util.Arrays;
import java.util.Scanner;

public class _02_FishingBoat {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        String[][] map = new String[size][size];
        map = fillMatrix(map , scanner);
        int[] currentPosition = getStart(map);
        int fishCaught = 0;
        // System.out.println(Arrays.toString(currentPosition));
        String input = scanner.nextLine();

        while (!input.equals("collect the nets")){
            int[] direction = getDirection(input);
            map[currentPosition[0]][currentPosition[1]] = "-";
            currentPosition = makeMove(currentPosition, direction, size);
            String event = map[currentPosition[0]][currentPosition[1]];
            if (event.equals("W")){
                System.out.printf("You fell into a whirlpool! The ship sank and you lost the fish you caught. Last coordinates of the ship: [%d,%d]", currentPosition[0], currentPosition[1]);
                return;
            }
            if (event.equals("-")){

                input = scanner.nextLine();
                //printMap(map);
                continue;
            }
            fishCaught+= Integer.parseInt(event);
            map[currentPosition[0]][currentPosition[1]] = "-";
            //printMap(map);
            input = scanner.nextLine();
        }
        if (fishCaught >= 20){
            System.out.println("Success! You managed to reach the quota!");
            } else {
            System.out.printf("You didn't catch enough fish and didn't reach the quota! You need %d tons of fish more.%n", 20 - fishCaught);
        }
        System.out.printf("Amount of fish caught: %d tons.%n", fishCaught);
        printMap(map);
    }

    private static int[] makeMove(int[] currentPosition, int[] direction, int size) {
        int[] newPosition = {currentPosition[0],currentPosition[1]};
        int row = 0;
        if (currentPosition[0]+direction[0] < size && currentPosition[0]+direction[0] >= 0 ) {
            row = currentPosition[0] + direction[0];
        } else {
            if (currentPosition[0] + direction[0] < 0){
                row = size-1;
            }
        }
        int col = 0;
        if (currentPosition[1]+direction[1] < size && currentPosition[1]+direction[1] >= 0 ) {
            col = currentPosition[1] + direction[1];
        } else {
            if (currentPosition[1] + direction[1] < 0){
                col = size-1;
            }
        }
        newPosition[0] = row;
        newPosition[1] = col;
        return newPosition;
    }


    private static void printMap(String[][] map) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                  System.out.print(map[i][j]) ;
            }
            System.out.println();
        }
    }

    private static int[] getStart(String[][] map) {
        int[] start = {0,0};
        for (int i = 0; i < map.length ; i++) {
            for (int j = 0; j < map.length; j++) {
                if  (map[i][j].equals("S")) {
                    start[0] = i;
                    start[1] = j;
                }
            }
        }
        return start;
    }


    private static int[] getDirection(String input) {
        int[] direction = {0,0};
        switch (input){
            case "up":
                direction[0] = -1;
                break;
            case "down":
                direction[0] = 1;
                break;
            case "left":
                direction[1] = -1;
                break;
            case "right":
                direction[1] = 1;
                break;
        }
        return direction;
    }

    private static String[][] fillMatrix(String[][] map, Scanner scanner) {

        String line = "";
        for (int row = 0; row < map.length; row++) {
            line = scanner.nextLine();
            for (int col = 0; col < map.length; col++) {
                map[row][col]= String.valueOf(line.charAt(col));
            }
        }
        return map;
    }
}

