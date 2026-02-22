package questions;

public class Factorial {
    public static void main(String[] args) {
        // 1. with iterative approach
        int num = 5;
        int fact = 1;

        for (int i = 1; i <= num; i++) {
            fact *= i;
        }

        System.out.println("factorial with iterative approach is: " + fact);
        System.out.println("factorial with recursive approach is: " + factorial(num));
    }

    // recursive approach
    static int factorial(int num) {
        // n! = n * (n-1)!
        if (num == 0) { return 1; }

        return num * factorial(num - 1);
    }
}
