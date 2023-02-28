package za.co.marlonmagonjo;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//    take the str parameter being passed and determine if the string is a valid username according to the following rules:
//
//            1. The username is between 4 and 25 characters.
//            2. It must start with a letter.
//            3. It can only contain letters, numbers, and the underscore character.
//            4. It cannot end with an underscore character.
//
//    If the username is valid then your program should return the string true, otherwise return the string false.
public class UsernameValidation {
    public static void main(String[] args) {
        System.out.println("Enter username to be validated: ");
        Scanner s = new Scanner(System.in);
        System.out.print(UsernameValidationRegex(s.nextLine()));
    }

    public static String UsernameValidationRegex(String str) {
        Pattern p = Pattern.compile("[a-zA-Z][a-zA-Z0-9_]{2,23}[^_]");
        Matcher matcher = p.matcher(str);
        if(matcher.matches()){
            return "Username is valid";
        }else {
            return "Username is not valid";
        }
    }

}
