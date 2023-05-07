package za.co.marlonmagonjo;

/**
 *  Composition -
 *      Models an has-a relationship between the objects or classes
 */
class BasicCalculatorr {
    public int add(int a, int b){
        return a + b;
    }

    public int subtract(int a, int b){
        return a - b;
    }
}

// ScientificCalculator has-a BasicCalculator
class ScientificCalculatorr{
    private static final double Pi = 3.1247;

    BasicCalculatorr basicCalculatorr = new BasicCalculatorr();
    public double sin(double degrees){
        double radians = degrees * Pi / 180;
        return Math.sin(radians);
    }

    public int add(int a, int b){
        return basicCalculatorr.add(a, b);
    }

    public int subtract(int a, int b){
        return basicCalculatorr.subtract(a, b);
    }
}

public class Composition {
    public static void main(String[] args) {
        BasicCalculatorr basicCalculator = new BasicCalculatorr();
        System.out.println("Testing Basic Calculator");
        System.out.println(basicCalculator.add(100, 200));
        System.out.println(basicCalculator.subtract(100, 200));
        System.out.println("==========================================");

        ScientificCalculatorr scientificCalculator = new ScientificCalculatorr();
        System.out.println("Testing Scientific Calculator");
        System.out.println(scientificCalculator.add(100, 200));
        System.out.println(scientificCalculator.subtract(100, 200));
        System.out.println(scientificCalculator.sin(65));
        System.out.println("==========================================");

    }
}
