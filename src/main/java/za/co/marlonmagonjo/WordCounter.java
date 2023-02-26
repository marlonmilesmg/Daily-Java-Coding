package za.co.marlonmagonjo;

import java.util.HashMap;
import java.util.TreeMap;

// TreeMap always gives the output in sorted order
public class WordCounter {

    public static void main(String[] args) {

        String sentence = "this is an example sentence for this map implementation";
        String [] words = sentence.split(" ");

        // HashMap<String, Integer> wordCount = new HashMap<>();
        TreeMap<String, Integer> wordCount = new TreeMap<>();
        for(String word: words){
            Integer value = wordCount.get(word);
            if(value == null){
                value = 1;
            }
            else{
                value = value + 1;
            }
            wordCount.put(word, value);
        }
        System.out.println(wordCount);
    }
}
