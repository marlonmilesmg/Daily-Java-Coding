package za.co.marlonmagonjo;

/**
 *
 *  Problem statement -
 *      Graphic
 *          fields: x1, y1, x2, y2
 *          methods: setStart() - sets x1, y1
 *                   setEnd() - sets x2, y2
 *                   draw() - an abstract method.
 *      Line extends Graphic -
 *          overrides draw() - prints "draw line from (x1,y1) to (x2,y2)
 *      Rectangle extends Graphic -
 *          overrides draw() - prints "draw rectangle from (x1,y1) to (x2,y2)
 *
 */

abstract class Graphic {
   protected int x1, y1, x2, y2;

   public void setStart(int x, int y){
       this.x1 = x;
       this.y1 = y;
   }

    public void setEnd(int x, int y){
        this.x2 = x;
        this.y2 = y;
    }

    public abstract  void draw();
}

class Line extends Graphic {

    @Override
    public void draw() {
        System.out.printf("Draw a line from (%d,%d) to (%d,%d) \n", x1, y1, x2, y2);
    }
}

class Rectanglee extends Graphic {

    @Override
    public void draw() {
        System.out.printf("Draw a rectangle from (%d,%d) to (%d,%d) \n", x1, y1, x2, y2);
    }
}

public class DrawGraphics {
    // applicable for all Graphic (any subclass of Graphic)
    static void drawShape(int x1, int y1, int x2, int y2, Graphic g){
        g.setStart(x1,y1);
        g.setEnd(x2,y2);
        g.draw();
    }
    public static void main(String[] args) {
        Line l1 = new Line();
        l1.setStart(10, 10);
        l1.setEnd(20, 20);
        l1.draw();

        System.out.println();
        Rectanglee r1 = new Rectanglee();
        r1.setStart(10, 10);
        r1.setEnd(20, 20);
        r1.draw();

        System.out.println();
        drawShape(20, 20, 30, 30, new Line());

        System.out.println();
        drawShape(30, 30, 40, 40, new Rectanglee());
    }
}
