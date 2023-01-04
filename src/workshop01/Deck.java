package workshop01;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Deck {
    
    static String[] suits = new String[]{"Diamonds","Clubs","Hearts","Spades"};
    static String[] rank = new String[]{"Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Jack","Queen","King","Ace"};
    private List<Card> deck;
    private int deckNumber;

    public Deck(){
        deck = new LinkedList<>();
    }

    public void addDeck(){
        int suitPower = 1;
        int rankPower = 1;

        for(String suit: suits){
            for(String rank: rank){
                Card card = new Card(suit,rank,suitPower,rankPower);
                System.out.println(card +" generated!");
                deck.add(card);
                rankPower++;
            }
            rankPower=1;
            suitPower++;
        }
    }

    public void listAll(){
        System.out.printf("%d cards remaining.\n",checkRemain());
        for(int i=0;i<checkRemain();i++){
            System.out.println((i+1) +"." +deck.get(i));
        }
    }

    public void shuffle(){
        Collections.shuffle(deck);
        System.out.println("Deck shuffled.");
    }
    
    public void draw(int numberToDraw){
        if(checkRemain()<numberToDraw){
            System.out.println("Insufficient cards!");
        } else {
            for(int i=0;i<numberToDraw;i++){
                System.out.println(deck.get(0)+" drawn!");
                deck.remove(0);
            }   
        }
    }

    public int drawCalc(int numberToDraw){
        int total=0;
        for(int i=0;i<numberToDraw;i++){
            System.out.println(deck.get(0)+" drawn!");
            Card card=deck.get(0);
            total+=card.getRankPower();
            deck.remove(0);
        } 
        return total;
    }

    public int checkRemain(){
        return deck.size();
    }

    public String toString(){
        return ("Deck %d").formatted(deckNumber);
    }

}
