package software.daveturner.primitives;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class LongPrimitive {

    static long myLong = 5;
    static long myLong2 = 5l;
    static long myLong3 = 5L;
    static long myLong4 = 5;
    // static long _long = 9999999999999; will not compile
    static long _long = 9999999999999L;

    @Test
    public void ensureLongVarIsTypeLong() throws NoSuchFieldException {
        assertEquals("long", LongPrimitive.class.getDeclaredField("myLong").getType().toString());
        assertEquals("long", LongPrimitive.class.getDeclaredField("myLong2").getType().toString());
        assertEquals("long", LongPrimitive.class.getDeclaredField("myLong3").getType().toString());
        assertEquals("long", LongPrimitive.class.getDeclaredField("myLong4").getType().toString());
    }

    @Test
    public void demoteLongToInt() {
        long x = 80;
        //  int y = x; will not compile
        int y = (int) x;
        assertEquals(x, y);
    }

    @Test
    public void demoteTooLargeLongToInt() {
         //  int y = x; will not compile
        int y = (int) _long;
        assertFalse(_long == y);
        assertFalse(String.valueOf(_long).equals(String.valueOf(y)));
    }

    @Test
    public void promoteIntToLong() {
        int y = 50;
        // long z = y + 9999999999999; will not compile, needs "l" appended to variable
        long z = y + 9999999999999l;
        assertEquals(y, z);
    }
}
