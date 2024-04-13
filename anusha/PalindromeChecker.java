package anusha;

public class PalindromeChecker {
	public static boolean isPalindrome(String str) {
        // Remove spaces, punctuation, and convert to lowercase
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Initialize pointers for checking palindrome
        int left = 0;
        int right = str.length() - 1;

        // Check if the string is a palindrome
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        // Test cases
        String[] testCases = {
            "radar",
            "level",
            "hello",
            "A man, a plan, a canal, Panama",
            "12321"
        };

        for (String testCase : testCases) {
            System.out.println(testCase + " is a palindrome: " + isPalindrome(testCase));
        }
    }
}
