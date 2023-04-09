package za.co.marlonmagonjo;

import java.util.LinkedList;

class Stacck<T>{
    private LinkedList<T> linkedList = new LinkedList<>();

    public void push(T ele){
        linkedList.addFirst(ele);
    }

    public T pop(){
        return linkedList.removeFirst();
    }
}

public class GenericsStack {
    public static void main(String[] args) {
        Stacck<Integer> stacck = new Stacck<>();
        stacck.push(13);
        stacck.push(17);
        System.out.println(stacck.pop());
        System.out.println(stacck.pop());
        System.out.println("=======================================================");
    }
}
