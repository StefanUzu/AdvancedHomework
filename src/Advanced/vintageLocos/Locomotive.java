package Advanced.vintageLocos;

import java.time.LocalDate;

public class Locomotive {
    private String name;
    private String builder;
    private LocalDate buildDate;
    public int gauge;
    private int weight;
    private int maxSpeed;

    public Locomotive(String name, String builder, LocalDate buildDate, int gauge, int weight, int maxSpeed){
        this.name = name;
        this.buildDate = buildDate;
        this.gauge = gauge;
        this.weight = weight;
        this.maxSpeed = maxSpeed;
    }
    public String getName(){
        return name;
    }

    public int getMaxSpeed(){
        return maxSpeed;
    }
    public  LocalDate getBuildDate(){
        return buildDate;
    }
    @Override
    public String toString() {
        return String.format("This %s is made by %s at {locomotive build date in the format \"dd.MM.yyyy\"}.", name, builder, buildDate);
    }
}
