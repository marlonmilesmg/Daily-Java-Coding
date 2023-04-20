package za.co.marlonmagonjo;

import java.util.Arrays;

/**
 *  Intermediate Operations -
 *      Filtering and Mapping
 *          distinct() - returns a stream with no duplicates
 *          filter(Predicate) - returns a stream of elements which only those elements for which the predicate returns true
 *          map(Function) - returns a stream where the given function is applied on each element of input stream
 *          mapToInt(), mapToDouble(), mapToLong() - produces the stream of primitives not objects
 */

public class StreamsIntermediateOperations {
    public static void main(String[] args) {
        int [] arr = {1, 1, 2, 3, 4, 4, 5, 6};

        System.out.println("Distinct values with Streams");
        Arrays.stream(arr)
                .distinct()
                .forEach(System.out::println);

        System.out.println("=====================================");
        System.out.println(" Distinct values greater than 3");
        Arrays.stream(arr)
                .distinct()
                .filter(x -> x > 3)
                .forEach(System.out::println);

        System.out.println("==========================================");
        System.out.println("Distinct values greater than 2 and their squares");
        Arrays.stream(arr)
                .distinct()
                .filter(x -> x > 2)
                .map(x -> x * x)
                .forEach(System.out::println);

    }
}
