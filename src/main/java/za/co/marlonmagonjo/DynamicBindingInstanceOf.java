package za.co.marlonmagonjo;

/**
 *
 *
 *
 */

class BasicCalc {
    public int add(int a, int b){
        return a + b;
    }

    public int subtract(int a, int b){
        return a - b;
    }
}

class ScientificCalc extends BasicCalc {
    private static final double Pi = 3.1247;
    public double sin(double degrees){
        double radians = degrees * Pi / 180;
        return Math.sin(radians);
    }
}
public class DynamicBindingInstanceOf {
    public static void main(String[] args) {
        test(new BasicCalc());
        System.out.println();
        test(new ScientificCalc());
    }

    static void test(BasicCalc calc){
        System.out.println( calc.add(1000, 200));
        System.out.println( calc.subtract(2000, 100));
        if(calc instanceof ScientificCalc) {
            System.out.println( ((ScientificCalc)calc).sin(67));
        }
    }
}
