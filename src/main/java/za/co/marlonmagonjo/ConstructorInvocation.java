package za.co.marlonmagonjo;

/**
 * Other constructor invocation using this.
 * Note: this(..) call should be the first statement in the constructor.
 */

class Example {
    Example() {
        this(10); // if you want to invoke an argument provided constructor without creating it, you use this as the first statement in a constructor
        System.out.println("Rest of the code ...");
    }

    Example(int value) {
        System.out.println("Some complicated initialization with ... " + value);
    }
}

public class ConstructorInvocation {
    public static void main(String[] args) {
        Example example = new Example();
        System.out.println();
        System.out.println("====================================================");
        Example example1 = new Example(20);
        System.out.println("==============================================");
    }
}
