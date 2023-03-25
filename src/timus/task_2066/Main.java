package timus.task_2066;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int min = a + b + c;
        if (a + b - c < min) min = a + b - c;
        if (a - b + c < min) min = a - b + c;
        if (a - b - c < min) min = a - b - c;
        if (a - b + c < min) min = a - b + c;
        if (a - b * c < min) min = a - b * c;
        if (a * b * c < min) min = a * b * c;
        if (a * b + c < min) min = a * b + c;
        if (a * b - c < min) min = a * b - c;
        System.out.println(min);
    }
}
