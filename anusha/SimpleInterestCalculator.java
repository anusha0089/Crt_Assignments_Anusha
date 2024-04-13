package anusha;

import java.util.Scanner;

public class SimpleInterestCalculator {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for principal amount
        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();

        // Take input for annual interest rate
        System.out.print("Enter the annual interest rate (in percentage): ");
        double rate = scanner.nextDouble();

        // Take input for time in years
        System.out.print("Enter the time in years: ");
        double time = scanner.nextDouble();

        // Calculate simple interest
        double simpleInterest = (principal * rate * time) / 100;

        // Print the simple interest
        System.out.println("Simple interest: " + simpleInterest);

        // Close the scanner
        scanner.close();
    }
}
