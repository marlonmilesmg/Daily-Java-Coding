package za.co.marlonmagonjo;

public class OddOccurrence {

    public static char oddOccurrence (char [] characters){
        int count = 0;
        char oddOccurrenceLetter = '\0';

        for(int i = 0; i < characters.length; i++) {
            for (char element : characters) {
                if (element == characters[i]) {
                    count++;
                }
            }
            if(count % 2 != 0){
                oddOccurrenceLetter = characters[i];
                break;
            }
        }
        return oddOccurrenceLetter;
    }

    public static void main(String[] args) {
        char outputLetter;
        char [] input = {'a', 'b', 'b', 'c', 'd', 'c', 'd', 'e', 'e', 'a', 'c', 'c', 'd'};
        outputLetter = oddOccurrence(input);
        System.out.println("Odd Occurrence Letter is : " + outputLetter);
    }
}
