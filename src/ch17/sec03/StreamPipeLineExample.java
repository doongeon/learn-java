package ch17.sec03;

import java.util.*;

public class StreamPipeLineExample {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("김", 30),
                new Student("이", 70),
                new Student("박", 50)
        );

        double avg = students.stream().mapToDouble(Student::getScore).average().orElse(0);

        System.out.println("평균: " + avg);
    }
}
