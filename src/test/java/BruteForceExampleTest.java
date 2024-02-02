import org.junit.Test;
import za.co.marlonmagonjo.BruteForceExample;

import static org.junit.Assert.assertEquals;

public class BruteForceExampleTest {
    @Test
    public void testFindMinimum(){
        int[] exampleArray1 = {5, 2, 8, 3, 1, 7};
        assertEquals(1, BruteForceExample.findMinimum(exampleArray1));
    }
}
