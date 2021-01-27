import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Card {

    private String faceName;
    private int faceValue;
    private String suit;

    /**
     * bla bla bla
     * @param faceName
     * @param suit
     * @param faceValue
     */
    public Card(String faceName, String suit, int faceValue) {
        setFaceName(faceName);
        setSuit(suit);
        setFaceValue(faceValue);
    }

    /**
     * Use if assuming Aces high
     * @param faceName
     * @param suit
     */
    public Card(String faceName, String suit) {
        setFaceName(faceName);
        setSuit(suit);
        setFaceValue(calculateFaceValue());
    }

    public String getFaceName() {
        return faceName;
    }

    public void setFaceName(String faceName) {
        faceName = faceName.toLowerCase();
        if (getValidFaceNames().contains(faceName))
            this.faceName = faceName;
        else
            throw new IllegalArgumentException(faceName + " was entered, valid suits are: "+getValidFaceNames());
    }

    public int getFaceValue() {
        return faceValue;
    }

    public static List<String> getValidFaceNames() {
        return Arrays.asList("ace", "king", "queen", "jack", "10", "9", "8","7", "6","5","4","3","2");
    }

    public void setFaceValue(int faceValue) {
        if (faceValue >= 1 && faceValue <= 14) {
            this.faceValue = faceValue;
        }
        else {
            throw new IllegalArgumentException("Must be a value between 1 and 14!");
        }
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        suit = suit.toLowerCase();
        if (getValidSuits().contains(suit))
            this.suit = suit;
        else
            throw new IllegalArgumentException(suit + " was entered, valid suits are: "+getValidSuits());
    }

    public static List<String> getValidSuits() {
        return Arrays.asList("spades","clubs","hearts","diamonds");
    }

    public String toString() {
        return faceName + " of " + suit;
    }

    private int calculateFaceValue() {
        List<String> faceNames = getValidFaceNames();
        int positionInList = faceNames.indexOf(faceName);
        return positionInList + 2;
    }
}
