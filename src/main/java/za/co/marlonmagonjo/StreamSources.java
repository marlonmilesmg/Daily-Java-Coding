package za.co.marlonmagonjo;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 *  Stream Sources -
 *       Collection -
 *         stream()
 *             - sequential stream of elements in a collection
 *       Arrays -
 *         stream()
 *             - sequential stream of elements of an array
 *
 *       Files class -
 *         lines()
 *             - A stream of lines from the given file
 *
 *      Static methods of the Stream class -
 *
 *          concat(Stream, Stream) - for concatenated streams
 *          of(T... values) - values to stream
 *          generate(Supplier) - Infinite stream
 *          range(int, int) or rangeClosed(int, int) - range of values (only for IntStream)
 *
 */

public class StreamSources {

    static int myGenerator(){
        return new Random().nextInt();
    }
    public static void main(String[] args) {

        Stream<String> stream1 = Stream.of("a", "b", "c");
        Stream<String> stream2 = Stream.of("x", "y", "z");

        Stream.concat(stream1, stream2)
                .forEach(System.out::println);
        System.out.println("====================================================");

        // output - 10 - 24 (Finite Stream)
        IntStream.range(10, 25)
                .forEach(System.out::println);
        System.out.println("=======================================================");

        // output 10 - 25 (Finite Stream)
        IntStream.rangeClosed(10, 25)
                .forEach(System.out::println);
        System.out.println("==========================================================");

        // endless output - Infinite Stream
        Stream.generate(() -> myGenerator())
                .forEach(System.out::println);
    }
}
