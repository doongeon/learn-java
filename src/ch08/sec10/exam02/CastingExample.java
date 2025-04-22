package ch08.sec10.exam02;

public class CastingExample {
    public static void main(String[] args) {
        Vehicle v = new Bus();

        v.run();
        System.out.println();

        Bus bus = (Bus) v;
        bus.run();
        bus.checkFare();
        System.out.println();


        v = new Subway();
        v.run();
        System.out.println();

        Subway subway = (Subway) v;
        subway.run();
        subway.checkFare();
        System.out.println();


        v = new Airplane();
        v.run();
        System.out.println();

        Airplane airplane = (Airplane) v;
        airplane.run();
        airplane.checkFare();
    }
}
