package OOP._05_Polymophism_Excercise._02_Vehicles_Extention;
public class Truck extends Vehicle {
    Truck(double fuelQuantity, double fuelConsumption, double fuelCapacity) {
        super(fuelQuantity, fuelConsumption + 1.6 , fuelCapacity);
    }

    @Override
    public void refuel( double refuelAmount ) {
        if (refuelAmount <= 0 ) {
            System.out.println("Fuel must be a positive number");
            return;
        }
        if (refuelAmount + this.fuelQuantity > this.getFuelCapacity()) {
            System.out.println("Cannot fit fuel in tank");
            return;
        }
        double fuelMinusLeaks = refuelAmount * 0.95;
        setFuelQuantity(getFuelQuantity() + fuelMinusLeaks);
    }
}
