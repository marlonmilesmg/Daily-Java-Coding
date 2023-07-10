package za.co.marlonmagonjo;

import java.util.HashSet;

public class EvenNumbers {

    public static HashSet<Integer> evenNumbers(int [] input){
        HashSet<Integer> evenNumbersAvailable = new HashSet<>();
        for (int element : input) {
            if(element % 2 == 0){
                evenNumbersAvailable.add(element);
            }
        }
        return evenNumbersAvailable;
    }

    public static void main(String[] args) {
        int [] input = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        HashSet<Integer> evenNumbersList = evenNumbers(input);

        System.out.println("Even numbers available are: " + evenNumbersList);
    }
}
