package questions;

public class ReverseInteger {
    public static void main (String args[]) {
        int num = 12345;

        // 1.
        int reverse = 0;

        while (num != 0) {
            int digit = num % 10;
            reverse = (reverse * 10) + digit;
            num = num / 10;
        }

        System.out.println(reverse);

        // 2. with string builder
        int num1 = 54321;

        String rev = new StringBuilder(String.valueOf(num1)).reverse().toString();
        int result = Integer.parseInt(rev);

        System.out.println(result);
    }
}
