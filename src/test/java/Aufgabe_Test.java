import org.junit.Test;
import static org.junit.Assert.*;
import java.io.*;

public class Aufgabe_Test {
  @Test
  public void testMainOutput() throws Exception {
    PrintStream oldOut = System.out;
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    System.setOut(new PrintStream(baos));
    try {
      Aufgabe.main(new String[0]);
    } finally {
      System.setOut(oldOut);
    }
    String output = baos.toString().replace("\r\n", "\n");
    String expected = ""
      + "3 erwartet: 3\n"
      + "8 erwartet: 8\n"
      + "5 erwartet: 5\n"
      + "3 erwartet: 3\n";
    assertEquals(expected, output);
  }
}