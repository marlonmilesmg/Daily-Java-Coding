package za.co.marlonmagonjo;

/**
 *
 *  Exceptions are special kind of errors or failure conditions in the code which need to be caught and handled
 *      ArithmeticException: Thrown when an exceptional arithmetic condition occurs, such as division by zero.
 *
 *      NullPointerException: Thrown when you try to access a member of an object that is null.
 *
 *      ArrayIndexOutOfBoundsException: Thrown when you try to access an array element with an invalid index.
 *
 *      NumberFormatException: Thrown when you try to convert a string to a numeric type, but the string is not a valid number.
 *
 *      FileNotFoundException: Thrown when a file with a specified path cannot be found.
 *
 *      IOException: The base class for exceptions related to input and output operations.
 *
 *      ClassNotFoundException: Thrown when an application tries to load a class but the specified class cannot be found.
 *
 *      InterruptedException: Thrown when a thread is waiting, sleeping, or otherwise occupied, and the thread is interrupted.
 *
 *      IllegalArgumentException: Thrown when a method receives an illegal or inappropriate argument.
 *
 *      RuntimeException: The superclass for all exceptions that can occur during the normal operation of the Java Virtual Machine. It includes exceptions such as NullPointerException, ArrayIndexOutOfBoundsException, and ArithmeticException.
 *
 */

public class ExceptionHandling {
    static int div(int a, int b){
        try {
            return a / b;
        } catch (ArithmeticException e){
            System.out.println("Caught ArithmeticException");
            return 0;
        }
    }
    public static void main(String[] args) {
        System.out.println( div(10, 2));
        System.out.println( div(15, 0));

    }
}
