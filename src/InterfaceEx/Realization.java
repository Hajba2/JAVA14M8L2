package InterfaceEx;

public class Realization implements IntB, IntA {

    @Override
    public void method() {
        System.out.println("custom realization");
    }

    public static void main(String[] args) {
        Realization realization = new Realization();
        realization.method();
    }
}
