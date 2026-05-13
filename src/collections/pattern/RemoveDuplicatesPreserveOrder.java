package collections.pattern;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicatesPreserveOrder {
    public static void main(String[] args) {
        List<Integer> nums = List.of(4, 2, 7, 4, 2, 9, 1, 7);

        // 1. Set
        Set<Integer> set = new LinkedHashSet<>(nums);
        System.out.println(set);

        // 2. Streams
        System.out.println(nums.stream().collect(Collectors.toCollection(LinkedHashSet::new)).stream().toList());


    }
}
