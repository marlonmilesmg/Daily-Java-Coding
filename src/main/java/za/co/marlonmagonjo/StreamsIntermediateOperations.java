package za.co.marlonmagonjo;

import java.util.Arrays;

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
