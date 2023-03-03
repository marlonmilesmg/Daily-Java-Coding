package za.co.marlonmagonjo;

import java.util.Arrays;

public class SumEvenNumbersSquare {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        // Imperative programming
        int sum = 0;
        for(int value : arr){
            if(value % 2 == 0){
                sum += (value * value);
            }
        }

        System.out.println("Sum is : " + sum);
        System.out.println("================================");

        // Arrays with Streams -> Functional programming
        int sumOfSquare = Arrays.stream(arr)
                .filter(x -> x % 2 == 0)
                .map(x -> x * x)
                .sum();
        System.out.println("Sum from Array with Streams is : " + sumOfSquare);
    }
}
