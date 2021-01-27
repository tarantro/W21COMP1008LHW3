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

    }
}
