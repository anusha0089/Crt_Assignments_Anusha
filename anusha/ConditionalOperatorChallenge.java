package anusha;
public class ConditionalOperatorChallenge {

    // Method to find the maximum of three integers using conditional operators only
    public static int findMax(int a, int b, int c) {
        // Compare a and b, then compare the result with c to find the maximum
        int max = (a > b ? a : b) > c ? (a > b ? a : b) : c;
        return max;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(findMax(3, 7, 2));   // Expected output: 7
        System.out.println(findMax(-1, -5, -3)); // Expected output: -1
        System.out.println(findMax(10, 10, 10)); // Expected output: 10
        System.out.println(findMax(8, 12, 8));   // Expected output: 12
        System.out.println(findMax(0, -2, 5));   // Expected output: 5
    }
}

