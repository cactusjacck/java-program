import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.platform.commons.annotation.Testable;

@Testable
public class CalculonTest {
    @Test
    public void testAdd() {
        // setup
        float x = 5.2f;
        float y = 2.7f;
        float expected = x + y;

        // invoke
        float actual = Calculon_1.add(x, y);

        // anaylze
        //assertEquals(expected, actual, 0.001f);
         assertEquals(expected,actual);
    }

    @Test
    public void testSubtract() {
        // setup
        float x = 5.2f;
        float y = 2.7f;
        float expected = x - y;

        // invoke
        float actual = Calculon_1.subtract(x, y);

        // anaylze
        assertEquals(expected, actual, 0.001f);
    }

    @Test
    public void testMultiply() {
        // setup
        float x = 5.2f;
        float y = 2.7f;
        float expected = x * y;

        // invoke
        float actual = Calculon_1.multiply(x, y);

        // anaylze
        assertEquals(expected, actual, 0.001f);
    }

    @Test
    public void testDivide() {
        // setup
        float x = 5.2f;
        float y = 2.7f;
        float expected = x / y;

        // invoke
        float actual = Calculon_1.divide(x, y);

        // anaylze
        assertEquals(expected, actual, 0.001f);
    }

    @Test
    public void testRaise() {
        // setup
        float x = 2.0f;
        int y = 7;
        float expected = 128.0f;

        // invoke
        float actual = Calculon_1.raise(x, y);

        // anaylze
        assertEquals(expected, actual, 0.001f);
    }
}
