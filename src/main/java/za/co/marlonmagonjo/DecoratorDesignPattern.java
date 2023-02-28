package za.co.marlonmagonjo;

// abstract/base component
abstract class Pizza{
    public abstract double cost();
    public abstract String description();
}

// concrete classes
class VegExtraVaganza extends Pizza{

    @Override
    public double cost() {
        return 100;
    }
    @Override
    public String description(){
        return "VegExtraVaganza";
    }
}

class Hawaian extends Pizza{

    @Override
    public double cost() {
        return 80;
    }

    @Override
    public String description() {
        return "Hawaian, ";
    }
}

// abstract decorators
abstract class Topping extends Pizza{

}

// concrete decorators
class ExtraCheese extends Topping{

    Pizza pizza;

    public ExtraCheese(Pizza pizza){
        this.pizza = pizza;
    }
    @Override
    public double cost() {
        return 35 + pizza.cost();
    }

    @Override
    public String description() {
        return "ExtraCheese, " + pizza.description();
    }
}

class Bacon extends Topping{

    Pizza pizza;

    public Bacon(Pizza pizza){
        this.pizza = pizza;
    }
    @Override
    public double cost() {
        return 55 + pizza.cost();
    }

    @Override
    public String description() {
        return "Bacon, " + pizza.description();
    }
}

public class DecoratorDesignPattern {
    public static void main(String[] args) {

        Pizza pizza = new Bacon(new ExtraCheese(new VegExtraVaganza()));
        System.out.println("Pizza - " + pizza.description() + "; cost - " +  pizza.cost());

        Pizza pizza1 = new Bacon((new VegExtraVaganza()));
        System.out.println("Pizza - " + pizza1.description() + "; cost - " +  pizza1.cost());

        Hawaian hawaian = new Hawaian();
        System.out.println(hawaian.cost());
        ExtraCheese extraCheese = new ExtraCheese(hawaian);
        System.out.println("Pizza - " + extraCheese.description() + "; cost - " + extraCheese.cost());

    }
}
