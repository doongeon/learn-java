package ch08.sec12;

public class InstanceofExample {

    public static void main(String[] args) {
        Taxi t = new Taxi();
        Bus b = new Bus();

        ride(t);
        System.out.println();
        ride(b);
    }

    public static void ride(Vehicle v) {
        if(v instanceof Bus) {
            ((Bus) v).checkFare();
        }
        v.run();
    }
}
