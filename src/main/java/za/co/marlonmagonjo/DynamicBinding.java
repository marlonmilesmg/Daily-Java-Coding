package za.co.marlonmagonjo;

/**
 *  - Overriding and method invocation
 *  - Dynamic binding -
 *      binding/linking to the corresponding method definition based on object
 *
 */

class Basse {
    void f(){
        System.out.println("f() in Base");
    }

    void g(){
        System.out.println("g() in Base");
    }
}

class Derived extends Basse {
    void f() {
        System.out.println("f() in Derived");
    }

    void h(){
        System.out.println("h() in Base");
    }
}
public class DynamicBinding {
    public static void main(String[] args) {
        Basse b1 = new Basse();
        b1.f(); // f() in Base
        b1.g(); // g() in Base

        System.out.println();
        Basse b2 = new Derived();
        b2.f(); // f() in Derived
        b2.g(); // g() in Base
    }
}
