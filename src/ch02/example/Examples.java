package ch02.example;

public class Examples {
    public static void main(String[] args) {
        int[] scores = {95, 71, 84, 93, 87};
        int sum = 0;
        for(int s : scores) sum += s;
        System.out.println("sum: " + sum);
        System.out.println("mean: " + (double)sum / scores.length);
    }
}
