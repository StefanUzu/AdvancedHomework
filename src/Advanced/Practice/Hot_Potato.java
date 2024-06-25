package Advanced.Practice;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Hot_Potato {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] players = input.split(" ");
        ArrayDeque<String> deck = new ArrayDeque<>();
        int passesCount = Integer.parseInt(scanner.nextLine());
        int removedCount = 0;


        for( int i = 0 ; i < players.length ; i++){
            deck.push(players[i]);
        }

            for (int i = 1; i <= passesCount ; i++) {
                if (i == passesCount) {
                    System.out.println("Removed " + deck.remove());
                    removedCount++;
                    i = 0;
                    if (removedCount == players.length-1) {
                        break;
                    }

                } else {
                    deck.offer(deck.pop());
                }
            }

        System.out.println("Last is " + deck.pop());


    }
}

