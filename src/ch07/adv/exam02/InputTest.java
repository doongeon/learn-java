package ch07.adv.exam02;

public class InputTest {
    public static void main(String[] args) {
        String name = Input.read("이름: ");
        System.out.println("입력값: " + name);
        name = Input.read("이름(홍길동): ", "홍길동");
        System.out.println("입력값: " + name);

        int age = Input.readInt("나이: ");
        System.out.println("입력값: " + age);

        boolean isConfirm = Input.confirm("종료할까요?");
        System.out.println("입력값: " + isConfirm);

        isConfirm = Input.confirm("종료할까요?");
        System.out.println("입력값: " + isConfirm);
    }
}
