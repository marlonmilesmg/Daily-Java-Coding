package za.co.marlonmagonjo;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(primeNumbers(Integer.parseInt(s.nextLine())));
    }

    public static List<Integer> primeNumbers(Integer num){
        boolean flag = false;
        ArrayList<Integer> arr = new ArrayList<>();
            for (int i = 2; i < num / 2; i++) {
                if (num % i == 0) {
                    flag = true;
                    arr.add(num);
                    break;
                }
            }
            if (!flag && num != 1) {
                System.out.println(num + " is a prime number");
                arr.add(num);
            } else
                System.out.println(num + " is not a prime number");
            // TODO : return a list of prime numbers below and equal to number input
        return arr;
    }
}
