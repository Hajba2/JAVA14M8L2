package InterfaceEx.problemFour;

public interface Inter {

    void methodA();

    default void methodB() {
        System.out.println("Inter");
    }
}
