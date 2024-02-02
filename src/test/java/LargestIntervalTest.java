import org.junit.Test;
import za.co.marlonmagonjo.LargestInterval;

import static org.junit.Assert.assertEquals;

public class LargestIntervalTest {

    @Test
    public void testFindLargestInterval() {
        int[] numbers1 = {1, 6, 4, 8, 2};
        assertEquals(7, LargestInterval.findLargestInterval(numbers1));

        int[] numbers2 = {5, 10, 15, 20};
        assertEquals(15, LargestInterval.findLargestInterval(numbers2));

    }
}
