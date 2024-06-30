package OOP._01_Abstraction_Exercise._03_Cards_with_Power;

public class Card {
    private int suite;
    private int rank;
    private int cardPower;
 public Card(int rank, int suite) {
        this.rank = rank;
        this.suite = suite;
        this.cardPower = rank + suite;
 }
 public int getCardPower() {
  return cardPower;
 }
}
