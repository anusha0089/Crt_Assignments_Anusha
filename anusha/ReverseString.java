package anusha;
public class ReverseString {
	public static String reverseString(String str) {
		 if (str == null || str.isEmpty()) {
	            return str;
	        }
	        // Convert the string to a character array
	        char[] charArray = str.toCharArray();
	        // Initialize pointers for swapping characters
	        int left = 0;
	        int right = charArray.length - 1;
	        // Swap characters from both ends until the pointers meet
	        while (left < right) {
	            // Swap characters at positions 'left' and 'right'
	            char temp = charArray[left];
	            charArray[left] = charArray[right];
	            charArray[right] = temp;
	            // Move the pointers towards the center
	            left++;
	            right--;
	        }
	        // Convert the character array back to a string
	        return new String(charArray);
	    }
	    public static void main(String[] args) {
	        // Test cases
	        System.out.println(reverseString("madam")); // Expected output: "madam"
	        System.out.println(reverseString("wow")); // Expected output: "wow"
	        System.out.println(reverseString("lalal")); // Expected output: "lalal"
	        System.out.println(reverseString("12121")); // Expected output: "12121"
	        System.out.println(reverseString("")); // Expected output: ""
	    }
	}