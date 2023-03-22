package za.co.marlonmagonjo;

import java.util.HashSet;
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

public class Collections {
    public static void main(String[] args) {

        // list allows duplicates
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(10);
        list.add(20);
        System.out.println(list);
        System.out.println("==========================================");

        // set does not allow duplicates
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(10);
        set.add(20);
        System.out.println(set);
    }
}
