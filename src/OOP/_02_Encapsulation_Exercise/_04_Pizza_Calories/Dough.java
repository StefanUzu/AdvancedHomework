package OOP._02_Encapsulation_Exercise._04_Pizza_Calories;

public class Dough {
    private String flourType;
    private String bakingTechnique;
    private double weight;

    Dough(String flourType, String bakingTechnique, double weight) {
        setFlourType(flourType);
        setBakingTechnique(bakingTechnique);
        setWeight(weight);
    }
    private void setWeight(double weight) {
        if (weight >= 0 && weight <= 200) {
            this.weight = weight;
            return;
        }
        throw new IllegalArgumentException("Dough weight should be in the range [1..200].");
    }

    private void setFlourType(String flourType) {
        try {
            Dough_Modifiers.valueOf(flourType);
            this.flourType = flourType;
        } catch (Exception e) {
            throw new IllegalArgumentException("Invalid type of dough.");
        }

    }

    private void setBakingTechnique(String bakingTechnique) {
        this.bakingTechnique = bakingTechnique;
    }

    public double calculateCalories() {
        double doughMod = Dough_Modifiers.valueOf(flourType).getDoughModifier() * Dough_Modifiers.valueOf(bakingTechnique).getDoughModifier() ;
        return weight * doughMod;
    }
}
