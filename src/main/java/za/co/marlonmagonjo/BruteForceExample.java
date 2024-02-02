package za.co.marlonmagonjo;

public class BruteForceExample {

    public static int findMinimum(int[] array) {
        // Initialize the minimum value to the maximum possible integer value
        int min = Integer.MAX_VALUE;

        // Iterate through each element in the array
        for (int i = 0; i < array.length; i++) {
            // Check if the current element is less than the current minimum
            if (array[i] < min) {
                // If yes, update the minimum value
                min = array[i];
            }
        }

        // Return the minimum value found
        return min;
    }

    public static void main(String[] args) {
        // Example array
        int[] exampleArray = {5, 2, 8, 3, 1, 7};

        // Find the minimum using the Brute Force approach
        int minimumValue = findMinimum(exampleArray);

        // Print the result
        System.out.println("Minimum value in the array: " + minimumValue);
    }
}

