package timus.task_1820;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a = n / k;
        int b = n % k;
        System.out.println(2 * a + 2 * b);
    }
}
