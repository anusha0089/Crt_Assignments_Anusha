package anusha;
public class MaxElementInArray {
    public static void main(String[] args) {
        int[] arr = {5, 3, 9, 1, 7};
        int max = findMax(arr);
        System.out.println("Maximum element in the array: " + max);
    }
    
    public static int findMax(int[] arr) {
        // Initialize max to the first element of the array
        int max = arr[0];
        
        // Iterate through the array starting from the second element
        for (int i = 1; i < arr.length; i++) {
            // Update max if the current element is greater than max
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        
        // Return the maximum element found
        return max;
    }
}

