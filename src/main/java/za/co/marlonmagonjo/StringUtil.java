package za.co.marlonmagonjo;

public class StringUtil {
    public static String truncate(String input, int limit) {
        if(input.length() <= limit){
            return input;
        }
        return input.substring(0, limit) + "...";
    }
}
