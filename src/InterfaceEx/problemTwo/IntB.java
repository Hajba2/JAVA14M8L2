package InterfaceEx.problemTwo;

public interface IntB extends IntA {
    default void method() {
        System.out.println("IntB");
    }
}
