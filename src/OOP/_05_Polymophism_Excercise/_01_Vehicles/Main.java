package OOP._05_Polymophism_Excercise._01_Vehicles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] carInfo = scanner.nextLine().split(" ");
        Car car = new Car(Double.parseDouble(carInfo[1]), Double.parseDouble(carInfo[2]));
        String[] truckInfo = scanner.nextLine().split( " ");
        Truck truck = new Truck(Double.parseDouble(truckInfo[1]), Double.parseDouble(truckInfo[2]));
        int commandCount = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < commandCount; i++) {
            String[] command = scanner.nextLine().split(" ");
            if ( command[0].equals("Drive")) {
                if ( command[1].equals("Car")) {
                    car.drive(Double.parseDouble(command[2]), car);

                } else { truck.drive(Double.parseDouble(command[2]), truck); }
            } else {
                if ( command[1].equals("Car")) {
                    car.refuel(Double.parseDouble(command[2]));
                } else { truck.refuel(Double.parseDouble(command[2])); }
            }
        }
        System.out.println("Car: " + car.getFuelQuantity());
        System.out.println("Truck: " + truck.getFuelQuantity());
    }
}

