package anusha;
public class RMSChallenge {

    public static double calculateRMS(double[] numbers) {
        double sumOfSquares = 0;

        // Calculate the sum of the squares of all numbers
        for (double num : numbers) {
            sumOfSquares += num * num;
        }

        // Calculate the mean of the squares
        double meanOfSquares = sumOfSquares / numbers.length;

        // Calculate the square root of the mean to find the RMS
        return Math.sqrt(meanOfSquares);
    }

    public static void main(String[] args) {
        // Test cases
        double[] numbers1 = {3, 4, 5};
        double[] numbers2 = {1, 2, 3, 4, 5};
        double[] numbers3 = {10, 10, 10, 10};
        double[] numbers4 = {0, 0, 0, 0, 0};
        double[] numbers5 = {-2, -4, 6, 8};

        System.out.println("RMS of numbers1: " + calculateRMS(numbers1));
        System.out.println("RMS of numbers2: " + calculateRMS(numbers2));
        System.out.println("RMS of numbers3: " + calculateRMS(numbers3));
        System.out.println("RMS of numbers4: " + calculateRMS(numbers4));
        System.out.println("RMS of numbers5: " + calculateRMS(numbers5));
    }
}
