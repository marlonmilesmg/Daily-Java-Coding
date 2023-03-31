package za.co.marlonmagonjo;

import java.util.Iterator;

class MyArray implements Iterable<Integer> {
    private Integer[] arr;
    private int size;
    private int cursorPos;

    public MyArray(int size) {
        this.size = size;
        arr = new Integer[size];
        cursorPos = -1;
    }

    public void add(Integer value){
        if(cursorPos < size -1) {
            arr[++cursorPos] = value;
        } else {
            throw new ArrayIndexOutOfBoundsException(" out of bounds  at index " + cursorPos);
        }
    }

    public void print() {
        for (int i = 0; i <= cursorPos; i++) {
            System.out.println( arr[i]);
        }
    }

    @Override
    public Iterator iterator() {
        return new MyArrayIterator();
    }

    // inner class
    class MyArrayIterator implements Iterator<Integer> {

        private int pos = 0;
        @Override
        public boolean hasNext() {
            return pos <= cursorPos;
        }

        // current pos = 0
        @Override
        public Integer next() {
            return arr[pos++];
        }
    }
}

public class InnerClasses {
    public static void main(String[] args) {
        MyArray myArray = new MyArray(5);
        myArray.add(10);
        myArray.add(20);
        myArray.add(30);
        myArray.print();

        for (Integer value : myArray){
            System.out.println(value);
        }
        System.out.println("====================");

        Iterator<Integer> iterator = myArray.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
