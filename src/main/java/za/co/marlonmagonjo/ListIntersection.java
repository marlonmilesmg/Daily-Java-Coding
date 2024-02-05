package za.co.marlonmagonjo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListIntersection {

    public static List<Integer> intersection(List<Integer> first, List<Integer> second) {
        // Create sets from the lists to find the intersection
        Set<Integer> set1 = new HashSet<>(first);
        Set<Integer> set2 = new HashSet<>(second);

        // Find the intersection
        set1.retainAll(set2);

        // Convert the result set back to a list
        List<Integer> result = new ArrayList<>(set1);

        return result;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(intersection(List.of(1, 2, 3), List.of(9, 3, 4))); // [3]
        System.out.println(intersection(List.of(10, 35, 14), List.of(90, 35, 10, 14, 28))); // [10, 35, 14]
        System.out.println(intersection(List.of(100, 25, 134, 2, 4), List.of(4, 2))); // [4, 2]
        System.out.println(intersection(List.of(10, 35, 14), List.of())); // []
        System.out.println(intersection(List.of(10, 35, 14), List.of(1, 2, 3))); // []
    }
}

