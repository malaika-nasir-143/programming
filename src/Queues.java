import java.util.Queue;
import java.util.Scanner;

public class Queues {
    // ===== Variables (fields) =====
    private final Queue<Character> queue;  // FIFO queue via Queue API
    private final int[] freq;              // frequency table (by char code)

    // ===== Constructor =====
    public Queues() {
        this.queue = new java.util.LinkedList<>(); // LinkedList implements Queue
        this.freq  = new int[65536];               // Unicode BMP range
    }

    // Method: Clear queue and frequency table
    private void reset() {
        queue.clear();
        for (int i = 0; i < freq.length; i++) {
            freq[i] = 0;
        }
    }
    // Method: Enqueue all characters and update frequencies
    public void enqueueAll(String text) {
        reset();                        // start clean
        for (char c : text.toCharArray()) {
            queue.offer(c);             // Queue method: enqueue at tail (FIFO)
            freq[c]++;                  // count this character
        }
    }
    // Method: Return the first character whose frequency is exactly 1; '\0' if none
    public char firstNonRepeating() {
        while (!queue.isEmpty()) {      // Queue method
            char front = queue.poll();  // Queue method: dequeue from head
            if (freq[front] == 1) {
                return front;
            }
        }
        return '\0';                    // sentinel meaning "not found"
    }
    // Method: One-call helper
    public char findFirstUnique(String text) {
        enqueueAll(text);
        return firstNonRepeating();
    }

    // Main Method to Use (Cn be in seporated class
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String input = in.nextLine();

            Queues tool = new Queues();                 // constructor
            char result = tool.findFirstUnique(input);  // method call

            if (result == '\0') {
                System.out.println("No non-repeating character found.");
            } else {
                System.out.println("First non-repeating character: " + result);
            }
        }
    }
}
