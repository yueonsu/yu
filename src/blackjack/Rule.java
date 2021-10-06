package blackjack;

import java.util.List;

public class Rule {
    public int getScore(List<Card> cards) {
        int sumPoint = 0;
        for(int i=0; i<cards.size(); i++) {
            Card c = cards.get(i);
            sumPoint += c.getPoint();
        }
        return sumPoint;
    }

    public void getWinner(Dealer dealer, Gamer gamer) {
        int dealerScore = getScore(dealer.openCards());
        int gamerScore = getScore(gamer.openCards());

        System.out.println("dealerScore : " + dealerScore);
        System.out.println("gamerScore : " + gamerScore);

        final int STAND_SCORE = 21;
        if(gamerScore == dealerScore || (gamerScore > STAND_SCORE && dealerScore > STAND_SCORE)) {
            System.out.println("비김");
        } else if((dealerScore < STAND_SCORE && gamerScore > STAND_SCORE) || (dealerScore < STAND_SCORE && dealerScore > gamerScore)) {
            System.out.println("Dealer 승");
        } else {
            System.out.println("Gamer 승");
        }
    }
}
