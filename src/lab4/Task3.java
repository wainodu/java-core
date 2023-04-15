package lab4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task3 {
    static Scanner scanner = new Scanner(System.in);
    static byte sum = 0;

    public static void main(String[] args) {
        try {
            System.out.println("Введите число элементов массива: ");
            int number = scanner.nextInt();
            byte[] array = new byte[number];
            for (int i = 0; i < number; i++) {
                System.out.println("Введите элемент массива: ");
                byte element = scanner.nextByte();
                array[i] = element;
            }
            for (int i : array) {
                sum += i;
            }
            System.out.println(sum);
        } catch (
                InputMismatchException e) {
            System.out.println("строка вместо числа");
        } catch (
                NumberFormatException e) {
            System.out.println("несоответствие числового типа данных");
        }
    }
}
