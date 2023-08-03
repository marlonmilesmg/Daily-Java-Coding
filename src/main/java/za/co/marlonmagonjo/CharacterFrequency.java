package za.co.marlonmagonjo;

import java.util.Map;
import java.util.TreeMap;

public class CharacterFrequency {
    public static void main(String[] args) {
        String inputString = "Marlon Magonjo!";
        Map<Character, Integer> frequencyMap = findCharacterFrequency(inputString);

        System.out.println("Character frequencies in the given string:");
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            char character = entry.getKey();
            int frequency = entry.getValue();
            System.out.println("'" + character + "': " + frequency);
        }
    }

    public static Map<Character, Integer> findCharacterFrequency(String input) {
        // Use TreeMap to return frequencyMap sorted in alphabetical order
        Map<Character, Integer> frequencyMap = new TreeMap<>();
        for (int i = 0; i < input.length(); i++) {
            char character = input.charAt(i);
            // Skip non-alphanumeric characters or consider them as case-insensitive
            if (!Character.isLetterOrDigit(character)) {
                continue;
            }
            // Convert the character to lowercase to treat uppercase and lowercase characters the same
            character = Character.toLowerCase(character);
            frequencyMap.put(character, frequencyMap.getOrDefault(character, 0) + 1);
        }
        return frequencyMap;
    }
}
