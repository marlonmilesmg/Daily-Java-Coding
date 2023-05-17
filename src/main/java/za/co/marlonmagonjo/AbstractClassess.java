package za.co.marlonmagonjo;

/**
 *  A subclass extending an abstract class must override all the abstract methods of the base class otherwise it too becomes abstract
 */

abstract class A {
    public void f() {
        System.out.println("f() in A");
    }
    public abstract void g();
    public abstract void h();
}

abstract class B extends A {
    @Override
    public void g() {
        System.out.println("g() in B");
    }
}

class C extends B {
    @Override
    public void h() {
        System.out.println("h() in C");
    }
}
public class AbstractClassess {
    public static void main(String[] args) {
        A a;
//        a = new A();
//        a = new B();
        a = new C();
        a.f();
        a.g();
        a.h();
    }
}
