package NeedForSpeed;

public class Car extends Vehicle{
    public static final double DEFAULT_FUEL_CONSUMPTION = 3;
    public Car(double fuel, int horsePower) {
        super(fuel, horsePower);
        this.fuelConsumption = DEFAULT_FUEL_CONSUMPTION;
    }

    @Override
    public double getFuelConsumption() {
        return DEFAULT_FUEL_CONSUMPTION;
    }
}
