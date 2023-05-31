package za.co.marlonmagonjo;

/**
 *
 *  Default and static methods in interfaces
 *
 */

interface ITest {
    void f();
    default void g() {
        System.out.println("g() in ITest");
    }

    static void h() {
        System.out.println("h() in ITest");
    }
}

class DemoTest implements ITest {

    @Override
    public void f() {
        System.out.println("f() in DemoTest");
    }
}

class DemoSample implements ITest {

    @Override
    public void f() {
        System.out.println("f() in DemoSample");
    }
}


public class Interfacessss {
    static void test(ITest i){
        i.f();
        i.g();
    }
    public static void main(String[] args) {
        test(new DemoTest());
        System.out.println();

        test(new DemoSample());
    }
}
