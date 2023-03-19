package za.co.marlonmagonjo;

/**
     S - Single Responsibility Principle -
            A class should have one and only one reason to change

     O - Open Closed Principle -
            Objects or entities should be open for extension but closed for modification

     L - Liskov Substitution Principle
            Objects of super class shall be replaced with objects of subclasses - new code or features must not break existing fuctionality

     I - Interface Segregation Principle
            A client should never be forced to implement an interface that it does not use

     D - Dependency Inversion Principle
            High level modules should not directly depend on low level modules, instead they should depend on abstractions.

 */

class Vehicle {
    public void start(){
        System.out.println("Starting a Vehicle");
    }

    public void stop(){
        System.out.println("Stopping a Vehicle");
    }
}

class Bike extends Vehicle{
    public void start(){
        System.out.println("Starting a Bike");
    }

    public void stop(){
        System.out.println("Stopping a Bike");
    }
}

class Car extends Vehicle{
    public void start(){
        System.out.println("Starting a Car");
    }

    public void stop(){
        System.out.println("Stopping a Car");
    }
}
public class LiskovSubstitutionPrinciple {

    static void testDrive(Vehicle vehicle){
        vehicle.start();
        vehicle.stop();
    }

    public static void main(String[] args) {
        testDrive(new Vehicle());
        testDrive(new Bike());
        testDrive(new Car());
    }
}
