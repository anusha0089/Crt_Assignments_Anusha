package anusha;

public class SumOfDigits1 {
	public static int sumDigits(int num) {
        // If num is 0, return 0
        if (num == 0) return 0;
        // Calculate the digital root using the formula
        return 1 + ((num - 1) % 9);
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
