package OOP._05_Polymophism_Excercise._02_Vehicles_Extention;

import java.text.DecimalFormat;

public class Bus extends Vehicle {
   public Bus(double fuelQuantity, double fuelConsumption, double fuelCapacity) {
       super(fuelQuantity, fuelConsumption + 1.4 , fuelCapacity);
   }
   public void driveEmpty(double distance ) {
       DecimalFormat decimalFormat = new DecimalFormat("#.##");
       if ( distance *( this.fuelConsumption - 1.4 ) <= this.fuelQuantity ) {
           System.out.printf("%s travelled %s km%n",this.getClass().getSimpleName(),  decimalFormat.format(distance));
           setFuelQuantity( this.getFuelQuantity() - distance * (this.fuelConsumption - 1.4 ) );
       } else {
           System.out.printf("%s needs refueling%n", this.getClass().getSimpleName());
       }
   }
}
