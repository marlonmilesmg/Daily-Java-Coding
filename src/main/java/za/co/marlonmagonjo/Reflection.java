package za.co.marlonmagonjo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 *  Reflection -
 *  Used by programs which tend to examine or modify the runtime behaviour of the applications
 *  running in Java virtual machines
 *  Note - Use with caution
 */

class SampleReflection{
    // fields
    int a;
    SampleReflection() {}

    // constructors
    SampleReflection(int a){
        this.a = a;
    }

    // methods
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}

public class Reflection {
    public static void main(String[] args) throws Exception{
        Class clazz = SampleReflection.class;
        // Class clazz = Class.forName("za.co.marlonmagonjo.SampleReflection");

        Field[] fields = clazz.getDeclaredFields();

        Constructor [] constructors = clazz.getDeclaredConstructors();

        Method[] methods = clazz.getDeclaredMethods();

        System.out.println("Declared Fields are - ");
        for(Field f : fields){
            System.out.println( f );
        }
        System.out.println("=================================");

        System.out.println("Declared Constructors are - ");
        for(Constructor c : constructors){
            System.out.println( c );
        }
        System.out.println("=================================");

        System.out.println("Declared Methods are - ");
        for(Method m : methods){
            System.out.println( m );
        }
        System.out.println("=================================");
    }

}
