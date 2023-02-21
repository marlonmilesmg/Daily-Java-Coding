package za.co.marlonmagonjo;

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
