package OOP._05_Polymophism_Excercise._02_Vehicles_Extention;

import java.text.DecimalFormat;

public abstract class Vehicle {
    protected double fuelQuantity;
    protected final double fuelConsumption;
    protected final double fuelCapacity;

    public Vehicle( double fuelQuantity , double fuelConsumption , double fuelCapacity ) {
        this.fuelQuantity = fuelQuantity;
        this.fuelConsumption = fuelConsumption;
        this.fuelCapacity = fuelCapacity;
    }
    public void drive( double distance ) {
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

        if (refuelAmount <= 0 ) {
            System.out.println("Fuel must be a positive number");
            return;
        }
        if (refuelAmount + this.fuelQuantity > this.getFuelCapacity()) {
            System.out.println("Cannot fit fuel in tank");
            return;
        }

        this.setFuelQuantity( this.getFuelQuantity() + refuelAmount );
    }

    public void setFuelQuantity(double fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }
    @Override
    public String toString() {
        return "%s: %.2f".formatted(this.getClass().getSimpleName(), this.getFuelQuantity());
    }

    public double getFuelCapacity () {
        return fuelCapacity;
    }
}
