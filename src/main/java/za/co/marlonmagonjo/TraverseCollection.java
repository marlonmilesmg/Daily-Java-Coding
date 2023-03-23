package za.co.marlonmagonjo;

import java.util.TreeSet;

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
public class TraverseCollection {
    public static void main(String[] args) {
        int [] arr = {20, 10, 40, 30, 10, 40, 50, 20, 60};

        // TreeSet allows retrieval of elements in sorted order
        TreeSet<Integer> treeSet = new TreeSet<>();
        for(Integer value : arr){
            if(!treeSet.add(value)){
                System.out.println("Duplicate found - " + value);
            }
        }
        System.out.println("Printing values in the collection...");
        for (Integer value : treeSet){
            System.out.println(value);
        }
    }
}
