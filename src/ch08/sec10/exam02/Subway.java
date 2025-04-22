package ch08.sec10.exam02;

public class Subway implements Vehicle {
    @Override
    public void run() {
        System.out.println("Subway is running.");
    }

    public void checkFare() {
        System.out.println("checking subway fare.");
    }
}
