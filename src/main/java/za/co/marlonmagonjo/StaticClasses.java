package za.co.marlonmagonjo;

/**
 *  Static members -
 *      - Shared by all the objects of the class
 *      - No need for object
 *      - static .... can only access .... other static members directly
 */

class Employeee {
    // static members - they belong to class
    // board shared across with employeees
    private static String board;

    public static void writeToBoard(String s){
        board = s;
    }

    // non-static - related to object(employeee)
    private String note;

    public void writeNote(String s) {
        note = s;
    }

    public void print() {
        System.out.println("Content on the board - " + board);
        System.out.println( "My Notes - " + note);
    }
}

public class StaticClasses {
    public static void main(String[] args) {

        Employeee.writeToBoard("Wrote to board");

        Employeee employeee1, employeee2;
        employeee1 = new Employeee();
        employeee2 = new Employeee();
        employeee1.writeNote("qwerty");
        employeee1.writeToBoard("written by employeee1");

        employeee2.writeNote("asdfg");
        employeee2.writeToBoard("written by employeee2");

        employeee1.print();
        employeee2.print();
    }
}
