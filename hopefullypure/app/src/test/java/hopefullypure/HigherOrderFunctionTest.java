package hopefullypure;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HigherOrderFunctionTest extends HigherOrderFunction {
    @Test public void examples() {
        assertEquals(4, (int)square.apply(2));
        assertEquals(triple.apply(2), multiple(3).apply(2));
    }
}
