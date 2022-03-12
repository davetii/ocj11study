package software.daveturner.ocj11;

import java.util.*;

public class ArrayListStudy {

    public static void main(String[] args) {
        var data = new ArrayList<>();
        data.add("String1");
        data.add(1);
        data.add("Another String");
        data.set(1, 25);
        data.remove(2);
        data.set(1, 1000l);
        System.out.println(data);

    }
}
