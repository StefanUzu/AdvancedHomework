package OOP._05_Polymophism_Excercise._01_Vehicles;

public class Vehicle {
    private double fuelQuantity;
    private final double fuelConsumption;

    public Vehicle(double fuelConsumption, double fuelQuantity) {
        this.fuelConsumption = fuelConsumption;
        this.fuelQuantity = fuelQuantity;
    }
    public void drive( int distance, Vehicle vehicle ) {
        if ( distance * this.fuelConsumption <= this.fuelQuantity ) {
            System.out.printf("Car travelled %d km", distance);
            setFuelQuantity( this.fuelQuantity - distance * this.fuelConsumption );
        } else {
            System.out.printf("%s needs refueling", vehicle.getClass().getSimpleName());
        }
    }

    public double getFuelQuantity() { return fuelQuantity; }
    public void addFuelQuantity(int refuelAmount) { fuelQuantity += refuelAmount; }
    public void setFuelQuantity(double fuelQuantity) { this.fuelQuantity = fuelQuantity; }
}
