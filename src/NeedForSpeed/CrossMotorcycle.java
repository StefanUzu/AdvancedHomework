package NeedForSpeed;

public class CrossMotorcycle extends Motorcycle{
    public CrossMotorcycle(double fuel, int horsePower) {
        super(fuel, horsePower);
        this.fuelConsumption = Motorcycle.DEFAULT_FUEL_CONSUMPTION;
    }
}
