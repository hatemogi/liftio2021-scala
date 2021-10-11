package hopefullypure;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class FunctorTest {
    @Test
    public void fmap() {
        assertEquals(Arrays.asList(1, 2, 3), Arrays.asList(1, 2, 3));
    }

}
