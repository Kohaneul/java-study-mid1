package collection.compare.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> cards ;

    public Deck(){
        //카드 52장 셋팅
        initCard();
        //카드를 섞는다
        shuffle();
    }

    private void shuffle() {
        Collections.shuffle(cards);
    }

    private void initCard() {
        cards = new ArrayList<>();
        for (int i = 1; i <= 13; i++) {
            Suit[] values = Suit.values();
            for (Suit value :values) {
                cards.add(new Card(i,value));
            }
        }
    }

    public Card drawCard(){
        //뽑은 카드 반환
        return cards.removeFirst();
    }
}
