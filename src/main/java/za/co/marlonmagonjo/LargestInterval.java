package za.co.marlonmagonjo;

import java.util.Arrays;

/**
 *  Implement the findLargestInterval(numbers) method in java which returns the largest positive interval between two values of the numbers table.
 * <p>
 *  For example given the table [1, 6, 4, 8,2] the largest interval is 7 (difference between 8 and 1)
 * <p>
 *  Constraints:
 *      1. numbers contains at least two numbers and a maximum of 100000 entries.
 *      2. The solutions which favor execution time on large size arrays will get the most points.
 *      3.  The difference between two elements will never exceed the size of an integer
 *
 */

public class LargestInterval {

    public static int findLargestInterval(int[] numbers) {

        Arrays.sort(numbers);

        int largestInterval = Integer.MAX_VALUE;

            int currentInterval = numbers[numbers.length - 1] - numbers[0];
            if (currentInterval < largestInterval) {
                largestInterval = currentInterval;
            }

        return largestInterval;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 6, 4, 8, 2};
        int largestInterval = findLargestInterval(numbers);
        System.out.println("Largest interval: " + largestInterval);
    }

}
