package ch07.adv.exam02;

import java.util.Scanner;

public class Input {
    private static Scanner sc = new Scanner(System.in);

    public static String read(String title) {
        System.out.print(title);
        return sc.nextLine();
    }

    public static String read(String title, String defaultValue) {
        System.out.print(title);
        String str = sc.nextLine();
        return str.isEmpty() ? defaultValue : str;
    }

    public static int readInt(String title) {
        System.out.print(title);
        return Integer.parseInt(sc.nextLine());
    }

    public static boolean confirm(String title, boolean defaultValue) {
        System.out.print(title);

        if(defaultValue) System.out.print(" (Y/n): ");
        else System.out.print(" (y/N): ");

        String ans = sc.nextLine();

        if(ans.equals("Y") || ans.equals("y")) return true;
        if(ans.equals("N") || ans.equals("n")) return false;
        return  defaultValue;
    }

    public static boolean confirm(String title) {
        return confirm(title, true);
    }
}
