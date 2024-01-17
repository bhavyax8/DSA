package strings;

import java.util.Scanner;

public class compression {
    static Scanner sc = new Scanner(System.in);

    public static void String(String s) {
        int n = s.length();
        String str = "" + s.charAt(0);

        for (int i = 1; i < n; i++) {
            char prev = s.charAt(i - 1);
            char curr = s.charAt(i);
            if (prev != curr) {
                str += curr;
            }

        }
        System.out.println(str);
    }

    public static void String2(String s) {
        int n = s.length();
        String str = "" + s.charAt(0);
        int count = 1;
        for (int i = 1; i < n; i++) {
            char prev = s.charAt(i - 1);
            char curr = s.charAt(i);
            if (prev == curr) {
                count++;
            } else {
                if (count > 1) {
                    str += count;
                    count = 1;
                }
                str += curr;
            }

        }
        if (count > 1) {
            str += count;
        }
        System.out.println(str);
    }

    public static void main(String[] args) {
        String2("aaabbhhhhbcdeff");
    }
}
