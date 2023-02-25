package za.co.marlonmagonjo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

class MyCollection{
    @SafeVarargs
    public static <T> Collection of(T ... values){
        Collection<T> collection = new ArrayList<>();
        for(T value : values){
            collection.add(value);
        }
        return collection;
    }
}
public class CreateArrayListFromCollection {

    public static void main(String[] args) {
        Collection<String> collection1 = MyCollection.of("a", "b", "c", "ad");
        System.out.println(collection1);

        Collection<Integer> collection2 = MyCollection.of(1, 2, 3, 45);
        System.out.println(collection2);

        List<Integer> list = Arrays.asList(10, 20, 30, 45);
        System.out.println(list);
    }
}
