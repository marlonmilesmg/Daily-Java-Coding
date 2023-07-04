package za.co.marlonmagonjo;

import java.util.Arrays;

/**
 *  Implement the findSmallestInterval(numbers) method in java which returns the smallest positive interval between two values of the numbers table.
 * <p>
 *  For example given the table [1, 6, 4, 8,2] the smallest interval is 1 (difference between 2 and 1)
 * <p>
 *  Constraints:
 *      1. numbers contains at least two numbers and a maximum of 100000 entries.
 *      2. The solutions which favor execution time on large size arrays will get the most points.
 *      3.  The difference between two elements will never exceed the size of an integer
 *
 */
public class SmallestInterval {

    public static int findSmallestInterval(int[] numbers) {

        Arrays.sort(numbers);

        int smallestInterval = Integer.MAX_VALUE;

        // Iterate through the sorted array and find the smallest interval
        for (int i = 1; i < numbers.length; i++) {
            int currentInterval = numbers[i] - numbers[i - 1];
            if (currentInterval < smallestInterval) {
                smallestInterval = currentInterval;
            }
        }

        return smallestInterval;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 6, 4, 8, 2};
        int smallestInterval = findSmallestInterval(numbers);
        System.out.println("Smallest interval: " + smallestInterval);
    }

}
