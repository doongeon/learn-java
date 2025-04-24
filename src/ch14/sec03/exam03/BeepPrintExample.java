package ch14.sec03.exam03;

import java.awt.*;

public class BeepPrintExample {
    public static void main(String[] args) {
        Toolkit tk = Toolkit.getDefaultToolkit();

        Thread t0 = new Thread() {
            @Override
            public void run() {
                for(int i = 0; i < 5; i++) {
                    tk.beep();
                    try {
                        Thread.sleep(500);
                    } catch(InterruptedException e) {
                        System.out.println(e.getMessage());
                    }
                }
            }
        };

        t0.start();

        for(int i = 0; i < 5; i++) {
            System.out.println("ding");
            try {
                Thread.sleep(500);
            } catch(InterruptedException e) {
                System.out.println(e.getMessage());
            }

        }
    }
}
