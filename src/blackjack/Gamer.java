package blackjack;

import java.util.LinkedList;
import java.util.List;

public class Gamer {
    protected List<Card> myCards;

    public Gamer() {
        init();
    }

    private void init() {
        myCards = new LinkedList();
    }

    // 카드 받기
    public void receiveCard(Card c) {
        myCards.add(c);
    }
    // 카드 오픈
    public List<Card> openCards() {
        return myCards;
    }

    public void showAllCards() {
        for (int i = 0; i < myCards.size(); i++) {
            Card c = myCards.get(i);
            System.out.println(c);
        }
    }
}
