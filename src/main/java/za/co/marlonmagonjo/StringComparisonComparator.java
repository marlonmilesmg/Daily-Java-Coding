package za.co.marlonmagonjo;

import java.util.Arrays;
import java.util.Comparator;

class DesComparator implements Comparator<String>{
    @Override
    public int compare(String o1, String o2) {
        return -1 * o1.compareTo(o2);
    }
}
public class StringComparisonComparator {

    public static void main(String[] args) {
        String [] arr = {"abc", "cd", "ad", "ABC"};
        // Arrays.sort(arr);
        Arrays.sort(arr, new DesComparator());

        System.out.println(Arrays.toString(arr));

        // Anonymous implementation
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return -1 * o1.compareTo(o2);
            }
        });

        // Lambda implementation
        Arrays.sort(arr, ((o1, o2) -> -1 * o1.compareTo(o2)));
        System.out.println(Arrays.toString(arr));

        // Lambda with Method References
        Arrays.sort(arr, String::compareTo);
        System.out.println(Arrays.toString(arr));

    }
}
