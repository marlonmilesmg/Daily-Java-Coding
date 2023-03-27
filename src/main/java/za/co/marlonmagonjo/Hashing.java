package za.co.marlonmagonjo;

import java.util.HashSet;
import java.util.Objects;

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

class Fruit{
    private String name;
    public Fruit(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }

    // Override equals() and hashCode() to not allow duplicates in the HashSet
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fruit fruit = (Fruit) o;
        return Objects.equals(name, fruit.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
public class Hashing {
    public static void main(String[] args) {
        HashSet<Fruit> hashSet = new HashSet<>();
        hashSet.add(new Fruit("apple"));
        hashSet.add(new Fruit("banana"));
        hashSet.add(new Fruit("orange"));
        hashSet.add(new Fruit("apple")); // second apple should not be printed

        System.out.println(hashSet);
    }
}
