package za.co.marlonmagonjo;

/**
 *  Overloading -
 *      Providing multiple definitions to the same identifier
 */

class Saample{
    void print(int a){
        System.out.println("int - " + a);
    }

    void print(float a){
        System.out.println("float - " + a);
    }

    void print(String a){
        System.out.println("String - "+ a);
    }
}
public class MethodOverloading {
    public static void main(String[] args) {
        Saample s1 = new Saample();
        s1.print(10);
        s1.print(12.4f);
        s1.print("ASDF");
    }
}
