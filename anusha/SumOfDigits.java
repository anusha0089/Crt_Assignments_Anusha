package anusha;
public class SumOfDigits {
    public static int sumDigits(int num) {
        // Repeat the process until the result has only one digit
        while (num >= 10) {
            int sum = 0;
            // Calculate the sum of digits of num
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum; // Update num with the sum of digits
        }
        return num;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(sumDigits(38)); // Expected output: 2
        System.out.println(sumDigits(123)); // Expected output: 6
        System.out.println(sumDigits(999)); // Expected output: 9
        System.out.println(sumDigits(8765)); // Expected output: 8
        System.out.println(sumDigits(0)); // Expected output: 0
    }
}

