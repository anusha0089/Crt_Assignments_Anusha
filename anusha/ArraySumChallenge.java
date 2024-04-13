package anusha;
public class ArraySumChallenge {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5}; // Sample array, you can change this
        int sum = findSum(array);
        System.out.println("Sum of array elements: " + sum);
    }

    public static int findSum(int[] array) {
        return findSumRecursive(array, 0, 0);
    }

    private static int findSumRecursive(int[] array, int index, int currentSum) {
        // Base case: If the index reaches the end of the array, return the current sum
        if (index == array.length) {
            return currentSum;
        }

        // Add the current element to the current sum
        currentSum += array[index];

        // Recursive call to process the next element
        return findSumRecursive(array, index + 1, currentSum);
    }
}

