package ch14.exam;

public class ThreadExample {
    public static void main(String[] args) {
        MovieThread mt = new MovieThread();
        MusicRunnable mr = new MusicRunnable();

        Thread t0 = new Thread(mr);

        mt.start();
        t0.start();
    }
}
