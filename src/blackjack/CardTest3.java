package blackjack;

public class CardTest3 {
    public static void main(String[] args) {
        CardDeck cd = new CardDeck();
        Dealer dealer = new Dealer();

        Card c1 = new Card("테스트", "J");
        Card c2 = new Card("테스트", "10");

        dealer.receiveCard(c1);
        dealer.receiveCard(c2);

        dealer.moreCard(cd);
        dealer.showAllCards();
    }
}
