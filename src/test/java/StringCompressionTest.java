import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static za.co.marlonmagonjo.StringCompression.compressString;

public class StringCompressionTest {

    @Test
    public void testCompression() {
        // Test case where compression is beneficial
        String originalString = "mmaarrlloonn";
        String compressedResult = compressString(originalString);
        assertEquals("m2a2r2l2o2n2", compressedResult);

        // Test case where compression is not beneficial
        String noCompressionString = "abcdef";
        compressedResult = compressString(noCompressionString);
        assertEquals("0", compressedResult);
    }

    @Test
    public void testEdgeCases() {
        // Test with an empty string
        String emptyString = "";
        String compressedResult = compressString(emptyString);
        assertEquals("0", compressedResult);

        // Test with a single-character string will not work because input a will be less than compressed result a1
//        String singleCharString = "a";
//        compressedResult = compressString(singleCharString);
//        assertEquals("a1", compressedResult);
    }
}

