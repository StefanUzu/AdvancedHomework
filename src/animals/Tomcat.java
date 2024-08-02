package animals;

public class Tomcat extends Cat{
    private String name;
    private int age;
    //private final String SOUND = "MEOW";

    public Tomcat(String name, int age, String gender) {
        super(name, age, "Male");
    }
@Override
    public String produceSound() {
    return "MEOW";
    }
}
