package za.co.marlonmagonjo;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *  Intermediate Operations -
 *    Restricting the size of the stream
 *          skip(long n) - skips the first n elements of the stream
 *
 *          limit(long n) - returns the stream that contains only the first n elements of the stream
 *
 */

public class StreamIntermediateOperationsss {
    public static void main(String[] args) {
        String [] arr = {"this", "is", "sample", "string", "with", "simple", "text"};

        String str1 = Stream.of(arr)
                            .skip(2)
                            .collect(Collectors.joining(" "));
        System.out.println( str1 );
        System.out.println("=========================================================");

        String str2 = Stream.of(arr)
                .skip(2)
                .limit(2)
                .collect(Collectors.joining(" "));
        System.out.println( str2 );
        System.out.println("=========================================================");
    }
}
