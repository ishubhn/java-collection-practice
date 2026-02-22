package questions;

public class Palindrome {
    public static void main(String[] args) {
        String s = "madam";

        // 1. reverse string method
        String reverse = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            reverse += s.charAt(i);
        }

        if (s.equals(reverse)) {
            System.out.println("it is palindrome");
        } else {
            System.out.println("Not a palidrome");
        }

        // 2. two pointers
        String s1 = "madam";
        int left = 0; // left pointer
        int right = s1.length() - 1; // right pointer
        boolean isPalindrome = true; // flag true as default

        while (left < right) {
            if (s1.charAt(left) != s1.charAt(right)) {
                isPalindrome = false;
                break;
            }

            left++;
            right--;
        }

        if (isPalindrome) {
            System.out.println("This one is palindrome too!");
        } else {
            System.out.println("This is not palindrome at all");
        }
    }
}
