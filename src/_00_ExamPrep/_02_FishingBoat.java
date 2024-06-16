package _00_ExamPrep;

import java.util.Arrays;
import java.util.Scanner;

public class _02_FishingBoat {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        String[][] map = new String[size][size];
        map = fillMatrix(map , scanner);
        int[] currentPosition = getStart(map);
        // System.out.println(Arrays.toString(currentPosition));
        String input = scanner.nextLine();
        int fishCaught = 0;
        while (!input.equals("collect the nets")){
            int[] direction = getDirection(input);
            String[] event = getEvent(map , currentPosition, direction);
            switch(event[0]){
                case "-", "S":
                    currentPosition[0]+= Integer.parseInt(event[1]);
                    currentPosition[1]+= Integer.parseInt(event[2]);
                    break;
                case "W":
                    currentPosition[0]+= Integer.parseInt(event[1]);
                    currentPosition[1]+= Integer.parseInt(event[2]);
                    System.out.printf("You fell into a whirlpool! The ship sank and you lost the fish you caught. Last coordinates of the ship: [%d,%d]", currentPosition[0], currentPosition[1] );
                    fishCaught = 0;
                    return;
                default:
                    fishCaught += Integer.parseInt(event[0]);
                    currentPosition[0]+= Integer.parseInt(event[1]);
                    currentPosition[1]+= Integer.parseInt(event[2]);
                    map[currentPosition[0]][currentPosition[1]] = "-";
            }

            input = scanner.nextLine();
        }
        if (fishCaught >= 20){
            System.out.println("Success! You managed to reach the quota!");
            System.out.printf("%nAmount of fish caught: %d tons.", fishCaught);
        } else {
            System.out.printf("You didn't catch enough fish and didn't reach the quota!%nYou need %d tons of fish more.", 20 - fishCaught);
        }
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

    private static String[] getEvent(String[][] map, int[] currentPosition, int[] direction) {
        String[] event = {"","",""};
        int row = 0;
        if (currentPosition[0]+direction[0] < map.length-1 || currentPosition[0]+direction[0] > 0 ) {
            row = currentPosition[0] + direction[0];
        } else {
            if (currentPosition[0] + direction[0] < 0){
                row = map.length-1;
            }
        }
        int col = 0;
        if (currentPosition[1]+direction[1] < map.length-1 || currentPosition[1]+direction[1] > 0 ) {
            col = currentPosition[1] + direction[1];
        } else {
            if (currentPosition[1] + direction[1] < 0){
                col = map.length-1;
            }
        }
        event[0] = map[row][col];
        event[1] = Integer.toString(row);
        event[2] = Integer.toString(col);
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

