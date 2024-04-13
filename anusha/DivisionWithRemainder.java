package anusha;
public class DivisionWithRemainder {
    
    public static int[] divideWithRemainder(int dividend, int divisor) {
        // Initialize quotient and remainder
        int quotient = 0;
        int remainder = dividend; // Initialize remainder as the dividend
        
        // Subtract divisor from remainder until remainder is less than divisor
        while (remainder >= divisor) {
            remainder -= divisor;
            quotient++;
        }
        
        // Return quotient and remainder as an array
        return new int[]{quotient, remainder};
    }
    
    public static void main(String[] args) {
        // Test cases
        int[][] testCases = {
            {10, 3},
            {20, 5},
            {17, 3},
            {50, 7},
            {12, 4}
        };
        
        for (int[] testCase : testCases) {
            int dividend = testCase[0];
            int divisor = testCase[1];
            int[] result = divideWithRemainder(dividend, divisor);
            System.out.println("Dividend: " + dividend + ", Divisor: " + divisor + ", Quotient: " + result[0] + ", Remainder: " + result[1]);
        }
    }
}
