package za.co.marlonmagonjo;

/**
 *  String -
 *      - String objects are immutable
 *      - Because they are immutable, objects with same value can be shared.
 *      - Use StringBuilder
 *          - when you are constructing a string content dynamically
 *
 *
 *      - equals()
 *      - equalsIgnoreCase()
 *      - compareTo()
 *      - compareToIgnoreCare()
 *
 */

public class StringsAndStringBuilder {
    public static void main(String[] args) {
        String s = "abc";
        s = s + "xyz";  // NB - this is not string manipulation of original object s, but rather creation of a new object that holds the value abcxyz
        System.out.println(s);

        String s1 = "qwer";
        String s2 = "qwer";
        String s3 = new String("qwer");

        // reference or address comparison
        if( s1 == s3) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }

        StringBuilder string = new StringBuilder("my new string");
        string.append("my second string");
        string.append("my third string");
        String str = string.toString();
        System.out.println(str);

        String str1 = "abc";
        String str2 = "qwe";
        System.out.println( str1.equals(str2));

        String str3 = "abc";
        String str4 = "ABC";
        System.out.println( str3.equalsIgnoreCase(str4));

        if(str3.compareTo(str4) > 0){
            System.out.println(" str3 > str4 ");
        } else if (str3.compareTo(str4) < 0) {
            System.out.println(" str3 < str4 ");
        } else {
            System.out.println(" str3 = str4 ");
        }
    }
}
