package oop;

/**
 * Main.
 *
 * @author Ilya_Sukhachev
 */
public class Main {

    public static void main(String[] args) {
        A a = new B();
    }
}

abstract class A {

    A() {
        method();
    }

    abstract void method();
}

class B extends A {

    String str = null;

    public B() {
        str = "str";
    }

    void method() {
        if (str.equals("")) {
            System.out.println(true);
        }
    }

    boolean methodB() {
        if (str.equals("")) {
            return true;
        }
        return false;
    }
}
