package anusha;
import java.util.Scanner;

public class AssignmentOperatorChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter two integers
        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();
        
        // Perform addition assignment (+=)
        int resultAddition = num1;
        resultAddition += num2;

        // Perform subtraction assignment (-=)
        int resultSubtraction = num1;
        resultSubtraction -= num2;

        // Perform multiplication assignment (*=)
        int resultMultiplication = num1;
        resultMultiplication *= num2;

        // Perform division assignment (/=)
        int resultDivision = num1;
        resultDivision /= num2;

        // Perform modulus assignment (%=)
        int resultModulus = num1;
        resultModulus %= num2;

        // Display the result of each operation
        System.out.println("Result of addition assignment (+=): " + resultAddition);
        System.out.println("Result of subtraction assignment (-=): " + resultSubtraction);
        System.out.println("Result of multiplication assignment (*=): " + resultMultiplication);
        System.out.println("Result of division assignment (/=): " + resultDivision);
        System.out.println("Result of modulus assignment (%=): " + resultModulus);
        
        scanner.close();
    }
}

