package blackjack;
//import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class CardDeck{
    private List<Card> cards;

    public CardDeck() { // 클래스명이랑 이름이 같다, 리턴타입이 없다
        init();

    }
    private void init() {
        String[] patterns = {"스페이드", "하트", "클럽", "다이아몬드"};
        cards = new ArrayList();
        for(int i=0; i<patterns.length; i++) {
            for(int z=1; z<=13; z++) {
                String denomination = null;
                switch(z) {
                    case 1:
                        denomination = "A"; break;
                    case 11:
                        denomination = "J"; break;
                    case 12:
                        denomination = "Q"; break;
                    case 13:
                        denomination = "K"; break;
                    default :
                        denomination = String.valueOf(z);
                        //denomination = z _ "";
                         }
//                Card c = new Card(patterns[i], denomination);
                cards.add(new Card(patterns[i], denomination));
            }
        }
    }
    // 항상 랜덤한 카드를 준다
    public Card getCard() {
        // if 콜렉션을 배열로 했다면 먼저 섞고, 순차적으로 카드를 줌
        // if 콜렉션을 ArrayList로 했다면 랜덤하게 카드를 줌
        int rIdx = (int)(Math.random() * cards.size());
//        return cards.remove((int)(Math.random() * cards.size()));
        return cards.remove(rIdx);
    }

    public void showAllCards() {
//        for(int i=0; i<cards.size(); i++) {
//            Card c = cards.get(i);
//            System.out.println(c);
//        }

        //ForEach
        //            배열    (collection : 순차적인 것 들만 가능)
        for(Card c : cards) {
            System.out.println(c);
        }
    }

}
