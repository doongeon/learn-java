package ch13.sec03.exam01;

public class GenericExample {
    public static <T> Box<T> boxing(T t) {
        Box<T> b = new Box<>();
        b.set(t);
        return b;
    }

    public static void main(String[] args) {
        Box<Integer> box1 = boxing(100);
        int intValue = box1.get();
        System.out.println(intValue);

        Box<String> box2 = boxing("나동건");
        String strValue = box2.get();
        System.out.println(strValue);
    }
}
