package software.daveturner.ocj11;

public class StaticClassExample { // modifier statis NOT allowed here

    static class InnerStatic {
        public String field = "InnerStatic is greeting as field ";
        public static String GREET = "InnerStatic is greeting as static";
    }

    public void myGreeting() {
        InnerStatic staticInstance = new InnerStatic();
        System.out.println(staticInstance.field);
    }

    public static void main(String[] args) {
        System.out.println(InnerStatic.GREET);
        StaticClassExample o = new StaticClassExample();
        o.myGreeting();
    }
}
