package anusha;
public class StringConcatenationChallenge {
    
    public static String concatenateStrings(String str1, String str2) {
        // Calculate the length of the concatenated string
        int length = str1.length() + str2.length();
        // Create a character array to store the concatenated string
        char[] result = new char[length];
        // Copy characters from the first string to the result array
        for (int i = 0; i < str1.length(); i++) {
            result[i] = str1.charAt(i);
        }
        // Copy characters from the second string to the result array
        for (int i = 0; i < str2.length(); i++) {
            result[str1.length() + i] = str2.charAt(i);
        }
        // Convert the character array to a string
        return new String(result);
    }

    public static void main(String[] args) {
        // Test cases
        String result1 = concatenateStrings("Hello", "World");
        System.out.println(result1); // Expected output: "HelloWorld"
        
        String result2 = concatenateStrings("", "Concatenate");
        System.out.println(result2); // Expected output: "Concatenate"
        
        String result3 = concatenateStrings("Java", "");
        System.out.println(result3); // Expected output: "Java"
        
        String result4 = concatenateStrings("Good", "Morning");
        System.out.println(result4); // Expected output: "GoodMorning"
        
        String result5 = concatenateStrings("Concatenate", "Strings");
        System.out.println(result5); // Expected output: "ConcatenateStrings"
    }
}
