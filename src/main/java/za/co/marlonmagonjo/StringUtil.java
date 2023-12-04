package za.co.marlonmagonjo;

public class StringUtil {
    public static String truncate(String input, int limit) {
        if(input == null){
            throw new IllegalArgumentException("String input must not be null");
        }
        if(limit < 1){
            throw new IllegalArgumentException("Limit input must be greater than 0");
        }
        if(input.length() <= limit){
            return input;
        }
        return input.substring(0, limit) + "...";
    }
}
