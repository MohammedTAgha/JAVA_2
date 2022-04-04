package Ass1;

import java.util.Scanner;

public class Q_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("inter your number");
        int number = in.nextInt();
        int result = 0;
        int maxDigits = 9;
        for (int i = 0; i <= maxDigits; i++) {
            int inHand = number;
            while (inHand > 0) {
                int num = inHand % 10;
                if (num == i) {
                    result *= 10;
                    result += num;
                }
                inHand /= 10;
            }
        }
        System.out.println(number + "in reverse :" + result);
    }
}
