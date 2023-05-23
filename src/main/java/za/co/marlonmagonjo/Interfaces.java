package za.co.marlonmagonjo;

/**
 *
 *  Interface -
 *      - 100% abstract as per old Java versions
 *      - Java recent editions supports adding default and static methods
 *      - All methods are public abstract by default
 *      - All fields are public static and final by default
 *      * Used for:
 *      - Separating interface from implementation
 *      - As a specification for required methods
 *      - For constants
 *      - As marker interfaces
 *      * Any class that implements an interface must override all the abstract methods of the interface otherwise it becomes abstract
 *
 */

interface Calculator {
    // by default any data declared in an interface is public static final
    double PI = 3.14159;

    // by default any method written in an interface is public and abstract
    int add(int a, int b);
    int sub(int a, int b);
    double sin(double deg);
}

class BasicCalculatorrr implements Calculator {

    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int sub(int a, int b) {
        return a - b;
    }

    @Override
    public double sin(double deg) {
        return Math.sin(deg * PI / 180);
    }
}
public class Interfaces {
    public static void main(String[] args) {
        Calculator calc; // reference variable
        calc = new BasicCalculatorrr();
        System.out.println( calc.add(5, 6));
        System.out.println( calc.sub(8, 3));
        System.out.println( calc.sin(67));
    }
}
