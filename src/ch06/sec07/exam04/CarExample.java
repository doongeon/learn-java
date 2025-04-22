package ch06.sec07.exam04;

public class CarExample {
    public static void main(String[] args) {
        Car[] cars = new Car[4];
        cars[0] = new Car();
        cars[1] = new Car("자가용");
        cars[2] = new Car("자가용", "빨강");
        cars[3] = new Car("택시", "검정", 250);

        for(int i = 0; i < cars.length; i++) {
            System.out.println("car" + (i + 1) + ".company: " + cars[i].company );

            if(cars[i].model != null) {
                System.out.println("car" + (i + 1) + ".model: " + cars[i].model );
            };

            if(cars[i].color != null) {
                System.out.println("car" + (i + 1) + ".color: " + cars[i].color );
            };

            if(cars[i].maxSpeed != 0) {
                System.out.println("car" + (i + 1) + ".maxSpeed: " + cars[i].maxSpeed );
            };

            System.out.println();
        }
    }
}
