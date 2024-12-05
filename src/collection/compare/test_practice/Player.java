package collection.compare.test_practice;

import java.util.ArrayList;
import java.util.List;

public class Player{
  private String name;
  private List<Card> hands;


    public Player(String name) {
        this.name = name;
        this.hands = new ArrayList<>();
    }

    public int getSum() {
        int sum = 0;
        for (Card card : hands) {
            sum+=card.getRank();
        }

        return sum;
    }


    public String getName() {
        return name;
    }

    public void drawCard(Deck deck){
        hands.add(deck.drawCard());
    }


    public void result(){

        hands.sort(null);
        System.out.println(name+"의 카드 : "+hands +" 합계 : "+getSum());
    }

}
