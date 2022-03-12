package software.daveturner.ocj11.inheritance;

public abstract class AbstractFlyer implements Fly {
    public abstract void fly();
    public abstract void glide();
    public void swoop() {
        System.out.println("AbstractFlyer swoop");
    }
    public void land() {
        System.out.println("AbstractFlyer land");
    }
}
