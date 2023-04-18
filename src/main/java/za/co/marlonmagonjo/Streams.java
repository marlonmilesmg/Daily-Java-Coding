package za.co.marlonmagonjo;

import java.util.Arrays;

/**
 *  Streams -
 *    Enable to define a pipeline of operations to process collections of data
 *    Consists three main things
 *      - Source
 *      - Zero or more intermediate operations
 *      - Terminal operation - result
 *    Pipeline is not evaluated till the terminal operation is invoked.
 *
 *    Example -
 *
 *    Sum of the squares of all the even numbers of an array
 *
 *    int arr[] = {1, 2, 3, 4, 5};
 *    int sum = Arrays.stream (arr) // source
 *                    .filter ( x -> x % 2 == 0 ) // intermediate operation
 *                    .map ( x -> x * x) // intermediate operation
 *                    .sum(); // terminal operation
 *
 */

public class Streams {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5};

        int sum = Arrays.stream(arr)
                .filter( x -> x % 2 == 0)
                .map( x -> x * x)
                .sum();

        System.out.println("Sum is: " + sum);
    }
}
