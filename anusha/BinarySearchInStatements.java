package anusha;
public class BinarySearchInStatements {

    public static int binarySearch(String[] statements, String target) {
        int left = 0;
        int right = statements.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            int compareResult = target.compareTo(statements[mid]);

            if (compareResult == 0) {
                return mid; // Target found
            } else if (compareResult < 0) {
                right = mid - 1; // Target is in the left half
            } else {
                left = mid + 1; // Target is in the right half
            }
        }

        return -1; // Target not found
    }

    public static void main(String[] args) {
        // Test cases
        String[] statements = {"apple", "banana", "cherry", "grape", "orange", "strawberry"};
        String target1 = "banana";
        String target2 = "kiwi";
        String target3 = "orange";
        String target4 = "grapefruit";
        String target5 = "apple";

        System.out.println(binarySearch(statements, target1)); // Output: 1
        System.out.println(binarySearch(statements, target2)); // Output: -1
        System.out.println(binarySearch(statements, target3)); // Output: 4
        System.out.println(binarySearch(statements, target4)); // Output: -1
        System.out.println(binarySearch(statements, target5)); // Output: 0
    }
}
