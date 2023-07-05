package InterfaceEx;

public interface IntB {

    default void method() {
        System.out.println("From B");
    };

}
