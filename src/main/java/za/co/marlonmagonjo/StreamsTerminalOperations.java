package za.co.marlonmagonjo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
findFirst() - finds the first element that matched
findAny() - finds any element with out focusing on the order of occurrence
boolean allMatch(Predicate p)
boolean anyMatch(Predicate p)
boolean noneMatch(Predicate p)
collect(Collector c) - performs a mutable reduction on the stream
toArray() - returns an array
forEach(Consumer c) - consume the elements of the stream
*/

public class StreamsTerminalOperations {
    public static void main(String[] args) {
        String [] arr = {"asd", "qwe", "zxc", "dfghj", "rtyu"};

        // find the first 4 digit string
        Optional<String> stringOptional = Arrays.stream(arr)
                .filter( x -> x.length() == 4)
                .findFirst();

        System.out.println(stringOptional);
        System.out.println("======================================");

        if(stringOptional.isPresent()){
            System.out.println("The first string with 4 digits is: " + stringOptional.get());
        }

        // check if all strings are of 3 char length
        boolean check = Arrays.stream(arr)
                .allMatch( x -> x.length() == 3);

        System.out.println("result is: " + check);

        System.out.println("============================================");

        List<String> list = Stream.of(arr)
                .collect(Collectors.toList());
        System.out.println(list);
    }
}
