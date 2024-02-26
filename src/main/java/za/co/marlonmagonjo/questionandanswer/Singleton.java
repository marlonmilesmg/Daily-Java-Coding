package za.co.marlonmagonjo.questionandanswer;

/**
 * To create a singleton in Java, you can define a class with private constructors and a static method that returns the same instance
 * of the class every time it is called. This ensures that only one instance of the class exists, and it can be accessed using the static method.
 * Here is an example:
 *
 * In this example, the Singleton class has a private constructor to prevent it from being instantiated
 */
public class Singleton {
    private static Singleton instance = null;
    private Singleton() {}
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

