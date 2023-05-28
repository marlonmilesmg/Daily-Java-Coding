package za.co.marlonmagonjo;

/**
 *
 * 1) A class must implement all abstract methods of an interface otherwise it becomes abstract
 * 2) Method invocation based on interface
 *
 */

interface Sammmple {
    void f();
    void g();
}

abstract class Bassee implements Sammmple {
    @Override
    public void f() {
        System.out.println("f() in Bassee");
    }

    public abstract void h();
}

class Derivedd extends Bassee {
    @Override
    public void g() {
        System.out.println("g() in Derivedd");
    }

    @Override
    public void h() {
        System.out.println("h() in Derivedd");
    }

    public void i(){
        System.out.println("i() in Derivedd");
    }
}
public class Interfacess {
    public static void main(String[] args) {
        Derivedd d1 = new Derivedd();
        d1.f();
        d1.g();
        d1.h();
        d1.i();
        System.out.println();

        Bassee b1 = d1;
        b1.f();
        b1.g();
        b1.h();
        System.out.println();

        Sammmple s1 = d1;
        s1.f();
        s1.g();

    }
}
