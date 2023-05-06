package za.co.marlonmagonjo;

/**
 *  Inheritance -
 *   - Mechanism in which one class acquires the properties of another class inorder to extend or modify the existing functionality
 *   - Class being extended is called base class or parent class or super class
 *   - Class extending the base class is called as subclass or derived class
 *   - Forms an IsA relation with the base class
 */

class BasicCalculator {
    public int add(int a, int b){
        return a + b;
    }

    public int subtract(int a, int b){
        return a - b;
    }
}

class ScientificCalculator extends BasicCalculator {
    private static final double Pi = 3.1247;
    public double sin(double degrees){
        double radians = degrees * Pi / 180;
        return Math.sin(radians);
    }
}
public class Inheritance {
    public static void main(String[] args) {
        BasicCalculator basicCalculator = new BasicCalculator();
        System.out.println("Testing Basic Calculator");
        System.out.println(basicCalculator.add(100, 200));
        System.out.println(basicCalculator.subtract(100, 200));
        System.out.println("==========================================");

        ScientificCalculator scientificCalculator = new ScientificCalculator();
        System.out.println("Testing Scientific Calculator");
        System.out.println(scientificCalculator.add(100, 200));
        System.out.println(scientificCalculator.subtract(100, 200));
        System.out.println(scientificCalculator.sin(65));
        System.out.println("==========================================");

        BasicCalculator b1 = new ScientificCalculator();
        System.out.println("Testing Basic Calculator");
        System.out.println(b1.add(1000, 200));
        System.out.println(b1.subtract(1000, 200));

    }
}
