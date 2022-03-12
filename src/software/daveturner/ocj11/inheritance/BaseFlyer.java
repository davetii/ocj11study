package software.daveturner.ocj11.inheritance;

public class BaseFlyer extends AbstractFlyer{
    public void fly() {
        System.out.println("BaseFlyer fly");
    }

    public void swoop() {
        System.out.println("BaseFlyer swoop");
    }

    public void glide() {
        System.out.println("BaseFlyer glide");
    };
}
