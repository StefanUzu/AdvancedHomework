package animals;

public class Kitten extends Cat{
    private String name;
    private int age;
    //private final String SOUND = "Meow";

    public Kitten(String name, int age, String gender) {
        super(name, age, "Female");
    }

    @Override
    public String produceSound() {
        return "Meow";
    }
}
