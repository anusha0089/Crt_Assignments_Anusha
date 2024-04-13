package anusha;
public class VariableSwap {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        
        // Swap the values without using a temporary variable
        a = a + b;
        b = a - b;
        a = a - b;
        
        // Print the swapped values
        System.out.println("After swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}

