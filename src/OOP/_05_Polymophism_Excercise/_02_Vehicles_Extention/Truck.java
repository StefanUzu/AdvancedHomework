package OOP._05_Polymophism_Excercise._02_Vehicles_Extention;
public class Truck extends Vehicle {
    Truck(double fuelQuantity, double fuelConsumption, double fuelCapacity) {
        super(fuelQuantity, fuelConsumption + 1.6 , fuelCapacity);
    }

    @Override
    public void refuel(double fuelToRefill) {
        double fuelMinusLeaks = fuelToRefill * 0.95;
        setFuelQuantity(getFuelQuantity() + fuelMinusLeaks);
    }
}
