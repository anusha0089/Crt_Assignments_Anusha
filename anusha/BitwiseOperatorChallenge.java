package anusha;
public class BitwiseOperatorChallenge {

    // Implement the bitwise OR operation
    public static int bitwiseOperation(int num1, int num2) {
        return num1 | num2;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(bitwiseOperation(5, 3)); // Expected output: 7
        System.out.println(bitwiseOperation(10, 15)); // Expected output: 15
        System.out.println(bitwiseOperation(8, 4)); // Expected output: 12
        System.out.println(bitwiseOperation(7, 2)); // Expected output: 7
        System.out.println(bitwiseOperation(0, 0)); // Expected output: 0
    }
}
