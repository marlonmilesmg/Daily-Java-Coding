package za.co.marlonmagonjo;

import java.util.HashMap;

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

public class Map {

    public static void main(String[] args) {
        HashMap<String, Integer> fruitMap = new HashMap<>();
        fruitMap.put("apple", 20);
        fruitMap.put("orange", 30);
        fruitMap.put("mango", 40);

        Integer mangoPrice = fruitMap.get("mango");
        System.out.println(mangoPrice);

        System.out.println("Content of the fruitMap");
        for(String key : fruitMap.keySet()){
            Integer price = fruitMap.get(key);
            System.out.println(key + " -- " + price);
        }
        System.out.println("==================================");

        for(Integer value : fruitMap.values()){
            System.out.println(value);
        }

    }
}
