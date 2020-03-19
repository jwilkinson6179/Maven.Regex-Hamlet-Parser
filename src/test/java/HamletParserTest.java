import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HamletParserTest {
    private String hamletText;
    private HamletParser hamletParser;

    @Before
    public void setUp() {
        this.hamletParser = new HamletParser();
        this.hamletText = hamletParser.getHamletData();
    }

    @Test
    public void testChangeHamletToLeon()
    {
        String input = "The story of HAMLET!  Starring James as Hamlet.";
        String expected = "The story of LEON!  Starring James as Leon.";

        String actual = hamletParser.changeHamletToLeon(input);

        assertEquals(expected, actual);
    }

    @Test
    public void testChangeHoratioToTariq()
    {
        String input = "Co-starring Ian in the role of Horatio.  See HORATIO!  In HALMET!";
        String expected = "Co-starring Ian in the role of Tariq.  See TARIQ!  In HALMET!";

        String actual = hamletParser.changeHoratioToTariq(input);

        assertEquals(expected, actual);
    }

    @Test
    public void testFindHoratio() {
    }

    @Test
    public void testFindHamlet() {
    }

    @Test
    public void readText()
    {
        System.out.println(hamletText);
    }
}