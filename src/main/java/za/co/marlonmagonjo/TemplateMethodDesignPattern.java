package za.co.marlonmagonjo;

import java.util.Scanner;

/**
 *
 * Template Method Pattern
 *  An abstract super class defines the skeleton of the algorithm leaving certain customizable portions of the algorithms
 *  to the subclasses to define.
 *
 */

abstract class SearchAlgorithmm {
    // Algorithm
    public int search(int [] a, int searchElement){
        for(int i = 0; i < a.length; i ++){
            if (match(a[i], searchElement)){
                return i;
            }
        }
        return -1;
    }

    public abstract boolean match(int value, int searchElement);

}

class InequalitySearchAlgorithm extends SearchAlgorithmm{
    @Override
    public boolean match(int value, int searchElement){
        return value != searchElement;
    }
}

class EqualitySearchAlgorithm extends SearchAlgorithmm{
    @Override
    public boolean match(int value, int searchElement){
        return value == searchElement;
    }
}

public class TemplateMethodDesignPattern {
    public static void main(String[] args) {
        int [] array = {10, 20, 30, 40, 50};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the element to search");
        int searchElement = scanner.nextInt();
        SearchAlgorithmm algorithmm = new EqualitySearchAlgorithm();
        int index = algorithmm.search(array, searchElement);

        if(index != -1){
            System.out.println("Found at - " + index);
        } else {
            System.out.println("Not found!");
        }

        System.out.println("==========================");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the element to search");
        int searchEle = scan.nextInt();
        SearchAlgorithmm algo = new InequalitySearchAlgorithm();
        int value = algo.search(array, searchEle);

        if(value != -1){
            System.out.println("Found at - " + value);
        } else {
            System.out.println("Not found!");
        }
    }
}
