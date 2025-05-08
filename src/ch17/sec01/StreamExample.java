package ch17.sec01;

import java.util.*;

public class StreamExample {
    public static void main(String[] args) {
        Set<String> s = new HashSet<>();

        s.add("김");
        s.add("이");
        s.add("박");

        s.forEach(System.out::println);
    }
}
