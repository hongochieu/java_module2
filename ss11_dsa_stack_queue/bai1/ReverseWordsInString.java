package ss11_dsa_stack_queue.bai1;
import java.util.Stack;
public class ReverseWordsInString {
    public static void main(String[] args) {
        String input = "Xin chao cac ban";
        String[] words = input.split(" ");

        Stack<String> wordStack = new Stack<>();

        for (String word : words) {
            wordStack.push(word);
        }


        StringBuilder reversed = new StringBuilder();
        while (!wordStack.isEmpty()) {
            reversed.append(wordStack.pop()).append(" ");
        }


        System.out.println(reversed.toString().trim());
    }
}
