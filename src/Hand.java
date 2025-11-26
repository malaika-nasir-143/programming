import java.util.Arrays;

public class Hand {
    
    private Card[] cards;   

    
    public Hand() {
        cards = new Card[5]; 
        for (int i = 0; i < 5; i++) {
            cards[i] = new Card();
        }

        Arrays.sort(cards);  
    }

    
    public boolean inHand(Card searchCard) {
    for (int i = 0; i < 5; i++) {

       
        if (cards[i].compareTo(searchCard) > 0) {
            return false;  
        }

       
        if (cards[i].compareTo(searchCard) == 0) {
            return true;
        }
    }

    return false; 
}
    
    public String toString() {
        String result = "";
        for (int i = 0; i < 5; i++) {
            result += cards[i].toString() + " ";
        }
        return result;
    }

    
    public static void main(String[] args) {

       
        Hand hand = new Hand();

        
        System.out.println("Hand of 5 cards (sorted by rank): " + hand);

        
        for (int i = 1; i <= 10; i++) {
            Card randomCard = new Card();
            String message;

            if (hand.inHand(randomCard)) {
                message = " - Positive, the card is contained in the hand";
            } else {
                message = " - Negative, no card is not contained in the hand";
            }

            System.out.println("Random card #" + i + ": " + randomCard + message);
        }
    }
}
