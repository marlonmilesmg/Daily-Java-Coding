package za.co.marlonmagonjo;

/**
 *  Classes -
 *      class { data + operations}
 *      class is a template for design
 */

class Samplee{
    // data
    int x;

    // operations
    void set(int value) {x = value;}
    int get() { return this.x;}
}
public class Classes {
    public static void main(String[] args) {
        Samplee s1 = new Samplee();
        Samplee s2 = new Samplee();
        s1.set(123);
        s2.set(4567);
        System.out.println(s1.get());
        System.out.println(s2.get());
    }
}
