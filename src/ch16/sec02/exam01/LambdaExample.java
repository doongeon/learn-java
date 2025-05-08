package ch16.sec02.exam01;

public class LambdaExample {
    public static void main(String[] args) {
        Person p = new Person();

        p.action(() -> System.out.println("출근"));
        p.action(() -> {
            System.out.println("코딩중");
            System.out.println("퇴근");
        });
    }
}
