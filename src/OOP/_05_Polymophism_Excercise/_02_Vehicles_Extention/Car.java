package OOP._05_Polymophism_Excercise._02_Vehicles_Extention;

public class Car extends Vehicle {
    public Car( double fuelQuantity, double fuelConsumption, double fuelCapacity ) {
        super( fuelQuantity, fuelConsumption + 0.9 , fuelCapacity);
    }
}
