package questions;

public class ReverseString {
    public static void main(String[] args) {
        String s = "hello world";

        // 1. Without inbuilt method
        String reverse = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            reverse += s.charAt(i);
        }

        System.out.println(reverse);

        // 2. without inbuilt but string builder append

        StringBuilder reverse1 = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i--) {
            reverse1.append(s.charAt(i));
        }

        System.out.println(reverse1);


        // 3. with inbuilt method
        System.out.println(new StringBuilder(s).reverse());
    }
}