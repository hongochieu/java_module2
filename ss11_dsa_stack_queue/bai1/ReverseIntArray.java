package ss11_dsa_stack_queue.bai1;
import java.util.Stack;
public class ReverseIntArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        Stack<Integer> stack = new Stack<>();

        for (int num : arr) {
            stack.push(num);
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
