package software.daveturner.ocj11;

public class InhertianceTest {

    class Parent {
        Parent() {
            this(2);
            System.out.println(3);
        }
        Parent(int i) {
            System.out.println(i);
        }
    }

    class Child extends Parent {
        Child() {
            this(4);
            System.out.println(1);
        }

        Child(int i) {
            System.out.println(i);
        }
    }

    public void test() {
        Child c = new Child(4);
    }

    public static void main(String[] args) {
        InhertianceTest t = new InhertianceTest();
        t.test();
    }
}
