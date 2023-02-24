package timus.task_1785;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        if (number <= 4) {
            System.out.println("few");
        } else if (number <= 9) {
            System.out.println("several");
        } else if (number <= 19) {
            System.out.println("pack");
        } else if (number <= 49) {
            System.out.println("lots");
        } else if (number <= 99) {
            System.out.println("horde");
        } else if (number <= 249) {
            System.out.println("throng");
        } else if (number <= 499) {
            System.out.println("swarm");
        } else if (number <= 999) {
            System.out.println("zounds");
        } else if (number >= 1000) {
            System.out.println("legion");
        }
    }
}

