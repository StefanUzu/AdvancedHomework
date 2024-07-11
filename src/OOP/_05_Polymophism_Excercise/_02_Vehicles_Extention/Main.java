package OOP._05_Polymophism_Excercise._02_Vehicles_Extention;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] carInfo = scanner.nextLine().split(" ");
        Car car = new Car(Double.parseDouble(carInfo[1]), Double.parseDouble(carInfo[2]), Double.parseDouble(carInfo[3]));
        String[] truckInfo = scanner.nextLine().split( " ");
        Truck truck = new Truck(Double.parseDouble(truckInfo[1]), Double.parseDouble(truckInfo[2]), Double.parseDouble(truckInfo[3]));
        String[] busInfo = scanner.nextLine().split(" ");
        Bus bus = new Bus(Double.parseDouble(busInfo[1]), Double.parseDouble(busInfo[2]), Double.parseDouble(busInfo[3]));
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        int commandCount = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < commandCount; i++) {
            String[] command = scanner.nextLine().split(" ");
            String action = command[0];
            String vehicle = command[1];
            double actionValue = Double.parseDouble(command[2]);

            switch (vehicle) {
                case "Car":
                    if (action.equals("Drive")){
                        car.drive(actionValue);
                        break;
                    }
                    if (action.equals("Refuel")) {
                        car.refuel(actionValue);
                        break;
                    }
                case "Truck":
                    if (action.equals("Drive")) {
                        truck.drive(actionValue);
                        break;
                    }
                    if (action.equals("Refuel")) {
                        truck.refuel(actionValue);
                        break;
                    }
                case "Bus":
                    if (action.equals("Drive")) {
                        bus.drive(actionValue);
                        break;
                    }
                    if (action.equals("DriveEmpty")) {
                        bus.driveEmpty(actionValue);
                        break;
                    }
                    if (action.equals("Refuel")) {
                        bus.refuel(actionValue);
                        break;
                    }
            }
        }
        System.out.println(car);
        System.out.println(truck);
        System.out.println(bus);
    }

}
