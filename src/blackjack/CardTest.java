package blackjack;

import java.util.ArrayList;
import java.util.List;

public class CardTest {
    public static void main(String[] args) {
        // 스페이드, A
        Card c1 = new Card("스페이드", "A");

        // Arraylist
        List<Card> cards = new ArrayList();
        //   Card 타입이 가리킬 수 있는 객체만 가능 (get, add)


        System.out.println(c1.getPattern());
        System.out.println(c1.getDenomination());

        System.out.println(c1); // 스페이드 - A

        CardDeck cd = new CardDeck();
        cd.showAllCards();

        Gamer gm = new Gamer();
        gm.showAllCards();

    }
}
