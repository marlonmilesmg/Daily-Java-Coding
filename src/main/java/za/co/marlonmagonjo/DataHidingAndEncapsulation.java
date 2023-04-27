package za.co.marlonmagonjo;

/**
 *  Data hiding -
 *  Encapsulation - combining the data and operations as a single unit
 */
class PositiveInteger {
    // data hiding
    // data / state
    private int x;

    // operations / behavior
    public void setX(int value) {
        if(value >= 0){
            x = value;
        }
    }

    public int getX(){
        return x;
    }
}

public class DataHidingAndEncapsulation {
    public static void main(String[] args) {
        // reference variable
        PositiveInteger n1;
        // RHS: creating object and assigned its reference to n1
        n1 = new PositiveInteger();
        n1.setX(3);
        System.out.println(n1.getX());
        n1.setX(-5);
        System.out.println(n1.getX());
    }
}
