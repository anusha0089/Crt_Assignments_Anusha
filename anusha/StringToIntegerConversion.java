package anusha;
public class StringToIntegerConversion {

    public static int stringToInteger(String str) {
        if (str == null || str.isEmpty()) {
            return 0; // Return 0 for empty or null input
        }

        int index = 0;
        int result = 0;
        int sign = 1;

        // Check for sign character
        if (str.charAt(index) == '-') {
            sign = -1;
            index++;
        } else if (str.charAt(index) == '+') {
            index++;
        }

        // Iterate through the remaining characters and convert them to integer
        while (index < str.length() && Character.isDigit(str.charAt(index))) {
            int digit = str.charAt(index) - '0'; // Convert character to digit
            // Check for overflow before adding the next digit
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && digit > 7)) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            result = result * 10 + digit;
            index++;
        }

        return result * sign;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(stringToInteger("123")); // Expected: 123
        System.out.println(stringToInteger("-456")); // Expected: -456
        System.out.println(stringToInteger("7890")); // Expected: 7890
        System.out.println(stringToInteger("+42")); // Expected: 42
        System.out.println(stringToInteger("-")); // Expected: 0
    }
}
