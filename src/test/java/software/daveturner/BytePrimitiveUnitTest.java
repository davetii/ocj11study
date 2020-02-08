package software.daveturner;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class BytePrimitiveUnitTest {

    byte byte1;
    byte byte2;
    byte newByte;
    short myShort;
    int myInt;
    char chr;

    @Test
    public void assertNumericByte() {
        byte1 = 1;
        byte2 = 2;
        newByte = (byte) (byte1 + byte2);
        assertEquals(newByte, 3);
    }

    @Test
    public void assertAlphaByte() {
        byte1 = '1'; // asci value= 49
        newByte = (byte) (byte1 + byte1);
        assertEquals(98, newByte);
        assertEquals('b', newByte);// b ascii is 98
    }

    @Test
    public void castByteToShort() {
        byte1 = '1';
        myShort = (short) byte1;
        assertEquals(49, myShort);
    }

    @Test
    public void castByteToShortAndAdd() {
        byte1 = '1';
        myShort = (short) (byte1 + byte1);
        assertEquals(98, myShort);
        assertEquals('b', myShort);
    }

    @Test
    public void castByteToInt() {
        byte1 = '1';
        myInt = (int) byte1;
        assertEquals(49, myInt);
        assertEquals('1', myInt);
    }

    @Test
    public void castByteToChar() {
        byte1 = '1';
        chr = (char) byte1;
        assertEquals(49, chr);
        assertEquals('1', chr);
    }

    @Test
    public void castBigByte() {
        byte1 = '~'; //ascii 126
        assertEquals(126, byte1);
    }

    @Test
    public void castByteToCharToString() {
        byte1 = '1';
        chr = (char) byte1;
        String s = Character.toString(chr);
        assertEquals(s, "1");
    }

    @Test
    public void castByteToString() {
        byte1 = '1';
        assertFalse(Byte.toString(byte1).equals("1")); // interesting result
        assertEquals(Byte.toString(byte1), "49");
    }
}


