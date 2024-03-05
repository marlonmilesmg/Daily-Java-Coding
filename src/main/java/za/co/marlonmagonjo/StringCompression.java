package za.co.marlonmagonjo;


/**
 * The time complexity of the compressString method is O(n), where n is the length of the input string.
 *
 * Here's the breakdown of the time complexity:
 *
 * Single Pass through the String: The method iterates through the input string once in a single pass, visiting each character exactly once.
 * The loop runs for n-1 iterations, where n is the length of the string.
 *
 * Append Operations: Inside the loop, there are constant-time operations (appending characters and counts) for each iteration.
 *
 * As a result, the overall time complexity is determined by the single pass through the string, making it O(n).
 * The method's efficiency scales linearly with the length of the input string.
 */
public class StringCompression {
    /**
     * Compresses the input string using the counts of repeated characters.
     *
     * @param s The input string to be compressed.
     * @return The compressed string if it is shorter than the original string;
     *         otherwise, returns "0" to indicate no compression benefit.
     */
    public static String compressString(String s) {

        // Handle edge case for an empty string
        if (s == null || s.isEmpty()) {
            return "0";
        }

        // StringBuilder to store the compressed string
        StringBuilder compressed = new StringBuilder();

        // Variable to keep track of consecutive character count
        int count = 1;

        // Iterate through the input string starting from the second character
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                compressed.append(s.charAt(i - 1)).append(count);
                count = 1;
            }
        }

        // Append the last character and its count to the compressed string
        compressed.append(s.charAt(s.length() - 1)).append(count);

        if (compressed.length() > s.length()) {
            return "0";
        } else {
            return compressed.toString();
        }
    }

    public static void main(String[] args) {
        String originalString = "mmaarrlloonn";
        String compressedResult = compressString(originalString);

        if (compressedResult.equals("0")) {
            System.out.println("Compressed string is not shorter than the original string. ");
        } else {
            System.out.println("Compressed string: " + compressedResult);
        }
    }
}

