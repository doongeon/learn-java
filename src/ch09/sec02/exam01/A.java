package ch09.sec02.exam01;

public class A {
    class B {};

    B field = new B();

    public A() {
        B b = new B();
    }

    void setB() {
        B b = new B();
    }
}
