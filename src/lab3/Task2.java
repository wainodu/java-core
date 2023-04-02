package lab3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        int a;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number to convert to binary: ");
        a = in.nextInt();
        convert(a);

    }

    public static void convert(int num) {
        if (num > 0) {
            convert(num / 2);
            System.out.print(num % 2 + " ");
        }
    }
}
