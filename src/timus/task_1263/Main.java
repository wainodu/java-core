package timus.task_1263;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = 0;
        }
        for (int i = 0; i < m; i++) {
            int a = in.nextInt();
            nums[a - 1]++;
        }
        for (int i = 0; i < n; i++) {
            double x = 100 * nums[i] / m;
            String roundOff = String.format("%.2f", x);
            System.out.println(roundOff);
        }

    }
}
