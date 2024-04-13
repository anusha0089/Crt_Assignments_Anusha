package anusha;
public class QuadraticEquationSolver {

    public static void main(String[] args) {
        double a = 2.0;
        double b = -3.0;
        double c = 1.0;

        // Solve the quadratic equation
        solveQuadraticEquation(a, b, c);
    }

    public static void solveQuadraticEquation(double a, double b, double c) {
        // Calculate the discriminant
        double discriminant = b * b - 4 * a * c;

        // Check the nature of the roots
        if (discriminant > 0) {
            // Two real roots
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Roots are real and different:");
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        } else if (discriminant == 0) {
            // One real root (or two identical real roots)
            double root = -b / (2 * a);
            System.out.println("Roots are real and same:");
            System.out.println("Root: " + root);
        } else {
            // No real roots (roots are complex)
            System.out.println("Equation has no real roots.");
        }
    }
}
