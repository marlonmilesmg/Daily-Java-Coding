package za.co.marlonmagonjo;

import java.util.Arrays;

/**
 *  Folding Streams -
 *      reduce(BinaryOperator accumulator)
 *      reduce(Identity, BinaryOperator accumulator)
 *          - Takes a stream and reduces it to a single value
 *          - How the reduction works is defined by the accumulator
 *          - reduce() method maintains a partial state
 */

public class StreamsFolding {
    public static void main(String[] args) {
        int [] arr = {10, 20, 30, 40};

        // sum of the values of the array
        int sum = Arrays.stream(arr)
                    .reduce(0, (x, y) -> x + y);
        System.out.println( sum );
        System.out.println("=========================================");

        int sum1 = Arrays.stream(arr)
                .reduce(0, (x, y) -> {
                    System.out.println("x is " + x + ", y is " + y);
                   return x + y;
                });
        System.out.println( sum1 );
        System.out.println("=========================================");

        // product of the values in the array
        int product = Arrays.stream(arr)
                .reduce(1, (x, y) -> {
                    System.out.println("x is " + x + ", y is " + y);
                    return x * y;
                });
        System.out.println( product );
        System.out.println("=========================================");
    }
}
