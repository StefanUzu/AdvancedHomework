package OOP._05_Polymophism_Excercise._01_Vehicles;

import java.text.DecimalFormat;

public class Vehicle {
    private double fuelQuantity;
    private final double fuelConsumption;

    public Vehicle( double fuelQuantity , double fuelConsumption ) {
        this.fuelQuantity = fuelQuantity;
        this.fuelConsumption = fuelConsumption;
    }
    public void drive(double distance ) {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        if ( distance * this.fuelConsumption <= this.fuelQuantity ) {
            System.out.printf("%s travelled %s km%n",this.getClass().getSimpleName(),  decimalFormat.format(distance));
            setFuelQuantity( this.getFuelQuantity() - distance * this.fuelConsumption );
        } else {
            System.out.printf("%s needs refueling%n", this.getClass().getSimpleName());
        }
    }

    public double getFuelQuantity() {
        return fuelQuantity;
    }

    public void refuel(double refuelAmount) {
        this.setFuelQuantity( this.getFuelQuantity() + refuelAmount );
    }

    public void setFuelQuantity(double fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }
    @Override
    public String toString() {
        return "%s: %.2f".formatted(this.getClass().getSimpleName(), this.getFuelQuantity());
    }
}
