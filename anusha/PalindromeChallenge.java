package anusha;
public class PalindromeChallenge {

    public static boolean isPalindrome(String statement) {
        // Remove spaces and punctuation, and convert to lowercase
        String cleanedStatement = statement.replaceAll("[^a-zA-Z]", "").toLowerCase();

        // Check if the cleaned statement is equal to its reverse
        return cleanedStatement.equals(new StringBuilder(cleanedStatement).reverse().toString());
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(isPalindrome("A man, a plan, a canal, Panama")); // Should return true
        System.out.println(isPalindrome("racecar")); // Should return true
        System.out.println(isPalindrome("hello")); // Should return false
        System.out.println(isPalindrome("Was it a car or a cat I saw?")); // Should return true
        System.out.println(isPalindrome("No lemon, no melon")); // Should return true
    }
}

