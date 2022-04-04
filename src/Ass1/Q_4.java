package Ass1;

public class Q_4 {
    public static void main(String[] args) {
        isPrime(2);
        isPrime(7);
        isPrime(8);
    }
    public static boolean isPrime (int number){
        if (number <= 1) { // check if negative and less than 1
            System.out.println("is not prime (less than 1)");
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                System.out.println("is not prime");
                return false;
            }
        }
        System.out.println("is a prime");
        return true;
    }
}
