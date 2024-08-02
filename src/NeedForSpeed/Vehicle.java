package NeedForSpeed;

public class Vehicle {
    public final static double DEFAULT_FUEL_CONSUMPTION = 1.25;
    double fuelConsumption;
    double fuel;
    int horsePower;
    public Vehicle(double fuel, int horsePower) {
        this.fuelConsumption = DEFAULT_FUEL_CONSUMPTION;
        setFuel(fuel);
        setHorsePower(horsePower);
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public double getFuel() {
        return fuel;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void drive(double kilometers) {
        if (kilometers * this.fuelConsumption <= this.fuel) {
            setFuel(getFuel() - kilometers * this.fuelConsumption);
           // return;
        }
        //System.out.println("We not drivin' boizzz!!");
    }
}
