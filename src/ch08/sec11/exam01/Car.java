package ch08.sec11.exam01;

public class Car {
    Tire t1 = new HankookTire();
    Tire t2 = new HankookTire();

    public void run() {
        t1.roll();
        t2.roll();
    }
}
