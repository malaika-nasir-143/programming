// Class definition: used to test the Deck and Card classes together
public class CardTestDeck {

    // Main method: entry point to run deck operations
    public static void main(String[] args) {

        // Create a new deck (shuffled automatically) and print it
        Deck deck = new Deck();
        System.out.println("Full shuffled deck:");
        System.out.println(deck);

        // Deal and print five cards from the top of the deck
        System.out.println("Dealt cards:");
        System.out.println(deck.deal());
        System.out.println(deck.deal());
        System.out.println(deck.deal());
        System.out.println(deck.deal());
        System.out.println(deck.deal());

        // Print the remaining deck after dealing five cards
        System.out.println("Remaining deck:");
        System.out.println(deck);
    }
}

