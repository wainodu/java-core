package timus.task_1149;

import java.util.Scanner;

public class Main {

    public static void a(int n) {
        for (int i = 1; i <= n; i++) {
            if (i == n) {
                System.out.print("sin(" + i);
            } else {
                if (i % 2 == 1) {
                    System.out.print("sin(" + i + "-");
                } else {
                    System.out.print("sin(" + i + "+");
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(")");
        }
    }

    public static void s(int n) {
        for (int i = 0; i < n - 1; i++) {
            System.out.print("(");
        }
        for (int i = 1; i < n; i++) {
            a(i);
            System.out.print("+" + (n + 1 - i) + ")");
        }
        a(n);
        System.out.print("+1");
    }

    public static void main(String[] args) {
        try {

            Scanner in = new Scanner(System.in);

            int n = in.nextInt();

            s(n);

        } catch (Exception ex) {

            System.out.println(ex);
        }
    }
}
