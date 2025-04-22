package ch06.sec09;

public class Car {
    String model;
    int speed;

    Car(String model) {
        this.model = model;
    }

    void setSpeed(int speed) {
        this.speed = speed;
    }

    int getSpeed() {
        return this.speed;
    }

    void run() {
        System.out.print(this.model + "가 달립니다.");
        System.out.print("(시속:" + this.speed + "km/h)\n");
    }
}
