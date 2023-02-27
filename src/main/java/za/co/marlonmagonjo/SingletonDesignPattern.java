package za.co.marlonmagonjo;
// non-static method means you need an object
class Sample{

    // Create a static Sample instance to allow creation of one instance copy of Sample - this is called eager loading
    private static final Sample instance = new Sample();

    // To make a class/object singleton you can make the constructor private
    private Sample(){}

    // Use getInstance() to allow calling of instance of Sample
    public static Sample getInstance(){
        return instance;
    }

    public void sayHello(String name){
        System.out.println("Hello " + name);
    }
}
public class SingletonDesignPattern {

    public static void main(String[] args) {
        // Sample s = new Sample(); is not allowed since constructor is private, it restricts creation of Sample object
        Sample sample1 = Sample.getInstance();
        Sample sample2 = Sample.getInstance();

        System.out.println(" Is sample1 == sample2 => " + (sample1 == sample2));
        sample1.sayHello("Marlon");
        sample2.sayHello("Fadzai");

    }
}
