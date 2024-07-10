package OOP._05_Polymophism_Excercise._01_Vehicles;

public class Vehicle {
    private double fuelQuantity;
    private final double fuelConsumption;

    public Vehicle( double fuelQuantity , double fuelConsumption ) {
        this.fuelQuantity = fuelQuantity;
        this.fuelConsumption = fuelConsumption;
    }
    public void drive( double distance, Vehicle vehicle ) {
        if ( distance * vehicle.fuelConsumption <= vehicle.fuelQuantity ) {
            System.out.printf("Car travelled %f km", distance);
            setFuelQuantity( vehicle.getFuelQuantity() - distance * this.fuelConsumption );
        } else {
            System.out.printf("%s needs refueling", vehicle.getClass().getSimpleName());
        }
    }

    public double getFuelQuantity() {
        return fuelQuantity;
    }
    public void refuel(double refuelAmount) {
        fuelQuantity += refuelAmount;
    }
    public void setFuelQuantity(double fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }
}
