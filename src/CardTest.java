public class CardTest {
    public static void main(String[] args) {
        Card card1 = new Card(); // Random card
        Card card2 = new Card(); // Random card

        System.out.println("Card 1: " + card1);
        System.out.println("Card 2: " + card2);

        int result = card1.compareTo(card2);
        if (result > 0) {
            System.out.println(card1 + " is higher than " + card2);
        } else if (result < 0) {
            System.out.println(card1 + " is lower than " + card2);
        } else {
            System.out.println(card1 + " is equal in rank to " + card2);
        }
    }
}

