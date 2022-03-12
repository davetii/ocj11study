package software.daveturner.ocj11.inheritance;

public interface Fly {

    void fly();
    void glide();
    void swoop();
    void land();
    default void launch() {
        System.out.println("fly interface is launching");
    }

    default void crash() {
        System.out.println("fly interface is crashing");
    }

}
