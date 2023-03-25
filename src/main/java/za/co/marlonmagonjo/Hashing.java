package za.co.marlonmagonjo;

import java.util.HashSet;
import java.util.Objects;

class Fruit{
    private String name;
    public Fruit(String name){
        this.name = name;
    }

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
