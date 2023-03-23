package lab2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.print("Введите количество строк массива:");
        int lines = id.nextInt();
        System.out.print("Введите количество столбцов массива:");
        int columns = id.nextInt();
        int[][] nums = new int[lines][columns];
        int number = 0;
        for (int control = 0; control < lines; control++) {
            if (control % 2 == 0) {
                for (int i = 0; i < columns; i++) {
                    nums[control][i] = number;
                    number++;
                }
            } else {
                for (int i = columns - 1; i > -1; i--) {
                    nums[control][i] = number;
                    number++;
                }
            }
        }
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.printf(String.valueOf(nums[i][j]) + " ");
            }
            System.out.println("\n");
        }
    }
}