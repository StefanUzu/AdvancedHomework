package OOP._01_Abstraction_Exercise._03_Cards_with_Power;

public enum SuitePower {
    CLUBS(0), DIAMONDS (13), HEARTS (26), SPADES (39);
    private final int power;

    SuitePower(int power){

        this.power = power;
    }
    public int getPower(){
        return power;
    }
}
