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

 */
interface NonVegRestaurant{
    void nonVegMeals();

}

interface VegRestaurant{
    void vegMeals();
}

class ABCRestaurant implements NonVegRestaurant{

    @Override
    public void nonVegMeals() {
        System.out.println("Non-Veg Meals Provided");
        System.out.println("Sorry, we don't offer Veg Meals");
    }
}

class XYZRestaurant implements VegRestaurant{

    @Override
    public void vegMeals() {
        System.out.println("Veg Meals provided");
        System.out.println("Sorry, we don't offer Non-Veg Meals");
    }
}

class ASDRestaurant implements VegRestaurant, NonVegRestaurant{

    @Override
    public void nonVegMeals() {
        System.out.println("Non-Veg Meals Provided");
    }

    @Override
    public void vegMeals() {
        System.out.println("Veg Meals Provided");
    }
}

public class InterfaceSegregationPrinciple {
}
