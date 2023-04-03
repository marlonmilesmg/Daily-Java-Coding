package za.co.marlonmagonjo;

/**
 *  Anonymous class
 *
 */

interface Greet {
    void sayHello(String name);
}

class MyGreetImpl implements Greet {

    public void sayHello(String name) {
        System.out.println("Hello!! " + name);
    }
}

public class AnonymousClass {
    public static void main(String[] args) {
        MyGreetImpl obj = new MyGreetImpl();
        obj.sayHello("Marlon");
        System.out.println("=================================");

        Greet obj1 = new MyGreetImpl();
        obj1.sayHello("John");
        System.out.println("==================================");

        // directly create an object and not name the classes
        Greet obj2 = new Greet() {
            @Override
            public void sayHello(String name) {
                System.out.println("Hello!! " +name +" From anonymous class");
            }
        };
        obj2.sayHello("Desmond");
        System.out.println("==========================================");
    }
}
