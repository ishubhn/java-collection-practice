package questions;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicates {
    // find duplicates in a list
    public static Set<Integer> findDuplicates(int[] arr) {
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int i : arr) {
            if (!seen.add(i)) {
                duplicates.add(i);
            }
        }

        return duplicates;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,2,4,6,7};

        System.out.println(findDuplicates(arr));
    }
}
