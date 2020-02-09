package software.daveturner.primitives;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BasicPrimitiveRules {

    int x;
    char c;
    boolean b1;
    @Test
    public void ensureInitRules() {
        int xLocal;
        char cLocal;
        boolean b2;
        //Assertions.assertEquals(x, xLocal); // this will not compile
        // Assertions.assertEquals(b1, b2); neither will this
    }
}
