import java.util.Stack;

public class JustStackExample {
    public static void main(String[] args) {
        Stack<Integer> stackExample = new Stack<>();
        stackExample.push(10);
        stackExample.push(20);
        stackExample.push(30);

        System.out.println("Top: " + stackExample.peek());      // 30
        System.out.println("Pop: " + stackExample.pop());       // 30
        System.out.println("Is Empty: " + stackExample.empty()); // false
    }
}

