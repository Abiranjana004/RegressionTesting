
package org.example;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    public void testMainMethod() {

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;

        try {
            System.setOut(new PrintStream(outContent));

            Main.main(new String[]{});

            String expected = "Hello and welcome!\n"
                    + "i = 1\n"
                    + "i = 2\n"
                    + "i = 3\n"
                    + "i = 4\n"
                    + "i = 5";

            assertEquals(expected, outContent.toString().trim());

        } finally {
            System.setOut(originalOut);
        }
    }
}
