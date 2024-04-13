package anusha;
public class ReverseStringInStatements {

    /**
     * Reverses each word in a given string while keeping the order of the words unchanged.
     *
     * @param input The input string.
     * @return The string with each word reversed.
     */
    public static String reverseStringInStatements(String input) {
        // Split the input string into words
        String[] words = input.split("\\s+");

        // StringBuilder to store the reversed string
        StringBuilder reversed = new StringBuilder();

        // Iterate through each word
        for (String word : words) {
            // Reverse the word and append it to the StringBuilder
            StringBuilder reversedWord = new StringBuilder(word);
            reversed.append(reversedWord.reverse()).append(" ");
        }

        // Convert StringBuilder to string and trim any trailing spaces
        return reversed.toString().trim();
    }

    public static void main(String[] args) {
        String input = "Hello World, how are you?";
        String output = reverseStringInStatements(input);
        System.out.println(output);
    }
}
