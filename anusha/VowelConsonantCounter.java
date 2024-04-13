package anusha;
public class VowelConsonantCounter {
	 public static void main(String[] args) {
	        String input = "Hello World";
	        System.out.println("Input string: " + input);
	        
	        int vowelCount = countVowels(input);
	        int consonantCount = countConsonants(input);
	        
	        System.out.println("Number of vowels: " + vowelCount);
	        System.out.println("Number of consonants: " + consonantCount);
	    }

	    // Method to count vowels
	    public static int countVowels(String str) {
	        int count = 0;
	        for (char c : str.toLowerCase().toCharArray()) {
	            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
	                count++;
	            }
	        }
	        return count;
	    }

	    // Method to count consonants
	    public static int countConsonants(String str) {
	        int count = 0;
	        for (char c : str.toLowerCase().toCharArray()) {
	            if (c >= 'a' && c <= 'z' && !isVowel(c)) {
	                count++;
	            }
	        }
	        return count;
	    }

	    // Helper method to check if a character is a vowel
	    public static boolean isVowel(char c) {
	        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
	    }
	}