package software.daveturner.primitives;

import org.junit.jupiter.api.Test;

public class CharPrimitiveUnitTest {

    @Test
    public void printMInMAxValues() {
        System.out.println("max: " + Integer.valueOf(Character.MAX_VALUE));
        System.out.println("min: " + Integer.valueOf(Character.MIN_VALUE));
    }

    @Test
    public void assignCharFromShort() {
        //char c = Short.MIN_VALUE; // will not compile
        char c = Short.MAX_VALUE;
        System.out.println(c);
    }

}
