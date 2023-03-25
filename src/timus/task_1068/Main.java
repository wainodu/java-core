package timus.task_1068;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a = 0;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n > 0) {
            for (int i = 1; i <= n; i++)
                a += i;
            System.out.println(a);
        } else if (n <= 0) {
            for (int i = n; i <= 1; i++)
                a += i;
            System.out.println(a);
        }

    }
}