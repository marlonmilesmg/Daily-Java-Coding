package za.co.marlonmagonjo;

import java.util.Scanner;

// check for the longest word in a given sentence
public class LongestWordCheck {
    public static String LongestWord(String sentence){
        String[] words = sentence.split("[^a-z^0-9]");
        int longestWordIndex = 0;
        String longestWord = "";

        for (String word : words) {
            if (word.length() > longestWordIndex) {
                longestWord = word;
                longestWordIndex = word.length();
            }
        }
        return longestWord;
    }

    public static void main(String[] args) {
        System.out.println("Please enter the sentence with the longest word: ");
        Scanner s = new Scanner(System.in);
        System.out.println("The longest word in the sentence is: " + LongestWord(s.nextLine()));
    }
}
