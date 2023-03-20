package za.co.marlonmagonjo;

import java.io.*;

/**
 * ObjectInputStream and ObjectOutputStream -
 *
 * They decorate the InputStream and Outputstream classes to provide the additional functionality for reading and writing objects
 *
 * - The corresponding class should implement Serializable interface.
 *
 * - Serialization - converting object to stream of bytes.
 * - Deserialization - converting stream of bytes to object.
 *
 */

class Rectangle implements Serializable{
    private double w, h, area;

    public Rectangle(double w, double h){
        this.w = w;
        this.h = h;
        this.area = this.w * this.h;
    }

    public double getArea() {
        return w * h;
    }

    public void print(){
        System.out.println("width - " + w + " , height - " + h + " , area - " + area);
    }
}
public class SerializationDeserialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Rectangle rectangle1 = new Rectangle(10, 20);
        Rectangle rectangle2 = new Rectangle(30, 40);

        FileOutputStream fileOutputStream = new FileOutputStream("rectangles.dat");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(rectangle1);
        objectOutputStream.writeObject(rectangle2);
        fileOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream("rectangles.dat");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        Rectangle rectangle3, rectangle4;
        rectangle3 = (Rectangle) objectInputStream.readObject();
        rectangle4 = (Rectangle) objectInputStream.readObject();

        rectangle3.print();
        rectangle4.print();
        fileInputStream.close();
    }
}
