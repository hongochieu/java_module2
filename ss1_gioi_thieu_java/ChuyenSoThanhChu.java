package ss1_gioi_thieu_java;

import java.util.Scanner;

public class ChuyenSoThanhChu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (0 - 999): ");
        int number = scanner.nextInt();

        if (number < 0 || number > 999) {
            System.out.println("Out of ability");
            return;
        }

        if (number == 0) {
            System.out.println("zero");
            return;
        }

        String result = "";

        // Bước 5: Đọc hàng trăm
        if (number >= 100) {
            int hundreds = number / 100;
            result += getDigitWord(hundreds) + " hundred";
            number %= 100;

            if (number != 0) {
                result += " and ";
            }
        }

        // Bước 2, 3, 4: Đọc hàng chục và đơn vị
        if (number >= 20) {
            int tens = number / 10;
            int ones = number % 10;
            result += getTensWord(tens);
            if (ones != 0) {
                result += " " + getDigitWord(ones);
            }
        } else if (number >= 10) {
            result += getTeenWord(number);
        } else if (number > 0) {
            result += getDigitWord(number);
        }

        System.out.println(result);
    }

    // Bước 2: Đọc số từ 1 đến 9
    static String getDigitWord(int number) {
        switch (number) {
            case 1: return "one";
            case 2: return "two";
            case 3: return "three";
            case 4: return "four";
            case 5: return "five";
            case 6: return "six";
            case 7: return "seven";
            case 8: return "eight";
            case 9: return "nine";
            default: return "";
        }
    }

    // Bước 3: Đọc số từ 10 đến 19
    static String getTeenWord(int number) {
        switch (number) {
            case 10: return "ten";
            case 11: return "eleven";
            case 12: return "twelve";
            case 13: return "thirteen";
            case 14: return "fourteen";
            case 15: return "fifteen";
            case 16: return "sixteen";
            case 17: return "seventeen";
            case 18: return "eighteen";
            case 19: return "nineteen";
            default: return "";
        }
    }

    // Bước 4: Đọc hàng chục (20, 30, ..., 90)
    static String getTensWord(int number) {
        switch (number) {
            case 2: return "twenty";
            case 3: return "thirty";
            case 4: return "forty";
            case 5: return "fifty";
            case 6: return "sixty";
            case 7: return "seventy";
            case 8: return "eighty";
            case 9: return "ninety";
            default: return "";
        }
    }
}
