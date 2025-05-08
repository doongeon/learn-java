package ch16.sec04;

public class LambdaExample {
    public static void main(String[] args) {
        Person p = new Person();

        p.action((x, y) -> x + y);
        p.action(LambdaExample::sum);
    }

    public static double sum(double x, double y) {
        return (x + y);
    }
}
