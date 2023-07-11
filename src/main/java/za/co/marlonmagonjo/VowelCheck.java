package za.co.marlonmagonjo;

import java.util.Scanner;

public class VowelCheck {

    public static boolean vowelPresenceCheck(String input){
        String vowels = "aeiouAEIOU";
        for (char c: input.toCharArray()) {
            if(vowels.indexOf(c) != -1){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        if (vowelPresenceCheck(input)) {
            System.out.println("The string contains a vowel.");
        } else {
            System.out.println("The string does not contain any vowel.");
        }

        scanner.close();
    }
}
