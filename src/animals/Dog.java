package animals;

public class Dog extends Animal{
    private String name;
    private int age;
    private String gender;
    //private final String SOUND = "Woof!";

    public Dog(String name, int age, String gender) {
        super(name, age, gender);
    }

    public String produceSound() {
        return "Woof!";
    }
}
