package ss11_dsa_stack_queue.bai2;
import java.util.Scanner;
import java.util.Stack;
public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhập số nguyên dương cần chuyển đổi: ");
        int number = scanner.nextInt();

        if (number == 0) {
            System.out.printf("Kết quả nhị phân: 0");
            return;
        }

        Stack<Integer> stack = new Stack<>();

        while (number > 0) {
            int remainder = number % 2;
            stack.push(remainder);
            number = number / 2;
        }
        System.out.printf("Kết quả nhị phân: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }
}