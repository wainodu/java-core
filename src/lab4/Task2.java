package lab4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            System.out.println("Введите количество строк матрицы ");
            int strings = scanner.nextInt();
            System.out.println("Введите количество столбцов матрицы ");
            int columns = scanner.nextInt();
            int[][] matrix = new int[strings][columns];
            for (int i = 0; i < strings; i++) {
                for (int j = 0; j < columns; j++) {
                    System.out.println("Введите элемент матрицы ");
                    int element = scanner.nextInt();
                    matrix[i][j] = element;
                }
            }
            System.out.println("Введите номер столбца ");
            int number = scanner.nextInt();
            for (int i = 0; i < strings; i++) {
                System.out.println(matrix[i][number]);
            }
        } catch (InputMismatchException e) {
            System.out.println("строка вместо числа");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("нет столбца с таким номером");
        }
    }
}
