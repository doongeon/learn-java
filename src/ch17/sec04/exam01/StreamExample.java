package ch17.sec04.exam01;

import java.util.*;

public class StreamExample {
    public static void main(String[] args) {
//List 컬렉션 생성
        List<Product> pArr = new ArrayList<>();

        for(int i=1; i<=5; i++) {
            Product product = new Product(i, "상품"+i, "멋진회사", (int)(10000*Math.random()));
            pArr.add(product);
        }

        pArr.forEach(System.out::println);
    }
}
