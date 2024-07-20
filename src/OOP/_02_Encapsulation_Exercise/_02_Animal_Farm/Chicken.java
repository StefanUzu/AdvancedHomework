package OOP._02_Encapsulation_Exercise._02_Animal_Farm;

public class Chicken {
    private String name ;
    private int age;

    Chicken(String name, int age) {
        setAge(age);
        setName(name);
    }

    public void setAge(int age) {
        if ( age >= 0 && age <= 15) {
            this.age = age;
            return;
        }
        throw new IllegalArgumentException("Age should be between 0 and 15.");
    }

    public void setName(String name) {
        if (!name.isEmpty() && !name.isBlank()) { this.name = name; return; }
        throw new IllegalArgumentException("Name cannot be empty.");
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
    public double productPerDay () {
        return calculateProductPerDay(age);
    }

    @Override
    public String toString() {
        return String.format("Chicken %s (age %d) can produce %.2f eggs per day.", name, age, productPerDay());
    }

    private double calculateProductPerDay( int age ) {
        if ( age < 6 ) { return 2; }
        if ( age < 12 ) { return 1; }
        return 0.75;
    }
}
