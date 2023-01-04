package workshop01;

public class Card {
    
    private String suit;
    private String rank;
    private int suitPower;
    private int rankPower;

    public Card(String suit, String rank, int suitPower, int rankPower) {
        this.suit = suit;
        this.rank = rank;
        this.suitPower = suitPower;
        this.rankPower = rankPower;
    }

    

    public String getSuit() {
        return suit;
    }



    public String getRank() {
        return rank;
    }



    public int getSuitPower() {
        return suitPower;
    }



    public int getRankPower() {
        return rankPower;
    }



    public String toString(){
        String output = rank + " of " + suit + ". Suit Power: " + suitPower +". Rank Power: " +rankPower;
        return (output);
    }
}
