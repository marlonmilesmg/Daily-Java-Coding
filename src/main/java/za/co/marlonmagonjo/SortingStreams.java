package za.co.marlonmagonjo;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SortingStreams {
    public static void main(String[] args) {
        String [] arr = {"ab", "ac", "asd", "AB", "ACD", "123"};

        System.out.println("Sorting using natural order");
        Arrays.stream(arr)
                .sorted()
                .forEach(System.out::println);

        System.out.println("============================================");
        System.out.println("Sorting using Comparator");
        Arrays.stream(arr)
                .sorted( (x, y) -> -1 * x.compareTo(y))
                .forEach(System.out::println);

        System.out.println("============================================");
        String str = Arrays.stream(arr)
                .collect(Collectors.joining(" "));
        System.out.println(str);
    }
}
