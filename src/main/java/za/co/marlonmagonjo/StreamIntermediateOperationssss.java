package za.co.marlonmagonjo;

import java.util.Arrays;

/**
 *  Intermediate Operations -
 *      Sorting streams
 *          - sorted(Comparator) - returns a stream with elements sorted based on comparator
 *          - sorted() - return stream sorted using natural order
 */

public class StreamIntermediateOperationssss {
    public static void main(String[] args) {
        String [] arr = {"ab", "a", "xy", "bc"};

        System.out.println("Sorting using natural order");
        Arrays.stream(arr)
                .sorted()
                .forEach(System.out::println);
        System.out.println("=======================================");

        System.out.println("Sorting using comparator");
        Arrays.stream(arr)
                .sorted((x, y) -> -1 * x.compareTo(y))
                .forEach(System.out::println);
        System.out.println("=======================================");

    }
}
