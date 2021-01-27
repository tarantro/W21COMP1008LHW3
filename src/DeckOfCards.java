import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DeckOfCards {

    private ArrayList<Card> deck;

    public DeckOfCards()
    {
        deck = new ArrayList<>();

        List<String> suits = Card.getValidSuits();
        List<String> faceNames = Card.getValidFaceNames();

        for (int i = 0; i < suits.size(); i++)
        {
            for (String faceName : faceNames)
            {
                Card newCard = new Card(faceName, suits.get(i));
                deck.add(newCard);
            }
        }
    }

    /**
     * This method will return the "top" card in the deck.
     * If there are no cards in the deck, it will return null
     */
    public Card dealTopCard()
    {
        if (deck.size() == 0) {
            return null;
        }
        else
            return deck.remove(0);
    }

    public void shuffle()
    {
        Collections.shuffle(deck);
    }
}
