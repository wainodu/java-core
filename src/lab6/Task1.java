package lab6;

import java.util.Arrays;

public class Task1 {
    public static int[] filterEvenNumbers(int[] numbers) {
        return Arrays.stream(numbers)
                .filter(n -> n % 2 == 0)
                .toArray();
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] evenNumbers = filterEvenNumbers(numbers);
        System.out.println(Arrays.toString(evenNumbers));
    }
}
