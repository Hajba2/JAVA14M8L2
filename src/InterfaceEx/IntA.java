package InterfaceEx;

public interface IntA {

    default void method() {
        System.out.println("From A");
    };
}
