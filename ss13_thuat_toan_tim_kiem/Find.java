package ss13_thuat_toan_tim_kiem;
import java.util.Scanner;

public class Find {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter a string: ");
        String input = scanner.nextLine();

        String result = "";
        String temp = "";

        for(int i = 0; i < input.length(); i++){
            char c = input.charAt(i);

            if(temp.isEmpty() || c > temp.charAt(temp.length() - 1)){
                temp += c;
            }else {
                if (temp.length() > result.length()){
                    result = temp;
                }
                temp = "" + c;
            }
        }
        if (temp.length() > result.length()){
            result = temp;
        }
        System.out.println("Longest increasing substring: " + result);
    }
}
