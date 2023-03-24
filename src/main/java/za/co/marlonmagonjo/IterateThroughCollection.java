package za.co.marlonmagonjo;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

/**
 *  Collections - Prebuilt Data Structure Implementations
 *
 *  I - Interface
 *  C - Class
 *
 *  Collection - (I)
 *      List - (I)
 *          Arraylist - (C)
 *          LinkedList - (C)
 *
 *      Set - (I)
 *          HashSet - (C)
 *          LinkedHashSet - (C)
 *          SortedSet - (I)
 *          TreeSet - (C)
 *
 *      Map - (I)
 *          HashMap - (C)
 *          LinkedHashMap - (C)
 *          SortedMap - (I)
 *          TreeMap - (I)
 *
 *  List - Allows duplicates
 *  Set - Does not allow duplicates
 *  Hash - Uses hashing (insertion order not preserved)
 *  Linked - Insertion order preserved
 *  Tree - Sorted
 *
 */

public class IterateThroughCollection {

    private static void display(Collection<Integer> collection){
        for (Integer ele : collection){
            System.out.println(ele);
        }
    }

    private static void displayUsingIterator(Collection<Integer> collection){
        Iterator<Integer> iterator = collection.iterator();
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
        System.out.println("Values in the list are...");
        display(list);
        displayUsingIterator(list);
        System.out.println("======================================");

        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(30);
        set.add(20);
        set.add(20);
        System.out.println("Values in the set are...");
        display(set);
        displayUsingIterator(set);

    }
}
