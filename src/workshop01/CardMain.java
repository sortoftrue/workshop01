package workshop01;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CardMain {
        
    public static void main(String[] args) {

        List<Deck> decks = new LinkedList<>();
        Deck deck = new Deck();
        Scanner scan = new Scanner(System.in);
        
        while(true){
            System.out.println("""
                    What would you like to do?
                    -view
                    -shuffle
                    -draw X
                    -play X
                    -add
                    """);

            String choice = scan.next().trim().toLowerCase();
            
            switch (choice){
                case "play":{
                    int cards = scan.nextInt();
                    System.out.printf("Player 1 has %d points.\n",deck.drawCalc(cards));
                    System.out.printf("Player 2 has %d points.\n",deck.drawCalc(cards));
                    break;
                }
                case "view":{
                    deck.listAll();
                    break;
                }
                case "shuffle":{
                    deck.shuffle();
                    break;
                }
                case "draw":{
                    int cards = scan.nextInt();
                    deck.draw(cards);
                    break;
                }
                case"add":{
                    deck.addDeck();
                    System.out.println("One more deck added");
                    break;
                }

            }

        }

    }

}
