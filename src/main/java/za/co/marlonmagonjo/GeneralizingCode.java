package za.co.marlonmagonjo;

/**
 *  - Generalizing code through Inheritance.
 *  - Object
 *      - The base class for all Java classes
 *      - Common methods equals(), toString(), hasCode()...
 *
 */

class Animal {

}

class WildAnimal extends Animal {

}

class DomesticAnimal extends Animal {

}

class Lion extends WildAnimal{}
class Tiger extends WildAnimal {}
class Cow extends DomesticAnimal {}
class Dog extends DomesticAnimal {}

public class GeneralizingCode {
    public static void main(String[] args) {
        feed(new Animal());
        feed(new WildAnimal());
        feed(new DomesticAnimal());
        feed(new Lion());
        feed(new Tiger());
        feed(new Cow());
        feed(new Dog());
    }

    // static void feed(Animal animal){
    static void feed(Object animal){
        System.out.println("Feeding an animal");
    }
}
