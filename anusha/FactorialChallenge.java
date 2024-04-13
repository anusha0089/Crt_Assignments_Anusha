package anusha;
public class FactorialChallenge {

    public static int factorial(int n) {
        // Initialize the factorial result to 1
        int factorial = 1;

        // Check if n is zero or negative
        if (n <= 0) {
            return 1; // Factorial of 0 or negative number is 1
        } else {
            // Iterate from 1 to n
            for (int i = 1; i <= n; i++) {
                // Multiply factorial by the current value of i
                factorial *= i;
            }
            // Return the factorial
            return factorial;
        }
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(factorial(0)); // Expected: 1
        System.out.println(factorial(1)); // Expected: 1
        System.out.println(factorial(5)); // Expected: 120
        System.out.println(factorial(10)); // Expected: 3628800
        System.out.println(factorial(15)); // Expected: 1307674368000
    }
}
