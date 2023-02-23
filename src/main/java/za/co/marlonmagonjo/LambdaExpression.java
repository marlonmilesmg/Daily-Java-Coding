package za.co.marlonmagonjo;

// Functional Interfaces - these are interfaces with a single method
@FunctionalInterface
interface MyMath{
    int add(int a, int b);
}

class MyMathImpl implements MyMath{

    @Override
    public int add(int a, int b) {
        return a + b;
    }
}
public class LambdaExpression {

    public static void main(String[] args) {
        MyMath m1 = new MyMathImpl();
        System.out.println(m1.add(10, 20));

        // Anonymous
        MyMath m2 = new MyMath() {
            @Override
            public int add(int a, int b) {
                return a + b;
            }
        };
        System.out.println(m2.add(20, 30));

        // Lambda
        MyMath m3 = (a, b ) -> a + b;
        System.out.println(m3.add(30, 40));

        // Method References
        MyMath m4 = Integer::sum;
        System.out.println(m4.add(40, 50));

    }
}
