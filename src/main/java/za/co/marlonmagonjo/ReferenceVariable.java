package za.co.marlonmagonjo;

/**
 *  this - refers to current object
 *
 *  a reference variable that points to the current object on which the operation is being performed
 *
 *  Usages -
 *  1) Resolving local and instance variable references
 *  2) Constructor invocation from another constructor of the same class
 *  3) Referencing/returning current object from within the methods
 */

class Sampleee{
    private int x;

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return this.x;
    }

    public Sampleee getRef(){
        return this;
    }
}
public class ReferenceVariable {
    public static void main(String[] args) {
        Sampleee s1, s2;
        s1 = new Sampleee();
        s1.setX(10);
        System.out.println(s1.getX());
        s2 = s1.getRef();
        System.out.println(s2.getX());
    }
}
