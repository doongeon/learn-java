package ch14.sec03.exam02;

import java.awt.*;

public class BeepPrintExample {
    public static void main(String[] args) {
        Runnable beepRun = new Runnable() {
            @Override
            public void run() {
                Toolkit tk = Toolkit.getDefaultToolkit();
                for(int i = 0; i < 5; i++) {
                    tk.beep();
                    if(i == 4) return;
                    try {
                        Thread.sleep(500);
                    } catch(InterruptedException e) {
                        System.out.println(e.getMessage());
                        continue;
                    }
                }
            }
        };

        Thread t1 = new Thread(beepRun);
        t1.start();

        for(int i = 0; i < 5; i++) {
            System.out.println("ding");
            if(i == 4) return;
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
                continue;
            }
        }
    }
}
