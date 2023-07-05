package InterfaceEx.problemOne;

import InterfaceEx.AbstractClass;
import InterfaceEx.IntB;

public class ProblemOne extends AbstractClass implements IntB {

//    public void method() {
//        System.out.println("ProblemOne realization");
//    }

    public static void main(String[] args) {
        ProblemOne problemOne = new ProblemOne();
        problemOne.method();
    }
}
