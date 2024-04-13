package anusha;
public class TernaryOperatorChallenge {
    public static void main(String[] args) {
        // Test cases
        System.out.println(findMax(5, 10, 3)); // Expected output: 10
        System.out.println(findMax(15, 2, 7)); // Expected output: 15
        System.out.println(findMax(8, 8, 8)); // Expected output: 8
        System.out.println(findMax(-1, -5, -3)); // Expected output: -1
        System.out.println(findMax(0, 0, 0)); // Expected output: 0
    }

    public static int findMax(int a, int b, int c) {
        // Use ternary operator to find the maximum of three integers
        int max = a > b ? (a > c ? a : c) : (b > c ? b : c);
        return max;
    }
}

