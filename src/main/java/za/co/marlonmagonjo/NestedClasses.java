package za.co.marlonmagonjo;

/**
 *  Nested classes - A class written with another class.
 *
 *  class OuterClass {
 *      ...
 *      class NestedClass {
 *          ...
 *      }
 *  }
 *
 *  // one advantage is OuterClass can extend A and NestedClass can extend B
 *
 *  Two types -
 *      static nested classes -
 *          - NestedClass declared as static.
 *          - Like static methods they can only access the static members of the outer class directly without object.
 *      non-static nested class -
 *          - Non-static nested classes are called inner class.
 *
 *  Sample -
 *
 *  class OuterClass {
 *      static int x;
 *      int y;
 *      ...
 *      static class StaticNestedClass {
 *          .... can refer to x
 *      }
 *
 *      // Non-static Nested class - also called as inner class
 *      class InnerClass {
 *          .... can refer to x and y
 *      }
 *  }
 *
 *  Instantiation -
 *  1) static nested class object
 *      OuterClass.StaticNestedClass obj = new OuterClass.StaticNestedClass();
 *  2) Non-static nested class object
 *      OuterClass outerObj = new OuterClass();
 *      OuterClass.InnerClass obj = outerObj.new InnerClass();
 */


class OuterClass {
    private int x = 10;

    public void test() {
        Demo demo = new Demo();
        demo.display();
    }

    // inner  class; non static => object
    class  Demo {
        public void display() {
            System.out.println("The value of x is " + x);
        }
    }
}

public class NestedClasses {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        outerClass.test();

        OuterClass.Demo demo = outerClass.new Demo();
        demo.display();
    }
}
