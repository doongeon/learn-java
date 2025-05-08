package ch17.sec04.exam03;

import java.util.*;

public class StreamExample {
    public static int sum;
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();

        for(int i = 1; i <= 100; i++) {
            l.add(i);
        }

        sum = l.stream().mapToInt(e -> e).sum();
        System.out.println("sum: " + sum);
    }
}
