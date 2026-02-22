package questions;

public class PrimeNum {
    public static void main(String[] args) {
        int num = 23;
        boolean isPrimeNum = true;

        if (num <= 1) {
            isPrimeNum = false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % 2 == 0) {
                    isPrimeNum = false;
                    break;
                }
            }
        }

        if (isPrimeNum) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not Prime Number");
        }
    }
}
