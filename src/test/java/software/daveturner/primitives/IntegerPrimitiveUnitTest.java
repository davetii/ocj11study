package software.daveturner.primitives;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IntegerPrimitiveUnitTest {

    @Test
    public void ensureUnderScoresAreaEqual() {
        int x1 = 1_234_543;
        int x2 = 1234543;
        Assertions.assertEquals(x1, x2);
    }
}
