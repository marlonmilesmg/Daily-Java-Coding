package za.co.marlonmagonjo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 *  Invoking a method through reflection
 */

class Demo {
    public void sayHello(String name){
        System.out.println("Hello! " + name);
    }
}

public class DynamicMethodInvocation {
    public static void main(String[] args) throws Exception{
        Demo demo = new Demo();
        demo.sayHello("Marlon");
        System.out.println("====================================================");

        // Reflection Approach
        Class<Demo> demoClass = Demo.class;
        Constructor<Demo> constructor = demoClass.getDeclaredConstructor();
        Demo demo1 = constructor.newInstance();
        Method method = demoClass.getDeclaredMethod("sayHello", String.class);
        method.invoke(demo1, "Miles");
        System.out.println("===================================================");
    }
}
