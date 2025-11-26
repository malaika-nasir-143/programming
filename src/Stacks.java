import java.util.Scanner;
import java.util.Stack;

public class Stacks {
    // ===== Variable (field) =====
    public Stack<Character> stack;   // stack used internally
    // ===== Constructor =====
    public Stacks() {stack = new Stack<>();} // create an empty stack
   
    // METHOD: reserve
    // Push every char to the stack, then pop them to build the reversed string.
    public String reverse(String text) {
        stack.clear();                        // start fresh
        for (char ch : text.toCharArray()) {  // push each character
            stack.push(ch);
        }

        StringBuilder reversed = new StringBuilder();
        while (!stack.empty()) {            // pop to reverse (LIFO)
            reversed.append(stack.pop());
        }
        return reversed.toString();
    }
    
    // Main method to use Stacks (can be in a seprate class file)  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Read input
        System.out.print("Enter a string: ");
        String input = in.nextLine();

        // Use the class
        Stacks tool = new Stacks();
        String reversed = tool.reverse(input);

        // Show results
        System.out.println("Original: " + input);
        System.out.println("Reversed: " + reversed);

        // Palindrome check (simple: case-sensitive, includes spaces)
        if (input.equals(reversed)) {
            System.out.println("\"" + input + "\" is a palindrome");
        } else {
            System.out.println("\"" + input + "\" is NOT a palindrome");
        }

        in.close();
    }
}


