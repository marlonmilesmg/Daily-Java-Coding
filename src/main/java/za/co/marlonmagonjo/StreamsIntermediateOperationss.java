package za.co.marlonmagonjo;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 *  Intermediate Operations -
 *      Maps and FlatMaps -
 *          map() - 1 to 1 mapping
 *          [ [1] , [2, 3, 4] , [5, 6] ]
 *          flatMap() - 1 to N mapping
 *          [1, 2, 3, 4, 5, 6]
 */

public class StreamsIntermediateOperationss {
    public static void main(String[] args) {
        String [] arr = {"this", "this is", "a test sentence"};

        System.out.println("Using map()");
        Stream.of(arr)
                .map(x -> x.split(" "))
                .forEach(x -> System.out.println(Arrays.toString(x)));
        System.out.println("================================================");

        System.out.println("Using flatMap()");
        Stream.of(arr)
                .flatMap(x -> Stream.of(x.split(" ")))
                .forEach(x -> System.out.println(x));
        System.out.println("===================================================");
    }
}
