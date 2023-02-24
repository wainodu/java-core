package lab1;

import java.util.Scanner;

public class Example14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input number: ");
        int number = in.nextInt();
        int number_1 = number - 1;
        int number_3 = number + 1;
        int sum = number + number_1 + number_3;
        System.out.println("Number - 1 = " + number_1);
        System.out.println("Number = " + number);
        System.out.println("Number + 1 = " + number_3);
        System.out.println("Square of sum of previous numbers: " + Math.pow(sum, 2));
    }
}
