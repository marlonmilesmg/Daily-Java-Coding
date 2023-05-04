package za.co.marlonmagonjo;

/**
 * 1) Object creation must match one of the constructor which is accessible.
 * 2) When you don't define a constructor for a class, compiler provides one which is known as default constructor.
 * 3) If you have constructors with arguments then you cannot create an object with a no argument constructor
 */

class ComplexNumber {
    private int realNumber, imagenaryNumber;

    public ComplexNumber() {
        System.out.println("No args constructor");
        realNumber = imagenaryNumber = 0;
    }

    public ComplexNumber(int realNumber){
        System.out.println("Constructor with one argument");
        this.realNumber = realNumber;
        this.imagenaryNumber = 0;
    }

    public ComplexNumber(int realNumber, int imagenaryNumber){
        System.out.println("Constructor with two arguments");
        this.realNumber = realNumber;
        this.imagenaryNumber = imagenaryNumber;
    }

    public void print() {
        System.out.printf("realNumber is - (%d) + imagenaryNumber is - (%d) \n", realNumber, imagenaryNumber);
    }
}

public class Constructorss {
    public static void main(String[] args) {
        ComplexNumber complexNumber1, complexNumber2, complexNumber3;
        complexNumber1 = new ComplexNumber();
        complexNumber2 = new ComplexNumber(10);
        complexNumber3 = new ComplexNumber(10, 20);
        complexNumber1.print();
        complexNumber2.print();
        complexNumber3.print();
    }
}
