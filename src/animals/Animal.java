package animals;

public class Animal {
    private String name;
    private int age;
    private String gender;


    public Animal(String name, int age, String gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }

    private void setGender(String gender) {
        if (gender.equals("Male") || gender.equals("Female")) {
            this.gender = gender;
            return;
        }
        throw new IllegalArgumentException("Invalid input!");
        //System.out.println("Invalid input!");
    }

    private void setAge(int age) {
        if ( age < 0 ) {
            throw new IllegalArgumentException("Invalid input!");
            //System.out.println("Invalid input!");
            //return;
        }
        this.age = age;
    }

    private void setName(String name) {
        if (name.isEmpty()) {
            //System.out.println("Invalid input!");
           // return;
            throw new IllegalArgumentException("Invalid input!");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }
    public String produceSound() {
        return "";
    }

    @Override
    public String toString() {
        return String.format("%s%n%s %d %s%n%s",this.getClass().getSimpleName(),this.name,this.age,this.gender,this.produceSound());
    }
}
