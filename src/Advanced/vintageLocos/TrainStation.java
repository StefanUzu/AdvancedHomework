package Advanced.vintageLocos;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static java.util.Arrays.stream;

public class TrainStation {
    private String name;
    private int capacity;
    private int railGauge;
    private List<Locomotive> locomotives;

    public TrainStation(String name, int capacity, int railGauge){
        this.name = name;
        this.capacity = capacity;
        this.railGauge = railGauge;
        this.locomotives = new ArrayList<>();

    }
    public void addLocomotive(Locomotive locomotive){
        if (railGauge == locomotive.gauge ) {
            if (capacity >= 1){
                locomotives.add(locomotive);
            }
        } else {
            System.out.printf("The rail gauge of this station does not match the locomotive gauge! Difference: %d mm.", Math.abs(railGauge - locomotive.gauge));
        }
    }
    public boolean removeLocomotive(String name){
        return locomotives.removeIf(s -> s.getName().equals(name));
    }
    public String getFastestLocomotive(){
        if (locomotives.isEmpty()){ return "There are no locomotives.";}
        Locomotive maxSpeed = locomotives.stream().max(Comparator.comparingInt(Locomotive::getMaxSpeed))
                .orElse(null);

        return String.format("%s is the fastest locomotive with a maximum speed of %d km/h.",maxSpeed.getName(),maxSpeed.getMaxSpeed() );

    }
    public  Locomotive getLocomotive(String name){
        return locomotives.stream()
                .filter(s -> s.getName().equals(name))
                .findFirst()
                .orElse(null);
    }
    public int getCount(){
        return locomotives.size();
    }
    public String getOldestLocomotive() {
        return locomotives.stream()
                .min(Comparator.comparing(Locomotive::getBuildDate))
                .map(Locomotive::getName)
                .orElse("There are no locomotives.");
    }
    public String getStatistics(){
        return " ";
    }
}
