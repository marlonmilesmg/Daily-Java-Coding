package za.co.marlonmagonjo;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;

// Set does not add duplicates
public class Iterator {

    private static void display(LinkedList<Integer> list){
        for(Integer value : list){
            System.out.println(value);
        }
    }

    private static void displayCollection(Collection<Integer> collection){
        for (int value: collection) {
            System.out.println(value);
        }
    }

    private static void displayIterator(Collection<Integer> collection){
        java.util.Iterator<Integer> iterator = collection.iterator();
        while (iterator.hasNext()){
            Integer value = iterator.next();
            System.out.println(value);
        }
    }
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(10);
        System.out.println("Displaying LinkedList Contents");
        display(list);
        System.out.println("Displaying LinkedList Contents from Collection");
        displayCollection(list);
        System.out.println("Displaying LinkedList Contents from Iterator");
        displayIterator(list);

        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(10);
        System.out.println("Displaying Hashset Contents");
        displayCollection(set);
        System.out.println("Displaying LinkedList Contents from Iterator");
        displayIterator(set);
    }
}
