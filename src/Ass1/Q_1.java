package Ass1;

import java.util.Scanner;

public class Q_1 {
    public static void main(String[] args) {
        double area , circumference;
        Scanner in = new Scanner(System.in);
        System.out.println("enter the radious");
        double r = in.nextDouble();
        area =Math.PI * r *r;
        circumference = 2 * Math.PI * r ;
        System.out.println("area :" + area);
        System.out.println("circumference :" + circumference);
    }
}
