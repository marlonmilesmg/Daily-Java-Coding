package za.co.marlonmagonjo;

// Functional Interfaces - these are interfaces with a single method, for functional programming
@FunctionalInterface
interface Greetings{
    void sayHello(String name);
}
public class LambdaExpressions {
    public static void main(String[] args) {

        // Anonymous class
        Greetings greetings = new Greetings() {
            @Override
            public void sayHello(String name) {
                System.out.println("Greetings!!! " + name);
            }
        };
        greetings.sayHello("Marlon");
        System.out.println("==============================================");

        // Lambda Expression
        Greetings greetings1 = name -> System.out.println("Hello! " + name + " from Lambda");
        greetings1.sayHello("John");
        System.out.println("================================================");

        // Lambda - Method References
        Greetings greetings2 = System.out::println;
        greetings2.sayHello("Jacob");
    }
}
