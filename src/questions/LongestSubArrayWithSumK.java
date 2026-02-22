package questions;

import java.util.HashMap;

public class LongestSubArrayWithSumK {
    //  Given an array arr[] of size n containing integers,
    //  the task is to find the length of the longest subarray having sum equal to the given value k.
    public static int longestSubarray(int[] arr, int k) {
        int sum = 0;
        int maxLen = 0;

        HashMap<Integer, Integer> sumIndex = new HashMap<>();
        sumIndex.put(0, -1);

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            int expected = sum - k;

            if (sumIndex.containsKey(expected)) {
                int len = i - sumIndex.get(expected);
                maxLen = Math.max(maxLen, len);
            }

            if (!sumIndex.containsKey(expected)) {
                sumIndex.put(sum, i);
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, -2, 4};
        int k = 6;

        System.out.println("Longest subarray with length: " + k + " is of length: " + longestSubarray(arr, k));
    }
}
