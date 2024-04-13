package anusha;
public class LinearSearchChallenge {

    public static int linearSearch(int[] arr, int target) {
        // Iterate through the array
        for (int i = 0; i < arr.length; i++) {
            // If the current element is equal to the target value, return its index
            if (arr[i] == target) {
                return i;
            }
        }
        // If the target value is not found, return -1
        return -1;
    }

    public static void main(String[] args) {
        // Test cases
        int[] arr1 = {1, 2, 3, 4, 5};
        int target1 = 3;
        System.out.println("Index of " + target1 + " in arr1: " + linearSearch(arr1, target1)); // Expected: 2

        int[] arr2 = {10, 20, 30, 40, 50};
        int target2 = 25;
        System.out.println("Index of " + target2 + " in arr2: " + linearSearch(arr2, target2)); // Expected: -1

        // Add more test cases here
    }
}
