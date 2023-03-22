package za.co.marlonmagonjo;

import java.util.HashSet;
import java.util.LinkedHashSet;
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

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {10, 20, 60, 30, 10, 70, 40, 20, 50, 60, 30, 10};

        // LinkedHashSet allows retrieval of elements with order of insertion
         LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
         for (int ele : arr){
             if(!linkedHashSet.add(ele)){
                 System.out.println("Duplicate found - " + ele);
             }
         }
        System.out.println(linkedHashSet);
        System.out.println("=================================================");

        // HashSet does not retrieve elements with order of insertion
        HashSet<Integer> set = new HashSet<>();
        for(int ele : arr){
            if(!set.add(ele)){
                System.out.println("Duplicate found - " + ele);
            }
        }
        System.out.println(set);
        System.out.println("=====================================================");

        // TreeSet allows retrieval of elements in a sorted order
        TreeSet<Integer> treeSet = new TreeSet<>();
        for(int ele : arr){
            if(!treeSet.add(ele)){
                System.out.println("Duplicate found - " + ele);
            }
        }
        System.out.println(treeSet);
        System.out.println("======================================================");
    }
}
