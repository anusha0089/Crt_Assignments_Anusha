package anusha;
public class PrimeNumberChallenge {

    /**
     * Checks if a given number is prime.
     *
     * @param num The number to be checked.
     * @return true if the number is prime, false otherwise.
     */
    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
        // Test cases
        int[] testCases = {2, 3, 17, 20, 29};
        for (int num : testCases) {
            System.out.println(num + " is prime: " + isPrime(num));
        }
    }
}

