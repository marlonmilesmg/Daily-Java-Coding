import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import za.co.marlonmagonjo.StringUtil;

import java.util.stream.Stream;

public class StringUtilTest {

    @Test
    public void limitReached_StringTruncates(){
        String input = "The economy is about to"; // length 23
        int limit = 11;

        Assertions.assertEquals("The economy...", StringUtil.truncate(input, limit));
    }

    @ParameterizedTest
    @MethodSource("inputOutputLimitProvider")
    public void limitNotReached_StringnotChanged(String input, int limit){

        Assertions.assertEquals("The economy is about to", StringUtil.truncate(input, limit));
    }

    public static Stream<Arguments> inputOutputLimitProvider(){
        return Stream.of(
                Arguments.of("The economy is about to", 40),
                Arguments.of("The economy is about to", 23)
        );
    }
}
