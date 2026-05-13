package streams;

import collections.old.util.PrintUtil;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class QuestionSet3 {
    public static void main(String[] args) {
        // 7. Square each number and return list
        List<Integer> list = Arrays.asList(1,2,3);
        System.out.println("Squaring each number: ");
        System.out.println(list.stream().map(x -> x * x).toList());
        PrintUtil.printLineSeparator();

        // 8. Count how many numbers are even
        List<Integer> numbers = List.of(1,2,3,4,5,6);
        System.out.println("Count how many numbers are even: ");
        System.out.println(numbers.stream().filter(x -> x % 2 == 0).count());
        PrintUtil.printLineSeparator();

        // 9. Find first element greater than 10
        List<Integer> li1 = List.of(5, 8, 12, 20);
        System.out.println("Find first element greater than 10: ");
        System.out.println(li1.stream().filter(num -> num > 10).findFirst().orElseThrow());
        PrintUtil.printLineSeparator();

        // 10. Filter even → square → sort descending
        System.out.println("Filter even -> Square -> Sort desc: ");
        System.out.println(numbers.stream().filter(num -> num % 2 == 0).map(num -> num * num).sorted(Comparator.reverseOrder()).toList());

        // 11. Find second-highest number
        System.out.println("Second highest number: ");
        System.out.println(numbers.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElseThrow());
    }
}
