package ch15.sec02.exam01;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Board> l = new LinkedList<>();

        for(int i = 0; i < 5; i++) {
            Board b = new Board();
            b.setContent("content" + i);
            b.setSubject("subject" + i);
            b.setWriter("Na");
            l.add(b);
        }

        System.out.println(l.size());
        System.out.println();

        System.out.println(l.get(2));
        System.out.println();


        for(int i = 0; i < l.size(); i++) {
            System.out.println(l.get(i));
        }
        System.out.println();


        l.remove(2);
        l.remove(2);

        for(Board b : l) {
            System.out.println(b);
        }

    }
}
