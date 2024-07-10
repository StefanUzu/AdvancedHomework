package OOP._05_Polymophism_Excercise._01_Vehicles;

public class Truck extends Vehicle {
    Truck(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption + 1.6 );
    }

    @Override
    public void refuel(double fuelToRefill) {
        double fuelMinusLeaks = fuelToRefill * 0.9;
        setFuelQuantity(getFuelQuantity() + fuelMinusLeaks);
    }
}
