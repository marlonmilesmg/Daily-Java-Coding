package za.co.marlonmagonjo;

import java.util.Scanner;

public class FirstFactorial {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(FirstFactorial(Integer.parseInt(s.nextLine())));
    }

    public static int FirstFactorial(int num) {
        // code goes here - 5! = 5 * 4 * 3 * 2 * 1 = 120
        if(num == 1){
            return 1;
        } else{
            return num * FirstFactorial(num - 1);
        }
    }
}
