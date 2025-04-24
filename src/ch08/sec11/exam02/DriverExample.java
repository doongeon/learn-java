package ch08.sec11.exam02;

public class DriverExample {
    public static void main(String[] args) {
        Driver d = new Driver();
        Taxi t = new Taxi();
        Bus b = new Bus();

        d.drive(t);
        d.drive(b);
    }
}
