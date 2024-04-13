package anusha;
public class Fibonacci {
	// Method to generate the Fibonacci series up to n terms
    public static int[] generateFibonacci(int n) {
        int[] fibonacciSeries = new int[n];
        
        if (n >= 1) {
            fibonacciSeries[0] = 0;
        }
        if (n >= 2) {
            fibonacciSeries[1] = 1;
        }
        for (int i = 2; i < n; i++) {
            fibonacciSeries[i] = fibonacciSeries[i - 1] + fibonacciSeries[i - 2];
        }
        
        return fibonacciSeries;
    }
    
    // Method to print Fibonacci series up to n terms
    public static void printFibonacci(int n) {
        int[] fibonacciSeries = generateFibonacci(n);
        
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciSeries[i]);
            if (i < n - 1) {
                System.out.print(", ");
            }
        }
    }

    public static void main(String[] args) {
        int n = 10; // Change the value of n as needed
        System.out.println("Fibonacci series up to " + n + " terms:");
        printFibonacci(n);
    }
}
