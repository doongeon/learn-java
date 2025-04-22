package ch06.sec07.exam02;

public class KoreanExample {
    public static void main(String[] args) {
        Korean[] koreans = new Korean[2];

        koreans[0] = new Korean("박자바", "123");
        koreans[1] = new Korean("김자바", "345");

        for(int i = 0; i < koreans.length; i++) {
            System.out.println("k" + (i + 1) + ".nation: " + koreans[i].nation );
            System.out.println("k" + (i + 1) + ".name: " + koreans[i].name );
            System.out.println("k" + (i + 1) + ".ssn: " + koreans[i].ssn );
            System.out.println();
        }
    }
}
