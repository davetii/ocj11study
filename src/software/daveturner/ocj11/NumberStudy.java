package software.daveturner.ocj11;

public class NumberStudy {

    public static void main(String[] args) {
        int binary = 0b101;
        System.out.println("The binary value of 0b101 is: " + binary);
        System.out.println("toBinaryString of the number 20: " + Integer.toBinaryString(20));

        int octal = 0123;
        System.out.println("The octal value of 0123 is: " + octal);
        System.out.println("toOctalString of the number 20: " + Integer.toOctalString(20));

        int hex = 0x0011;
        System.out.println("The hex value of 0x0011 is: " + hex);
        System.out.println("toHexString of the number 20: " + Integer.toHexString(20));

        //intChar i = '1'; this wont compile
        char charWithInt = 100;
        System.out.println("char with the value of 100 is : " + charWithInt); // the c is D and it is the 100th character on the ascii table
        System.out.println("d is the 100th character in the ascii table");

        char unicode  = '\u0042';
        System.out.println("char with the unicode of u0042 is : " + unicode);
        int unicodeInt  = '\u0042';
        System.out.println("int with the unicode of u0042 is : " + unicodeInt);
        System.out.print("is unicode int equal to B? ");
        System.out.print(unicodeInt == 'B');
        System.out.print(" is unicode int equal to 66? ");
        System.out.print(unicodeInt == 66);
        System.out.print("\ncool!! is B equal to 66? ");
        System.out.print('B' == 66);
        System.out.println("\nWhy? because B is the 66th ASCII character");
        System.out.println("Is B equal to hex 0x042 ");
        System.out.print('B' == 0x042); // this is equal becuase B is the 66th ASCII character
        System.out.println("\n");

        // \u0042 stored as a char and as a int results in different output is becuase

        //float f = 1.27e02; wont compile
        float f = 1.27e02f;
        System.out.println("a floar with the value of 1.27e02 is : " + f); // will print 127.0

        System.out.println("\nLets look at number formatting\n");
        byte b1 = 0b0000_0001;
        byte b1_again = 0b001;
        System.out.print("byte 0b0000_0001 is ");
        System.out.print(b1);
        System.out.print(" and so is byte 0b001 ");
        System.out.print(b1 == b1_again);
        System.out.print("\n");
        System.out.print("what about 0b1 ");
        System.out.print(b1 == 0b1);
        System.out.print("\nI assume 1 == 0b1 is ");
        System.out.print(1 == 0b1);
        System.out.print("\n");
        System.out.print("also 1.0 == 1 is ");
        System.out.print(1 == 1.0d);

        int billion = 1_000_000_000;
        System.out.println("a formatted 1_000_000_000 (1 billion) looks like : " + billion);
        int bad_billion = 10_0_0_0_0_0_0_0_0;
        System.out.println("\nwill this compile 10_0_0_0_0_0_0_0_0? " + bad_billion);
        System.out.println("evidently the underscores dont matter");

        char octalChar = 0x0_066;
        System.out.print("\noctal also has a special format 0x0_066 ");
        System.out.print(octalChar);
        System.out.print("\nunderscores do matter a little in the octal example ");
        System.out.print("\n0_x_0_0_6_6 wont compile but 0x0_0_6_6 will ");
        // System.out.print(0_x_0_0_6_6); this wont compile
        System.out.print(0x0_0_6_6);
    }
}
