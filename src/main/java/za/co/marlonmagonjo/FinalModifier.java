package za.co.marlonmagonjo;

/**
 *
 *  final modifier -
 *      1) Used for creating constants
 *          final double PI = 3.1416
 *      2) If a method is final it cannot be overridden
 *      3) If a class is final it cannot be extended
 *
 */

class Base1 {
    public void print() {
        System.out.println("Print in Base");
    }
}

class Derived1 extends Base1{
    public void print() {
        System.out.println("Print in Derived1");
    }
}
public class FinalModifier {
    public static void main(String[] args) {

    }
}
