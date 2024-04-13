package anusha;
public class CircleAreaCalculator {
	// Method to calculate the area of a circle
    public static double calculateArea(double radius) {
        // Calculate the area using the formula: π * radius * radius
        return Math.PI * radius * radius;
    }
    
    public static void main(String[] args) {
        // Test cases
        double[] radii = {2.0, 3.5, 5.0, 7.2, 10.0};
        
        for (double radius : radii) {
            System.out.println("Radius: " + radius + ", Area: " + calculateArea(radius));
        }
    }
}
