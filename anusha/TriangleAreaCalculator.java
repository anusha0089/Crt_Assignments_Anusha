package anusha;
import java.util.Scanner;

public class TriangleAreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input the lengths of the three sides of the triangle
        System.out.println("Enter the lengths of the three sides of the triangle:");
        double sideA = scanner.nextDouble();
        double sideB = scanner.nextDouble();
        double sideC = scanner.nextDouble();
        
        // Calculate the semi-perimeter of the triangle
        double semiPerimeter = (sideA + sideB + sideC) / 2;
        
        // Calculate the area of the triangle using Heron's formula
        double area = Math.sqrt(semiPerimeter * (semiPerimeter - sideA) * (semiPerimeter - sideB) * (semiPerimeter - sideC));
        
        // Output the area of the triangle
        System.out.println("Area of the triangle: " + area);
        
        scanner.close();
    }
}
