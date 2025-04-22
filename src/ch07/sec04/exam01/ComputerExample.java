package ch07.sec04.exam01;

public class ComputerExample {
    public static void main(String[] args) {
        Computer comp = new Computer();
        Calculator calc = new Calculator();

        System.out.println(comp.areaCircle(1));
        System.out.println(calc.areaCircle(1));
    }
}
