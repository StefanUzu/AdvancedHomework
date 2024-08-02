package NeedForSpeed;

public class FamilyCar extends Car{
    public FamilyCar(double fuel, int horsePower) {
        super(fuel, horsePower);
        fuelConsumption = Car.DEFAULT_FUEL_CONSUMPTION;
    }
}
