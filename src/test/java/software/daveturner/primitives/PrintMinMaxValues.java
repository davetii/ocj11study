package software.daveturner.primitives;

import org.junit.jupiter.api.Test;
import org.junit.platform.commons.util.ReflectionUtils;

public class PrintMinMaxValues {

    private String methodName;

    @Test
    public void printByteMinMAxValues() {
        methodName = new Object(){}.getClass().getEnclosingMethod().getName();
        System.out.println(methodName);
        System.out.println("max: " + Byte.MAX_VALUE);
        System.out.println("min: " + Byte.MIN_VALUE);
    }

    @Test
    public void printShortMinMAxValues() {
        methodName = new Object(){}.getClass().getEnclosingMethod().getName();
        System.out.println(methodName);
        System.out.println("max: " + Short.MAX_VALUE);
        System.out.println("min: " + Short.MIN_VALUE);
    }

    @Test
    public void printIntegerMinMAxValues() {
        methodName = new Object(){}.getClass().getEnclosingMethod().getName();
        System.out.println(methodName);
        System.out.println("max: " + Integer.MAX_VALUE);
        System.out.println("min: " + Integer.MIN_VALUE);
    }

    @Test
    public void printLongMinMAxValues() {
        methodName = new Object(){}.getClass().getEnclosingMethod().getName();
        System.out.println(methodName);
        System.out.println("max: " + Long.MAX_VALUE);
        System.out.println("min: " + Long.MIN_VALUE);
    }

    @Test
    public void printFloatMinMAxValues() {
        methodName = new Object(){}.getClass().getEnclosingMethod().getName();
        System.out.println(methodName);
        System.out.println("max: " + Float.MAX_VALUE);
        System.out.println("min: " + Float.MIN_VALUE);
    }

    @Test
    public void printDoubleMinMAxValues() {
        methodName = new Object(){}.getClass().getEnclosingMethod().getName();
        System.out.println(methodName);
        System.out.println("max: " + Double.MAX_VALUE);
        System.out.println("min: " + Double.MIN_VALUE);
    }

    @Test
    public void printCharMinMaxValues() {
        methodName = new Object(){}.getClass().getEnclosingMethod().getName();
        System.out.println(methodName);
        System.out.println("max: " + Integer.valueOf(Character.MAX_VALUE));
        System.out.println("min: " + Integer.valueOf(Character.MIN_VALUE));
    }
}
