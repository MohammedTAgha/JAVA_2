package Ass1;

import java.util.Scanner;

public class Q_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n %2 == 0 ){
            System.out.println("the number is even");
        }else{
            System.out.println("the number is odd");
        }
    }
}
