package za.co.marlonmagonjo;

import java.io.*;
import java.lang.reflect.Constructor;

class SampleClass implements Serializable {
    private SampleClass(){
        if(instanceSample == null){
            instanceSample = this;
        } else {
            throw new IllegalArgumentException("You cannot create new object");
        }
    }

    // Create a static SampleClass instance to allow creation of one instance copy of SampleClass only when it is needed - this is called lazy loading
    private static volatile SampleClass instanceSample = null;

    public static SampleClass getInstance(){
        // double checking - threadsafety
        if(instanceSample == null){
            // synchronize is used to handle multithreading (it locks the object)
            synchronized (SampleClass.class){
                if(instanceSample == null){
                    // lazy loading
                    instanceSample = new SampleClass();
                }
            }
        }
        return instanceSample;
    }

    public void sayHello(String name) {
        System.out.println("Hello..." + name);
    }

    // to fix deserialization issue
    @Serial
    public Object readResolve(){
        return instanceSample;
    }
}
public class LazyLoading {
    public static void main(String[] args) throws Exception{
        // Using reflection
        Class<SampleClass> clazz = SampleClass.class;
        Constructor<SampleClass> constructor = clazz.getDeclaredConstructor();
        constructor.trySetAccessible();
        SampleClass obj = constructor.newInstance();

        SampleClass s1 = SampleClass.getInstance();
        SampleClass s2 = SampleClass.getInstance();

        System.out.println("Is s1 == s2 => " + (s1 == s2));

        s1.sayHello("Marlon");

        System.out.println("Is s1 == obj => " + (s1 == obj));

        // serialization
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(obj);
        objectOutputStream.close();

        byte [] objBytes = byteArrayOutputStream.toByteArray();

        //deserialization
        ObjectInputStream objectInputStream = new ObjectInputStream(new ByteArrayInputStream(objBytes));
        SampleClass sampleClass = (SampleClass) objectInputStream.readObject();

        System.out.println("Is obj == sampleClass => " + (obj == sampleClass));
        objectInputStream.close();
    }
}
