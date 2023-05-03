package za.co.marlonmagonjo;

/**
 *  Constructors - A function like block which takes the name of the class but with no return type
 */

class Samplle {
    // no argument constructor
    public Samplle(){
        System.out.println("No args constructor");
    }

    // argument constructor
    public Samplle(int value){
        System.out.println("Args constructor with value - " + value);
    }
}

class PositiveeInteger {
    private int x;

    public PositiveeInteger(){
        x = 0;
    }

    public PositiveeInteger(int value){
        x = value;
    }

    public void setX(int value) {
        if(value >= 0){
            x = value;
        }
    }

    public int getX() {
        return x;
    }
}
public class Constructors {
    public static void main(String[] args) {
        Samplle s1 = new Samplle();
        Samplle s2 = new Samplle(18);
        System.out.println("=================================");

        PositiveeInteger positiveeInteger = new PositiveeInteger();
        System.out.println(positiveeInteger.getX());

        PositiveeInteger positiveeInteger1 = new PositiveeInteger(350);
        System.out.println(positiveeInteger1.getX());
    }
}
