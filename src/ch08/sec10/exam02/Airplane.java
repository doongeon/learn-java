package ch08.sec10.exam02;

public class Airplane implements Vehicle {
    @Override
    public void run() {
        System.out.println("Airplane is flying");
    }

    void checkFare() {
        System.out.println("checking airfare");
    }
}
