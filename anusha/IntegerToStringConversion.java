package anusha;
public class IntegerToStringConversion {

    // Method to convert integer to string without using Integer.toString()
    public static String intToString(int num) {
        // Handle the case when num is 0 separately
        if (num == 0) {
            return "0";
        }

        StringBuilder sb = new StringBuilder();

        // Handle the case when num is negative
        boolean isNegative = num < 0;
        if (isNegative) {
            num = -num; // Make num positive
        }

        // Extract digits one by one and append them to the string
        while (num > 0) {
            int digit = num % 10;
            sb.append((char)('0' + digit)); // Convert digit to character representation
            num /= 10;
        }

        // Reverse the string to get the correct order of digits
        sb.reverse();

        // Add '-' sign if the number was negative
        if (isNegative) {
            sb.insert(0, '-');
        }

        return sb.toString();
    }

    // Test cases
    public static void main(String[] args) {
        int[] testCases = {123, -456, 0, 789, -987};

        for (int num : testCases) {
            System.out.println("Integer: " + num + ", String: " + intToString(num));
        }
    }
}

