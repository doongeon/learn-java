package ch08.sec11.exam01;

public class CarExample {
    public static void main(String[] args) {
        Car c = new Car();

        c.run();

        c.t1 = new KumhoTire();
        c.t2 = new KumhoTire();

        c.run();
    }
}
