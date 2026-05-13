package streams;

import collections.old.util.PrintUtil;

import java.util.Arrays;
import java.util.List;

public class Question1 {
    public static void main(String[] args) {
        // 1. Filter even numbers
        List<Integer> evenNum = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("Even Numbers: ");
        evenNum.stream().filter(x -> x % 2 == 0).forEach(x -> System.out.print(x + " "));
        PrintUtil.printLineSeparator();

        // 2. Convert all strings to uppercase
        List<String> words = Arrays.asList("java", "stream", "api");
        System.out.println("Convert to uppercase:");
        System.out.println(words.stream().map(String::toUpperCase).toList());
        PrintUtil.printLineSeparator();

        // 3. Find numbers greater than 50
        List<Integer> nums = List.of(10, 60, 30, 80, 25);
        System.out.println("Numbers greater than 50:");
        System.out.print(nums.stream().filter(num -> num > 50).toList());
        PrintUtil.printLineSeparator();
    }
}
