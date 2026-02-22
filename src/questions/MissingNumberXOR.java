package questions;

public class MissingNumberXOR {
    // for large numbers
    public static int missingNumber(int[] arr) {
        int range = arr.length + 1;
        int xor1 = 0;
        int xor2 = 0;

        // XOR of all array elements
        for (int i : arr) {
            xor2 ^= i;
        }

        for (int i = 1; i <= range; i++) {
            xor1 ^= i;
        }

        return xor1 ^ xor2;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,5,4};

        System.out.println(missingNumber(arr));
    }
}
