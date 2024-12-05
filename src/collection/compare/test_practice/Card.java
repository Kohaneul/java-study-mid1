package collection.compare.test_practice;

public class Card implements Comparable<Card>{
    private int rank;
    private final Suit suit;

    public Card(int rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public int getRank() {
        return rank;
    }

    public Suit getSuit() {
        return suit;
    }

    @Override
    public int compareTo(Card anotherCard) {
        if(this.getRank()!=anotherCard.getRank()){
            return Integer.compare(this.getRank(),anotherCard.getRank());
        }
        else{
            return this.suit.compareTo(anotherCard.getSuit());
        }
    }

    @Override
    public String toString() {
        return rank+"("+suit.getIcon()+")";
    }
}
