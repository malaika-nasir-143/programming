/// Class definition: tests creating and ranking 5 random cards
public class RankedCards {

    // Main method: program entry point
    public static void main(String args[]) {

        // Create an array to hold 5 card objects
        Card myCards[] = new Card[5];

        // Variables to track the highest–ranked card and its position
        int biggestValue = -1;
        int biggestPos = -1;

        // Temporary variable used later for swapping cards
        Card tempCard;

        // Loop: generates 5 random cards and finds the one with the highest rank
        for (int i = 0; i < 5; i++) {
            myCards[i] = new Card();   // create a new random card

            // Update biggest card info if current card has higher rank
            if (myCards[i].getRankValue() > biggestValue) {
                biggestValue = myCards[i].getRankValue();
                biggestPos = i;
            }
        }

        // Output: display the 5 generated cards
        System.out.println("My cards are...");
        for (Card c : myCards) {
            System.out.println(c);
        }

        // Output: the index of the highest–ranked card
        System.out.println("\nThe biggest rank value is at position " + biggestPos);

        // Swap: move the highest ranked card to the last position in the array
        tempCard = myCards[4];
        myCards[4] = myCards[biggestPos];
        myCards[biggestPos] = tempCard;

        // Output: display cards after swapping
        System.out.println("\nAfter swapping...");
        for (Card c : myCards) {
            System.out.println(c);
        }
    }
}
