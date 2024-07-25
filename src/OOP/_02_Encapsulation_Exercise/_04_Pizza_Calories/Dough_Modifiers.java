package OOP._02_Encapsulation_Exercise._04_Pizza_Calories;

public enum Dough_Modifiers {
    White(1.5),
	Wholegrain(1.0),
	Crispy(0.9),
    Chewy(1.1),
    Homemade(1.0);
     private final double doughModifier;
     Dough_Modifiers(double doughModifier) {
         this.doughModifier = doughModifier;
     }
     public double getDoughModifier () {
         return this.doughModifier;
     }
}
