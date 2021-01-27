import java.util.ArrayList;
import java.util.Arrays;

public class TestingCards {

    public static void main(String[] args) {
        Card card1 = new Card("ace", "spades");
        Card card2 = new Card("4", "hearts");
        Card card3 = new Card("5", "diamonds");
        Card card4 = new Card("jack", "clubs");
        Card card5 = new Card("jack", "hearts");

        ArrayList<Card> myHand = new ArrayList<>();
        myHand.add(card1);
        myHand.add(card2);
        System.out.println(myHand);

        myHand.addAll(Arrays.asList(card3, card4, card5));

        myHand.remove(0);
        System.out.println(myHand);

        System.out.println(card1);

        System.out.println("Creating a deck of cards");
        DeckOfCards deck1 = new DeckOfCards();
        System.out.println(deck1);

        //shuffle deck
        deck1.shuffle();
        //deal out the first 5 cards
        for (int i = 1; i < 5; i++)
        {
            System.out.printf("Card: %d : %s",i,deck1.dealTopCard());
        }
    }
}
