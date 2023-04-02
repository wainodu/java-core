package lab3;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    static Scanner in = new Scanner(System.in);
    public static int count = 0;
    static int[] array;

    public static class Recursion {
        public static void fillArr() {
            if (count < array.length) {
                System.out.println("Enter number: ");
                int b = in.nextInt();
                array[count] = b;
                count++;
                fillArr();
            } else {
                System.out.println(Arrays.toString(array));
            }

        }
    }

    public static void main(String[] args) {
        System.out.println("Enter array length: ");
        int a = in.nextInt();
        array = new int[a];
        Recursion.fillArr();
    }
}