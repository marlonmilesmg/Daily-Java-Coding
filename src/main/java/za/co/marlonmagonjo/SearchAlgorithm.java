package za.co.marlonmagonjo;

/**
 *  At a high level it uses abstract base class with the core algorithm while abstracting out certain portions of the algorithm for subclass to define.
 *  Example in case of search algorithm or sort algorithm we can abstract out the value comparison logic so that the subclasses can override it.
 */

import java.util.Scanner;

// an example of Template Method
abstract class SearchAlgo{
    public int search(int[] a, int searchEle){
        for(int i=0; i < a.length; i++){
            if(match(a[i], searchEle)){
                return i;
            }
        }
        return -1;
    }

    public abstract boolean match(int value, int searchEle);
}

class EqualitySearchAlgo extends SearchAlgo{
    @Override
    public boolean match(int value, int searchEle) {
        return value == searchEle;
    }
}
class InequalitySearchAlgo extends SearchAlgo{
    @Override
    public boolean match(int value, int searchEle) {
        return value != searchEle;
    }
}
public class SearchAlgorithm {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60};
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the element to search");
        int searchElement = scan.nextInt();
        SearchAlgo algo = new EqualitySearchAlgo();
        // SearchAlgo algo = new InequalitySearchAlgo();
        int index = algo.search(arr, searchElement);
        if(index != -1){
            System.out.println("Element found at " + index);
        }else {
            System.out.println("Element not found");
        }
    }
}
