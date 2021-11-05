import org.junit.Rule;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.contrib.java.lang.system.ExpectedSystemExit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Dec2Hex Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>Nov 3, 2021</pre>
 */
public class Dec2HexTest {
    @Rule
    public final ExpectedSystemExit exit = ExpectedSystemExit.none();

    //Dec2Hex dec2hex;

    @Before
    public void before() throws Exception {
        //dec2hex = new Dec2Hex();
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: main(String args[])
     */
    @Test
    public void testWithCorrectInput() {
        Dec2Hex.main(new String[] {"100"});
    }

    @Test
    public void testNoInput() {
        exit.expectSystemExit();
        Dec2Hex.main(new String[]{});
    }

    @Test
    public void testWithNonIntegerInput() {
        exit.expectSystemExit();
        Dec2Hex.main(new String[] {"sometext"});
    }
}
