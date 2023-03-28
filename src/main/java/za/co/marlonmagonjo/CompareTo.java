package za.co.marlonmagonjo;

import java.util.Objects;
import java.util.TreeSet;

class SomeFruit implements Comparable<SomeFruit>{
    private String name;

    public SomeFruit(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SomeFruit someFruit = (SomeFruit) o;
        return Objects.equals(name, someFruit.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    // f1.compareTo(f2)
    @Override
    public int compareTo(SomeFruit o) {
        return this.name.compareToIgnoreCase(o.name);
    }
}
public class CompareTo {
    public static void main(String[] args) {
        TreeSet<SomeFruit> treeSet = new TreeSet<>();
        treeSet.add(new SomeFruit("apple"));
        treeSet.add(new SomeFruit("banana"));
        treeSet.add(new SomeFruit("orange"));
        treeSet.add(new SomeFruit("banana"));
        treeSet.add(new SomeFruit("APPLE"));

        System.out.println(treeSet);
    }
}
