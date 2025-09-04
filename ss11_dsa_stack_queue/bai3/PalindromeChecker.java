package ss11_dsa_stack_queue.bai3;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class PalindromeChecker {
    public static boolean isPalindrome(String input) {
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        for (char ch : normalized.toCharArray()) {
            queue.add(ch);
            stack.push(ch);
        }

        while (!queue.isEmpty()) {
            if (queue.poll() != stack.pop()) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String test = "Able was I ere I saw Elba";

        if (isPalindrome(test)) {
            System.out.println("Chuỗi là Palindrome.");
        } else {
            System.out.println("Chuỗi KHÔNG là Palindrome.");
        }
    }
}
