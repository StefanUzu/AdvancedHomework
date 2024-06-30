package OOP._01_Abstraction_Exercise._03_Cards_with_Power;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    CardPowers rank = CardPowers.valueOf(scanner.nextLine());
    SuitePower suite = SuitePower.valueOf(scanner.nextLine());
    Card card = new Card(rank.getPower(), suite.getPower());
    System.out.println("Card name: " + rank + " of " + suite + "; Card power: " + card.getCardPower() );
    }
}
