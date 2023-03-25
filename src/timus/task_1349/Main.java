package timus.task_1349;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n > 2) {
            System.out.println(-1);
        }
        if (n == 0) {
            System.out.println(-1);
        }
        if (n == 1) {
            System.out.println(1 + " " + 2 + " " + 3);
        }
        if (n == 2) {
            System.out.println(3 + " " + 4 + " " + 5);
        }
    }
}
