package anusha;
public class IncrementDecrementChallenge {

    public static void main(String[] args) {
        // Test cases
        testCases();
    }
    
    // Test cases
    public static void testCases() {
        // Test case 1: Incrementing an integer variable
        int num1 = 5;
        System.out.println("Initial value of num1: " + num1);
        System.out.println("Postfix increment of num1: " + num1++);
        System.out.println("Value of num1 after postfix increment: " + num1);
        num1 = 5; // Reset num1
        System.out.println("Prefix increment of num1: " + ++num1);
        System.out.println("Value of num1 after prefix increment: " + num1);
        
        // Test case 2: Decrementing a double variable
        double num2 = 10.5;
        System.out.println("\nInitial value of num2: " + num2);
        System.out.println("Postfix decrement of num2: " + num2--);
        System.out.println("Value of num2 after postfix decrement: " + num2);
        num2 = 10.5; // Reset num2
        System.out.println("Prefix decrement of num2: " + --num2);
        System.out.println("Value of num2 after prefix decrement: " + num2);
        
        // Test case 3: Incrementing and decrementing within expressions
        int a = 5;
        int b = 10;
        int result1 = ++a + b--;
        System.out.println("\nResult of expression (++a + b--): " + result1);
        
        // Test case 4: Decrementing before assignment
        int x = 10;
        int y = --x;
        System.out.println("y after decrementing x: " + y);
        
        // Test case 5: Incrementing after assignment
        int p = 20;
        int q = p++;
        System.out.println("q after assigning p to q: " + q);
    }
}
