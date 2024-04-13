package anusha;
public class MaxNumberFinder {
    public static int findMax(int[] nums) {
        // Check if the array is empty
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }

        // Initialize the maximum number to the first element of the array
        int max = nums[0];

        // Iterate through the array starting from the second element
        for (int i = 1; i < nums.length; i++) {
            // If the current element is greater than the current maximum,
            // update the maximum number
            if (nums[i] > max) {
                max = nums[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        // Test cases
        int[] test1 = {1, 2, 3, 4, 5};
        System.out.println("Max number in test1: " + findMax(test1)); // Expected: 5
        
        int[] test2 = {-1, -5, -2, -9};
        System.out.println("Max number in test2: " + findMax(test2)); // Expected: -1
        
        int[] test3 = {10, 5, 20, 15};
        System.out.println("Max number in test3: " + findMax(test3)); // Expected: 20
        
        int[] test4 = {0};
        System.out.println("Max number in test4: " + findMax(test4)); // Expected: 0
        
        int[] test5 = {-10, -20, -5, -3};
        System.out.println("Max number in test5: " + findMax(test5)); // Expected: -3
    }
}
