package collection.compare.test_practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

   private List<Card> cardList;

    public Deck() {
        this.cardList = new ArrayList<>();

        initCardList();

        shuffle();
    }

    private void initCardList(){
        Suit[] suit = Suit.values();
        for(int i = 1; i<=13;i++){
            for (Suit s : suit) {
                cardList.add(new Card(i,s));
            }
        }
    }

    private void shuffle(){
        Collections.shuffle(cardList);
    }

    public Card drawCard(){
        return cardList.removeFirst();
    }

    public List<Card> getCardList() {
        return cardList;
    }

}
