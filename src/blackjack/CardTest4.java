package blackjack;

public class CardTest4 {
    public static void main(String[] args) {
        // JUnit ( 테스트 도구 )
        Rule rule = new Rule();
        CardDeck cd = new CardDeck();
        Dealer dealer = new Dealer();
        Gamer gamer = new Gamer();

        dealer.receiveCard(cd.getCard());
        dealer.receiveCard(cd.getCard());
        dealer.moreCard(cd);

        gamer.receiveCard(cd.getCard());
        gamer.receiveCard(cd.getCard());

        rule.getWinner(dealer, gamer);
    }
}
