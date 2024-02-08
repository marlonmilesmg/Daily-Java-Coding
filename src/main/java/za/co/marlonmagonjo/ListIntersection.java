package za.co.marlonmagonjo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListIntersection {
    /**
     * The time complexity of the given intersection method is O(min(n, m)),
     * where n and m are the sizes of the input lists first and second, respectively.
     * <p>
     * "min" refers to the minimum operation. In the expression "O(min(n, m)),"
     * it means that the time complexity of the algorithm is determined by the minimum size between the two input lists.
     * <p>
     *  Here's the breakdown:
     *  - Creating HashSet from first: O(n)
     *  - Creating HashSet from second: O(m)
     *  - Finding the intersection using retainAll: O(min(n, m))
     *  - Creating ArrayList from the result set: O(min(n, m))
     */

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

