package streams;

import collections.old.util.PrintUtil;

import java.util.Comparator;
import java.util.List;

public class QuestionSet2 {
    public static void main(String[] args) {
        // 4. Remove duplicates
        List<Integer> nums = List.of(1,2,2,3,4,4,5);
        System.out.println("Remove duplicates from list: ");
        //  System.out.println(nums.stream().collect(Collectors.toSet()));
        System.out.println(nums.stream().distinct().toList());
        PrintUtil.printLineSeparator();

        // 5. Sort numbers in descending order
        List<Integer> numbers = List.of(5,1,9,3);
        System.out.println("Sorting in desc order:");
        System.out.println(numbers.stream().sorted(Comparator.reverseOrder()).toList());
        PrintUtil.printLineSeparator();

        // 6. Find max number using streams
        System.out.println("Max number in the stream: ");
        // System.out.println(numbers.stream().sorted(Comparator.reverseOrder()).findFirst().get());
        // System.out.println(numbers.stream().max(Integer::compareTo).orElseThrow());
        System.out.println(numbers.stream().reduce(Integer::max).orElseThrow());
    }
}
