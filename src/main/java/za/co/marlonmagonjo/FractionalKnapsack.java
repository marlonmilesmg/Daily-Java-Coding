package za.co.marlonmagonjo;

import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {
    public static double getMaxValue(Item[] items, int capacity) {
        // Sort items based on value-to-weight ratio in descending order
        Arrays.sort(items, Comparator.comparingDouble((Item item) -> item.ratio).reversed());

        double totalValue = 0.0;
        int currentWeight = 0;

        for (Item item : items) {
            if (currentWeight + item.weight <= capacity) {
                // Take the whole item if it fits
                currentWeight += item.weight;
                totalValue += item.value;
            } else {
                // Take a fraction of the item to fill the remaining capacity
                double remainingCapacity = capacity - currentWeight;
                totalValue += (remainingCapacity / item.weight) * item.value;
                break; // Knapsack is full
            }
        }

        return totalValue;
    }

    public static void main(String[] args) {
        Item[] items = {
                new Item(10, 60),
                new Item(20, 100),
                new Item(30, 120)
        };

        int capacity = 50;

        double maxValue = getMaxValue(items, capacity);

        System.out.println("Maximum value in Knapsack = " + maxValue);
    }
}
