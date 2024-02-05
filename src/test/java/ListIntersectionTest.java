import org.junit.Test;
import za.co.marlonmagonjo.ListIntersection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class ListIntersectionTest {
    /**
     * By converting the expected and actual lists to sets using stream().collect(Collectors.toSet()),
     * You ensure that the comparison is order-independent and accounts for potential duplicate elements.
     */
    @Test
    public void testIntersection(){
        // Test case 1
        List<Integer> first = new ArrayList<>();
        List<Integer> second = new ArrayList<>();

        first.add(1);
        first.add(2);
        first.add(3);

        second.add(3);

        assertEquals(List.of(3), ListIntersection.intersection(first, second));

        // Test case 2
        assertEquals(Set.of(10, 35, 14), ListIntersection.intersection(List.of(10, 35, 14), List.of(90, 35, 10, 14, 28)).stream().collect(Collectors.toSet()));

        // Test case 3
        assertEquals(Set.of(2, 4), ListIntersection.intersection(List.of(100, 25, 134, 2, 4), List.of(4, 2)).stream().collect(Collectors.toSet()));

        // Test case 4
        assertEquals(Set.of(), ListIntersection.intersection(List.of(10, 35, 14), List.of()).stream().collect(Collectors.toSet()));

        // Test case 5
        assertEquals(Set.of(), ListIntersection.intersection(List.of(10, 35, 14), List.of(1, 2, 3)).stream().collect(Collectors.toSet()));
    }
}
