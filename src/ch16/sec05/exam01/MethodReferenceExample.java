package ch16.sec05.exam01;

public class MethodReferenceExample {
    public static void main(String[] args) {
        Person p = new Person();

        p.action(Computer::staticMethod);

        Computer comp = new Computer();

        p.action(comp::instanceMethod);
    }
}
