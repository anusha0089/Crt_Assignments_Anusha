package anusha;
public class FactorialCalculator {
    public static int calculateFactorial(int n) {
        // Base case: factorial of 0 is 1
        if (n == 0) {
            return 1;
        }
        
        // Initialize the factorial value to 1
        int factorial = 1;

        // Iterate from 1 to n and multiply each number to the factorial
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        return factorial;
    }

    public static void main(String[] args) {
        // Test cases
        int[] testCases = {5, 0, 1, 10, 3};
        for (int n : testCases) {
            System.out.println("Factorial of " + n + " is: " + calculateFactorial(n));
        }
    }
}
