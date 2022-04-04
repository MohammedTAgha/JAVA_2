package ch2;

import java.util.Scanner;

public class TestOOP {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println(sum(inputt("enter first num"),inputt("enter second num")));
//        int r = ()-> System.out.print("Run method");
    }
    public static int sum(int n1 , int n2 ){
        return n1 + n2 ;
    }

    public static int inputt(String txt  ){
        System.out.println(txt);
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }
}
