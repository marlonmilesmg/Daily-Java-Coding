package za.co.marlonmagonjo;

import java.util.HashMap;

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
    }
}
