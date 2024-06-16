package _00_ExamPrep;
import java.util.List;
import java.util.Arrays;
import java.util.Scanner;

public class _01_Wormholes {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        List<Integer> worms = Arrays.stream(scanner.nextLine().split(" ")).map(Integer :: parseInt).toList();
        List<Integer> holes = Arrays.stream(scanner.nextLine().split(" ")).map(Integer :: parseInt).toList();



    }
}
