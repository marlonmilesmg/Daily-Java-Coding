import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
import za.co.marlonmagonjo.MergeSort;

public class MergeSortTest {

    @Test
    public void testMergeSort() {
        int[] array = {12, 11, 13, 5, 6, 7};
        int[] expected = {5, 6, 7, 11, 12, 13};

        MergeSort.mergeSort(array, 0, array.length - 1);

        assertArrayEquals(expected, array);
    }

    @Test
    public void testMergeSortWithEmptyArray() {
        int[] array = {};
        int[] expected = {};

        MergeSort.mergeSort(array, 0, array.length - 1);

        assertArrayEquals(expected, array);
    }

    @Test
    public void testMergeSortWithSingleElement() {
        int[] array = {42};
        int[] expected = {42};

        MergeSort.mergeSort(array, 0, array.length - 1);

        assertArrayEquals(expected, array);
    }

    @Test
    public void testMergeSortWithRepeatedElements() {
        int[] array = {5, 5, 5, 5, 5};
        int[] expected = {5, 5, 5, 5, 5};

        MergeSort.mergeSort(array, 0, array.length - 1);

        assertArrayEquals(expected, array);
    }
}
