package za.co.marlonmagonjo;

public class Fibonacci {
    public static void printFibonacciSequence(int count) {
        int a = 0;
        int b = 1;
        int c = 1;

        for (int i = 1; i <= count; i++) {
            System.out.print(a + ", ");
            a = b;
            b = c;
            c = a + b;
        }
    }

    public static void main(String[] args) {
        printFibonacciSequence(11);
    }
}
