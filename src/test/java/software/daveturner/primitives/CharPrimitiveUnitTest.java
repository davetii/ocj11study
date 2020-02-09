package software.daveturner.primitives;

import org.junit.jupiter.api.Test;

public class CharPrimitiveUnitTest {



    @Test
    public void assignCharFromShort() {
        //char c = Short.MIN_VALUE; // will not compile
        char c = Short.MAX_VALUE;
        System.out.println(c);
    }

    @Test
    public void assignCharFromInt() {
        char c = 65535; // will compile
        //char c = 65536; // will not compile
        c = 0; // will compile
        //c = -1; // will not compile

        int x = -1232;
        c = (char) x;
    }





}

