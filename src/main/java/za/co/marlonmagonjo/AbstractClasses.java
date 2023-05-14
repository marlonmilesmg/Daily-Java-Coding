package za.co.marlonmagonjo;

/**
 *
 *  Abstract classes -
 *      - Cannot be instantiated
 *      - They are declared abstract and may or may not include abstract methods
 *      - They can be subclassed
 *      - Abstract classes and abstract methods cannot be final
 *      - Whenever you have an abstract method, the corresponding class should be abstract
 *
 *  Concrete classes -
 *      - Classes which can be instantiated
 *
 *
 */

abstract class Basee {
    public void f(){
        System.out.println("f() in Basee");
    }

    public abstract void g();
}

class Deriveed extends Basee {

    @Override
    public void g() {
        System.out.println("g() in Deriveed");
    }
}

public class AbstractClasses {
    public static void main(String[] args) {
        Basee b;
        b = new Deriveed();
        b.f();
        b.g();
        System.out.println();

        Deriveed d = new Deriveed();
        d.f();
        d.f();
    }
}
