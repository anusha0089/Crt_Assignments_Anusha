package anusha;
public class SumOfDigitsChallenge {

    public static int sumOfDigits(int num) {
        int sum = 0;

        // Iterate until num becomes 0
        while (num != 0) {
            // Extract the last digit of num
            int digit = num % 10;

            // Add the digit to the sum
            sum += digit;

            // Remove the last digit from num
            num /= 10;
        }

        // Return the sum of digits
        return sum;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(sumOfDigits(123)); // Expected output: 6
        System.out.println(sumOfDigits(456)); // Expected output: 15
        System.out.println(sumOfDigits(789)); // Expected output: 24
        System.out.println(sumOfDigits(9876)); // Expected output: 30
        System.out.println(sumOfDigits(321)); // Expected output: 6
    }
}

