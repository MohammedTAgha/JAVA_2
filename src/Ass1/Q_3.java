package Ass1;

public class Q_3 {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
    public static  int factorial(int n ){
        int r = 1;
        for( int i = 1; i <= n; i++ ){
            r = r*i;
        }
         return r ;
    }
}
