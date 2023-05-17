package za.co.marlonmagonjo;

/**
 *
 *  A class may or may not have abstract method but can still be declared abstract to avoid instantiation
 *
 */

abstract class Moo {
    public void f() {
        System.out.println("f() in Demo");
    }
}

class D extends Moo {}
public class AbstractClassesss {
    public static void main(String[] args) {
        Moo moo;
        // moo = new Moo();
        moo = new D();
        moo.f();

    }
}
