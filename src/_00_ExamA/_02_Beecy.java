package _00_ExamA;

import java.util.Scanner;

public class _02_Beecy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        String[][] map = new String[size][size];
        map = fillMatrix(map, scanner);
        int[] currentPosition = getStart(map);
        int energy = 15;
        int nectarCollected = 0;
        String input = scanner.nextLine();

        while (energy > 0) {
            int[] direction = getDirection(input);

            String event = map[currentPosition[0]+direction[0]][currentPosition[1]+direction[1]];
            if (event.equals("H")){
                map[currentPosition[0]][currentPosition[1]] = "-";
                currentPosition = makeMove(currentPosition, direction, size);
                map[currentPosition[0]][currentPosition[1]] = "B";
                break;
            } else {
                if (event.equals("-")){
                    map[currentPosition[0]][currentPosition[1]] = "-";
                    currentPosition = makeMove(currentPosition, direction, size);
                    map[currentPosition[0]][currentPosition[1]] = "B";
                } else {
                    map[currentPosition[0]][currentPosition[1]] = "-";
                    currentPosition = makeMove(currentPosition, direction, size);
                    nectarCollected += Integer.parseInt(event);
                    map[currentPosition[0]][currentPosition[1]] = "B";
                }
            }
            energy--;
            input = scanner.nextLine();
        }
        if (nectarCollected<30){
            System.out.println("Beesy did not manage to collect enough nectar.");
            printMap(map);
        } else {}
    }

    private static String[][] fillMatrix(String[][] map, Scanner scanner) {

        String line = "";
        for (int row = 0; row < map.length; row++) {
            line = scanner.nextLine();
            for (int col = 0; col < map.length; col++) {
                map[row][col] = String.valueOf(line.charAt(col));
            }
        }
        return map;
    }

    private static int[] getStart(String[][] map) {
        int[] start = {0, 0};
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                if (map[i][j].equals("B")) {
                    start[0] = i;
                    start[1] = j;
                }
            }
        }
        return start;
    }

    private static int[] getDirection(String input) {
        int[] direction = {0, 0};
        switch (input) {
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
}