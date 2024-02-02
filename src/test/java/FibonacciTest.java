import org.junit.Test;
import za.co.marlonmagonjo.Fibonacci;

import static org.junit.Assert.assertEquals;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class FibonacciTest {

    @Test
    public void testPrintFibonacciSequence() {
        // Redirect System.out to capture printed output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Call the method to print Fibonacci sequence
        Fibonacci.printFibonacciSequence(11);

        // Reset System.out to print to console
        System.setOut(System.out);

        // Expected Fibonacci sequence for the first 10 numbers
        String expectedOutput = "0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, ";

        // Check if the printed output matches the expected sequence
        assertEquals(expectedOutput, outContent.toString());
    }
}
