package lab4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    static Scanner scanner = new Scanner(System.in);
    static int counter = 0;
    static int positive_sum = 0;
    static int average = 0;
    static class NoPositiveValue extends Exception
    {
        public NoPositiveValue (String str)
        {
            super(str);
        }
    }

    public static void main(String[] args) {
        try {
            System.out.println("Введите число элементов массива: ");
            int number = scanner.nextInt();
            int[] array = new int[number];
            for (int i = 0; i < number; i++) {
                System.out.println("Введите элемент массива: ");
                int element = scanner.nextInt();
                array[i] = element;
            }
            for (int i : array) {
                if (i > 0) {
                    positive_sum += i;
                    counter += 1;
                }
            }
            average = positive_sum / counter;
            if (counter==0){
                throw new NoPositiveValue("положительные элементы отсутствуют");
            }
        } catch (InputMismatchException e) {
            System.out.println("строка вместо числа");
        } catch (NumberFormatException e) {
            System.out.println("несоответствие числового типа данных");
        } catch (NoPositiveValue e) {
        }
    }
}