package questions;

public class Fibanacci {
    public static void main(String[] args) {
        int num = 10;
        int a = 0;
        int b = 1;

        System.out.print(a + " " + b + " ");

        for (int i = 2; i < num; i++) {
            int c = a + b;
            System.out.print(c + " ");

            a = b;
            b = c;
        }

    }

    static int fib(int n) {
        if (n <= 1) {
            return n;
        }

        return fib(n-1) + fib(n-2);
    }
}
