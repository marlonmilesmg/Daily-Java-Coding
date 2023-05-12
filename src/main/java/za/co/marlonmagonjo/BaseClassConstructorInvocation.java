package za.co.marlonmagonjo;

/**
 *
 *  Base class constructor invocation using super.
 *      - should be the first statement in the subclass constructor
 *      - If not selected by default super() is selected
 *
 */

class Point2D {
    protected int x, y;
    public Point2D() {}

    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void print() {
        System.out.printf("(%d,%d) \n", x, y);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

class Point3D extends Point2D {
    private int z;
    public Point3D() {}

    public Point3D(int x, int y, int z) {
        super(x, y); // super should be the first statement
        this.z = z;
    }

    @Override
    public void print() {
        System.out.printf("(%d, %d, %d) \n", x, y, z);
    }
}

public class BaseClassConstructorInvocation {
    public static void main(String[] args) {
        Point2D p1 = new Point2D(10, 20);
        p1.print();
        System.out.println();

        Point3D p2 = new Point3D(100, 200, 30);
        p2.print();
        System.out.println();

        Point3D p3 = new Point3D(p1.getX(), p1.getY(), 30);
        p3.print();
        System.out.println();

    }
}
