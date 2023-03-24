package timus.task_1607;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        int check = 1;
        while (check > 0) {
            c -= d;
            check = c - a;
            if (check < 0) {
                break;
            }
            a += b;
            check = c - a;
        }
        System.out.println(a);
    }
}
