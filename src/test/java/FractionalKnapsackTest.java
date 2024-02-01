import org.junit.jupiter.api.Test;
import za.co.marlonmagonjo.FractionalKnapsack;
import za.co.marlonmagonjo.Item;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FractionalKnapsackTest {

    @Test
    void testGetMaxValue() {
        // Test case 1
        Item[] items1 = {
                new Item(10, 60),
                new Item(20, 100),
                new Item(30, 120)
        };
        int capacity1 = 50;
        double maxValue1 = FractionalKnapsack.getMaxValue(items1, capacity1);
        assertEquals(240.0, maxValue1, 0.001); // Use delta for double comparisons

        // Test case 2
        Item[] items2 = {
                new Item(5, 50),
                new Item(10, 60),
                new Item(20, 140),
                new Item(30, 120)
        };
        int capacity2 = 30;
        double maxValue2 = FractionalKnapsack.getMaxValue(items2, capacity2);
        assertEquals(220.0, maxValue2, 0.001);
    }
}