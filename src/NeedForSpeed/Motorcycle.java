package NeedForSpeed;

public class Motorcycle extends Vehicle{

    public Motorcycle(double fuel, int horsePower) {
        super(fuel,horsePower);
        this.fuelConsumption = DEFAULT_FUEL_CONSUMPTION;
    }
}
