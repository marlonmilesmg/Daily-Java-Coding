import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import za.co.marlonmagonjo.StringUtil;

public class StringUtilTest {

    @Test
    public void limitReached_StringTruncates(){
        String input = "The economy is about to"; // length 23
        int limit = 11;

        Assertions.assertEquals("The economy...", StringUtil.truncate(input, limit));
    }

    @Test
    public void limitNotReached_StringnotChanged(){
        String input = "The economy is about to"; // length 23
        int limit = 40;

        Assertions.assertEquals("The economy is about to", StringUtil.truncate(input, limit));
    }
}
