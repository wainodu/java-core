package timus.task_1820;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int x = 2;
        if (n <= k) {
            System.out.print(x);
        } else {

            if (n * 2 % k == 0) {
                System.out.print(n * 2 / k);
            } else {
                System.out.print(n * 2 / k + 1);
            }
        }

    }
}