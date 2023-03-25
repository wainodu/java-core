package timus.task_2001;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int a3 = in.nextInt();
        int a4 = in.nextInt();
        int a5 = in.nextInt();
        int a6 = in.nextInt();
        System.out.println((a1 - a5) + " " + (a2 - a4));
    }
}