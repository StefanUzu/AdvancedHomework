package _00_ExamA;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class _01_One {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> packages = new ArrayDeque<>();
        fillArrayDeque(scanner, packages::push);
        ArrayDeque<Integer> couriers = new ArrayDeque<>();
        fillArrayDeque(scanner, couriers::offer);
        int totalWeightDelivered = 0;
        while (!packages.isEmpty() && !couriers.isEmpty()){
            int capacity = couriers.peek();
            int pack = packages.peek();
            if ( capacity >= pack){
                capacity -= pack*2;
                couriers.poll();
                if (capacity>0){
                    couriers.add(capacity);
                }
                totalWeightDelivered += pack;
                packages.pop();
                continue;
            }
            pack -= capacity;
            packages.pop();
            packages.push(pack);
            totalWeightDelivered+= capacity;
            couriers.poll();
        }
        System.out.println("Total weight: "+totalWeightDelivered+" kg");
        if (packages.isEmpty() && couriers.isEmpty()){
            System.out.println("Congratulations, all packages were delivered successfully by the couriers today.");
        } else {
            if (couriers.isEmpty()){
                System.out.print("Unfortunately, there are no more available couriers to deliver the following packages:");
                while (!packages.isEmpty()){
                    System.out.print(" " + packages.poll()  );
                    if (packages.isEmpty()){return;}
                    else {
                        System.out.print(",");
                    }
                }
            } else {
                System.out.print("Couriers are still on duty:");
                while (!couriers.isEmpty()){
                    System.out.print(" " + couriers.poll() );
                    if (couriers.isEmpty()){
                        System.out.print(" but there are no more packages to deliver.");
                        return;
                    }
                    else {
                        System.out.print(",");
                    }
                }
            }

        }
    }
    public static void fillArrayDeque(Scanner scanner, Consumer<Integer> insertion) {
        Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .forEach(insertion);
    }
}
