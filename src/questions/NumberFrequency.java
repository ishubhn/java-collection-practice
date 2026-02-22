package questions;

import java.util.HashMap;
import java.util.Map;

public class NumberFrequency {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 4, 5, 3, 5, 2, 5};

        Map<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        System.out.println(map);
    }
}
