package software.daveturner.ocj11;

public class FunctionalMethodTest {

    public interface Abacus {
        public int calc(int i, int j);
    }

    public static void main(String[] args) {
        int result= 0;
        Abacus aba = (int i,int j) -> i + j;
        result  = aba.calc(3,4);
        System.out.println(result);
    }
}
