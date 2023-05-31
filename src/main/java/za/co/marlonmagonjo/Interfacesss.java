package za.co.marlonmagonjo;

/**
 *
 *  1) An interface can extend multiple interfaces
 *  2) A class can implement multiple interfaces
 *
 *  Note - A java class cannot extend more than one class, but can implement multiple interfaces
 *
 */

interface AA {
    void f();
}

interface BB {
    void g();
}

interface CC extends AA, BB {
    void h();
}

interface DD {
    void i();
}

class SomeClass implements CC, DD {

    @Override
    public void f() {
        System.out.println("f() in SomeClass");
    }

    @Override
    public void g() {
        System.out.println("g() in Someclass");
    }

    @Override
    public void h() {
        System.out.println("h() in SomeClass");
    }

    @Override
    public void i() {
        System.out.println("i() in SomeClass");
    }
}
public class Interfacesss {
    public static void main(String[] args) {
        AA a = new SomeClass();
        a.f();

        BB b = new SomeClass();
        b.g();

        CC c = new SomeClass();
        c.h();
        c.f();
        c.g();

        DD d = new SomeClass();
        d.i();

        SomeClass s = new SomeClass();
        s.f();
        s.h();
        s.g();
        s.i();
    }
}
